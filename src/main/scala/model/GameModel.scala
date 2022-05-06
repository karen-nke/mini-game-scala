package model


import scalafx.scene.text._
import scalafx.scene.control._
import scalafx.scene.paint.Color


import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.shape. {Rectangle,Circle}
import scalafx.scene.control.Button
import scalafx.scene.input._
import javafx.scene.input.MouseEvent

import scalafx.scene.control.Alert
import scalafx.scene.control.Alert.AlertType


import scala.collection.mutable.ListBuffer;


class GameModel {

    var background = new Image("background.png")
        val backgroundImage = new ImageView(background) {
                    fitWidth = 1000
                    fitHeight = 800
                    x = 0
                    y = 0
                 
        }

        var background2 = new Image("background-2.jpg")
        val backgroundImage2 = new ImageView(background2) {
                    fitWidth = 1000
                    fitHeight = 800
                    x = 0
                    y = 0
                 
        }


        //Setting the Scores and the Life

         val heart = new Image ("heart.png")
                val heartview = new ImageView(heart){
                    fitWidth = 50
                    fitHeight = 50
                    x = 10
                    y =30
                }

                
                val heartview2 = new ImageView(heart){
                    fitWidth = 50
                    fitHeight = 50
                    x = 60
                    y =30
                }

              
                val heartview3 = new ImageView(heart){
                    fitWidth = 50
                    fitHeight = 50
                    x = 110
                    y =30
                }

                    val heartview4 = new ImageView(heart){
                    fitWidth = 50
                    fitHeight = 50
                    x = 160
                    y =30
                }

              
                val heartview5 = new ImageView(heart){
                    fitWidth = 50
                    fitHeight = 50
                    x = 210
                    y =30
                }

        
        var heartlist = ListBuffer[ImageView](heartview, heartview2, heartview3)

        //Setting Bonus 
        var bonus = Circle (550,140,10)
        bonus.fill = Color.White

        var bonus2 = Circle (800,700,10)
        bonus2.fill = Color.Grey

        var extralist  = ListBuffer[Circle](bonus,bonus2)
        

        //Setting the Obstacle 

        var wallup = new Image ("top-tube.png")
        var wallupview = new ImageView(wallup){
            fitWidth = 244 
            fitHeight = 500
            x = 120
            y = 0 
        }

         var wallupview2 = new ImageView(wallup){
            fitWidth = 244 
            fitHeight = 320
            x = 320
            y = 0 
        }

         var wallupview3 = new ImageView(wallup){
            fitWidth = 244 
            fitHeight = 400
            x = 600
            y = 0 
        }

        var wallupview4 = new ImageView(wallup){
            fitWidth = 244 
            fitHeight = 600
            x = 800
            y = 0 
        }

        var wallbottom = new Image ("bottom-tube.png")

        var wallbottomview = new ImageView (wallbottom){
            fitWidth = 244
            fitHeight = 500
            x = 130
            y = 650  
        }

           var wallbottomview2 = new ImageView (wallbottom){
            fitWidth = 244
            fitHeight = 500
            x = 320
            y = 450  
        }

           var wallbottomview3 = new ImageView (wallbottom){
            fitWidth = 244
            fitHeight = 500
            x = 550
            y = 500
        }

            var wallbottomview4 = new ImageView (wallbottom){
            fitWidth = 244
            fitHeight = 750
            x = 800
            y = 750
        }

        var wallviewlist = ListBuffer [ImageView] (wallupview, wallupview2,wallupview3,wallupview4,wallbottomview,wallbottomview2,wallbottomview3,wallbottomview4 )

      //Setting Obstacle for Stage2

       var wall2up = new Image ("top-tube.png")
       var wall2upview = new ImageView(wall2up){
            fitWidth = 244 
            fitHeight = 300
            x = 80
            y = 0 
        }

        var wall2upview2 = new ImageView(wall2up){
            fitWidth = 244 
            fitHeight = 650
            x = 250
            y = 0 
        }

         var wall2upview3 = new ImageView(wall2up){
            fitWidth = 244 
            fitHeight = 450
            x = 410
            y = 0 
        }

            var wall2upview4 = new ImageView(wall2up){
            fitWidth = 244 
            fitHeight = 200
            x = 570
            y = 0 
        }

            var wall2upview5 = new ImageView(wall2up){
            fitWidth = 244 
            fitHeight = 500
            x = 750
            y = 0 
        }






        var wall2bottom = new Image ("bottom-tube.png")

        var wall2bottomview = new ImageView (wall2bottom){
            fitWidth = 244
            fitHeight = 500
            x = 80
            y = 400 
        }

        var wall2bottomview2 = new ImageView (wall2bottom){
            fitWidth = 244
            fitHeight = 500
            x = 250
            y = 750 
        }

         var wall2bottomview3 = new ImageView (wall2bottom){
            fitWidth = 244
            fitHeight = 500
            x = 410
            y = 550 
        }


         var wall2bottomview4 = new ImageView (wall2bottom){
            fitWidth = 244
            fitHeight = 500
            x = 570
            y = 300
        }

        var wall2bottomview5 = new ImageView (wall2bottom){
            fitWidth = 244
            fitHeight = 500
            x = 750
            y = 600
        }

        var wallviewlist2 = ListBuffer [ImageView] (wall2upview, wall2bottomview, wall2upview2, wall2bottomview2, wall2upview3, wall2bottomview3,  wall2upview4, wall2bottomview4,  wall2upview5, wall2bottomview5)


      //Setting Rectangle to check for collision

        var wallcenter = Rectangle(225,0,40,500)
        wallcenter.opacity = 0
        var wallcenter2 = Rectangle(240,655,40,410)
        wallcenter2.opacity = 0

        var wallcenter3 = Rectangle(430,0,40,320)
        wallcenter3.opacity = 0
        var wallcenter4 = Rectangle(430,450,40,400)
        wallcenter4.opacity = 0

        var wallcenter5 = Rectangle(710,0,40,400)
        wallcenter5.opacity = 0
        var wallcenter6 = Rectangle(660,500,40,400)
        wallcenter6.opacity = 0

        var wallcenter7 = Rectangle(910,0,40,600)
        wallcenter7.opacity = 0
        var wallcenter8 = Rectangle(910,750,40,200)
        wallcenter8.opacity = 0

 

        
        var walllist = ListBuffer[Rectangle](wallcenter,wallcenter2, wallcenter3, wallcenter4, wallcenter5, wallcenter6, wallcenter7, wallcenter8)


        //Setting Rectangle to check for collision (stage 2)

        var wall2center = Rectangle(180,0,40,300)
        wall2center.opacity = 0

        var wall2center2 = Rectangle(180,400,40,410)
        wall2center2.opacity = 0

        var wall2center3 = Rectangle(350,0,40,650)
        wall2center3.opacity = 0
        var wall2center4 = Rectangle(350,750,40,400)
        wall2center4.opacity = 0

        var wall2center5 = Rectangle(510,0,40,450)
        wall2center5.opacity = 0
        var wall2center6 = Rectangle(510,550,40,400)
        wall2center6.opacity = 0

        var wall2center7 = Rectangle(670,0,40,200)
        wall2center7.opacity = 0
        var wall2center8 = Rectangle(670,300,40,500)
        wall2center8.opacity = 0

        var wall2center9 = Rectangle(850,0,40,500) //(X+160),null,null,fitheight
        wall2center9.opacity = 0
        var wall2center10 = Rectangle(850,600,40,200) //(X+160),y,null,null
        wall2center10.opacity = 0

 

        
        var walllist2 = ListBuffer[Rectangle](wall2center,wall2center2, wall2center3, wall2center4, wall2center5, wall2center6, wall2center7, wall2center8,wall2center9,wall2center10)
        
        
        //Setting Player Score
        var score = 0 
    
        var number = new Text (490,60, score.toString)
        number.setFont(Font.font(30))
        number.fill = Color.White 
        
   

        //Setting the Player

        var dogecenter = Circle (130,400,20)
  

        var doge = new Image ("doge.png")
        var dogeview = new ImageView (doge){
            fitWidth = 100
            fitHeight = 100
            x = 60
            y = 350
  

        }

        //Setting Animation

    
        var spacePressed = false
        var on = true 
        var released = false

        var timer = 0L
        var time = 0.03 //increase x/y value per time stated
        var second = 0.0
        
        var dogecenterY = dogecenter.centerY.value 
        var dogecenterX = dogecenter.centerX.value

        var dogeInitialY = dogeview.x.value 
        var dogeInitialX = dogeview.y.value


             
 

           


       



    
}