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


class Home {

  var controller = new GameController()

    def StartGame (stage: PrimaryStage) :Unit={
        val scene = new Scene (1000,800){

            content = ListBuffer()


            val background = new Image("background.png")
            

                val backgroundImage = new ImageView(background) {
                     fitWidth = 1000
                    fitHeight = 800
                    x = 0
                    y = 0
                 
                }
        
       
                

                var title = new Text (320,200, "Flyin Doge Challenge")
                title.setFont (Font.font(null, FontWeight.Bold,50))

                var start = new Button("Start Game")
                    start.setFont(Font.font(null,FontWeight.Bold,30))
                    start.layoutX = 410
                    start.layoutY = 600
                    start.setPrefHeight(100)
                    start.setPrefWidth (200)

         

                val doge = new Image ("doge.png") 
                val dogeview = new ImageView(doge){
                    fitWidth = 100
                    fitHeight = 100
                    x = 60
                    y = 350
                }


                start.onMouseClicked = (e: MouseEvent) => {
                    new Game().game(stage)
                    println("Game Started")
                }


      
                var credit = new Text (10,790, "Made for OOP Assignment by Karen Ng Kai En(19043934)")
                credit.setFont (Font.font(null, FontWeight.Bold,10))

               

                
                

            content += backgroundImage
            content += title
            content += start
            content += dogeview
            content += credit
            content += controller.menu.menuBar
          

        }
        stage.setScene(scene)

    }
}

