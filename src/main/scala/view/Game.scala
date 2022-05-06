package view
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage

import scalafx.scene.Scene
import scala.util.Random
import scalafx.scene.control.Button
import scalafx.scene.control.MenuBar

import scala.collection.mutable.ListBuffer;

import scalafx.scene.paint.Color
import scalafx.scene.shape.{Circle, Rectangle, Shape}
import scalafx.scene.input.{KeyCode, KeyEvent, MouseEvent}
import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.media.{Media, MediaPlayer}


import scalafx.animation._

class Game {

  var controller = new GameController()
 

  def game(stage: PrimaryStage): Unit = {
    val scene = new Scene(1000, 800) {
      content = new ListBuffer()
      content += controller.model.backgroundImage
      content += controller.model.number
      content += controller.model.dogecenter
      content += controller.model.dogeview
      content += controller.menu.menuBar


        //Setting up space key

      onKeyPressed = (e: KeyEvent) => {
        if (e.code == KeyCode.Space) controller.model.spacePressed = true

      }

      onKeyReleased = (e: KeyEvent) => {
        if (e.code == KeyCode.Space) controller.model.spacePressed = false

      }


      //Setting the animation

      var gameplay: AnimationTimer = AnimationTimer(t => {

        if (controller.model.wallviewlist.length > 0) {
          for (view <- controller.model.wallviewlist) {
            if (!content.contains(view)) {
              content += view
            }
          }
        }
      
        if (controller.model.timer > 0) {
          controller.model.second =
            (t - controller.model.timer) / 1e9 // as double
          controller.model.dogecenterX =
            controller.model.dogecenter.centerX.value
          controller.model.dogecenterY =
            controller.model.dogecenter.centerY.value
          controller.model.dogeInitialX = controller.model.dogeview.x.value
          controller.model.dogeInitialY = controller.model.dogeview.y.value

          def jump(): Unit ={

            if (controller.model.spacePressed) {
            controller.model.dogecenter.centerY =
              controller.model.dogecenter.centerY.value - 100 * controller.model.time
            controller.model.dogeview.y =
              controller.model.dogeview.y.value - 100 * controller.model.time
            controller.model.dogecenter.centerX =
              controller.model.dogecenter.centerX.value + 30 * controller.model.time
            controller.model.dogeview.x =
              controller.model.dogeview.x.value + 30 * controller.model.time  
          }

          if (!controller.model.spacePressed) {
            controller.model.on = false
            controller.model.released = true
            controller.model.dogecenter.centerY =
              controller.model.dogecenter.centerY.value + 100 * controller.model.time
            controller.model.dogeview.y =
              controller.model.dogeview.y.value + 100 * controller.model.time
            controller.model.dogecenter.centerX =
              controller.model.dogecenter.centerX.value + 30 * controller.model.time
            controller.model.dogeview.x =
              controller.model.dogeview.x.value + 30 * controller.model.time

          }

          }
          jump()


          // Not allow the doge to fly out or fall out of the window


          if (controller.model.dogecenter.centerY.value > 800) {
            controller.model.dogecenter.centerY =
              controller.model.dogecenter.centerY.value - 50
            controller.model.dogeview.y = controller.model.dogeview.y.value - 50

          }

           if (controller.model.dogecenter.centerY.value < 0) {
            controller.model.dogecenter.centerY =
              controller.model.dogecenter.centerY.value + 50
            controller.model.dogeview.y = controller.model.dogeview.y.value + 50

          }

          //Adding the list of wall made with rectagle to check with the collision of the object with the wall

          if (controller.model.walllist.length > 0) {
            for (wall <- controller.model.walllist) {
              if (!content.contains(wall)) {
                content += wall
              }
            }
          }

          if (controller.model.walllist.length > 0) {
            for (s <- controller.model.walllist) {
              if (controller.model.dogecenter.centerX.value >= s.x.value) {
                controller.model.score = controller.model.score + 1
                controller.model.number.setText(controller.model.score.toString)
                controller.model.walllist -= s
            

              }

              //Intersect Concept From Reference [2]

              if (
                !Shape
                  .intersect(controller.model.dogecenter, s)
                  .boundsInLocal
                  .value
                  .isEmpty
              ) {

                controller.model.walllist -= s
                //content -= s
                println("DOGE HIT")

                if (controller.model.heartlist.length > 0) {
                  content -= controller.model.heartlist(
                    controller.model.heartlist.length - 1
                  )
                  controller.model.heartlist.remove(
                    controller.model.heartlist.length - 1
                  )

                }
              }

            }

          }

          //Adding the list of bonus made with circle, if Doge x value == circle center value, the Doge will get 5 marks and 1 extra life if their life is less than < 3

          if (controller.model.extralist.length > 0) {
            for (bonus <- controller.model.extralist) {
              if (!content.contains(bonus)) {
                content += bonus
              }
            }
          }

          if (controller.model.extralist.length > 0) {
            for (h <- controller.model.extralist) {
              if (
                !Shape.intersect(controller.model.dogecenter, h).boundsInLocal.value.isEmpty
              ) {

                //Adding life to the heartlist, the game start with 3 life but maximum is 5 live

                if (controller.model.heartlist.length == 1) {
                  controller.model.heartlist += controller.model.heartview2

                } else if (controller.model.heartlist.length == 2) {
                  controller.model.heartlist += controller.model.heartview3
                } else if (controller.model.heartlist.length == 3) {
                  controller.model.heartlist += controller.model.heartview4
                } else if (controller.model.heartlist.length == 4) {
                  controller.model.heartlist += controller.model.heartview5
                }

                controller.model.score = controller.model.score + 5
                controller.model.number.setText(controller.model.score.toString)
                content -= h
                controller.model.extralist -= h

              }

            }
          }

          //Adding Doge Heart to the Game

          if (controller.model.heartlist.length > 0) {
            for (heart <- controller.model.heartlist) {
              if (!content.contains(heart)) {
                content += heart
              }
            }
          }

          //If Doge heart had nothing left, stop the game
          if (controller.model.heartlist.length == 0) {
            gameplay.stop
            println("Score: " + controller.model.score)
            new Score2().ScorePage2(stage)

          }

         

          if (controller.model.dogeview.x.value > 1000) {
            gameplay.stop()
           
            new Game2().game2(stage)

          }

        }
        controller.model.timer = t

      })
      gameplay.start

    }
    stage.setScene(scene)

  }

}
