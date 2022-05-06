package view

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.media.{Media, MediaPlayer}


object main extends JFXApp{

    val music = new Media("https://www.mboxdrive.com/back-music.mp3")
   
   
    val player = new MediaPlayer(music){
        volume = 0.3
        cycleCount = 5000
    }
    player.play()

    
    

    stage = new PrimaryStage (){
            title ="Flyin Doge"
            resizable = false

            

        scene = new Scene(1000,800){

        }
        
        
 
    }
    stage.getIcons().add(new Image("doge.png"))
    new Home().StartGame(stage)

   
    

}



