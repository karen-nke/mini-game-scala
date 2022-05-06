package view
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.image._
import scalafx.scene.text.{FontWeight,_}
import scalafx.stage
import scala.collection.mutable.ListBuffer;
import scalafx.scene.control.Alert
import scalafx.scene.control.Alert.AlertType
import scalafx.scene.control.Button
import scalafx.scene.input.{KeyCode, KeyEvent}
import scalafx.scene.input._
import scalafx.scene.control.MenuBar


class Score2 {

  var controller = new GameController()

    def ScorePage2 (stage: PrimaryStage) :Unit={
        val scene = new Scene (1000,800){

            content = ListBuffer()


            val background = new Image("background.png")
            

                val backgroundImage = new ImageView(background) {
                     fitWidth = 1000
                    fitHeight = 800
                    x = 0
                    y = 0
                 
                }
        
       
                var title = new Text (310,200, "You Lose ! Try Harder !!")
                title.setFont (Font.font(null, FontWeight.Bold,50))

                var thanks = new Text (430,300, "Thanks for Playing")
                thanks.setFont (Font.font(null, FontWeight.Bold,20))

                var start = new Button("Play Again")
                    start.setFont(Font.font(null,FontWeight.Bold,30))
                    start.layoutX = 410
                    start.layoutY = 600
                    start.setPrefHeight(100)
                    start.setPrefWidth (200)

         

                val doge = new Image ("doge.png") 
                val dogeview = new ImageView(doge){
                    fitWidth = 300
                    fitHeight = 300
                    x = 350
                    y = 300
                }

                

                start.onMouseClicked = (e: MouseEvent) => {
                    new Game().game(stage)
                    println("Game Started")
                }


      
                var credit = new Text (10,790, "Made for OOP Assignment by Karen Ng Kai En(19043934)")
                credit.setFont (Font.font(null, FontWeight.Bold,10))

               

                
                

            content += backgroundImage
            content += title 
            content += thanks
            content += start
            content += dogeview
            content += credit
            content += controller.menu.menuBar
          

        }
        stage.setScene(scene)

    }
}

