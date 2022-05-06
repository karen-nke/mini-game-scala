package model 

import scalafx.application.JFXApp
import scalafx.scene.layout._
import scalafx.scene._
import scalafx.scene.control._
import scalafx.scene.control.{Menu, MenuBar, MenuItem, SeparatorMenuItem}
import scalafx.Includes._
import scalafx.scene.input.{KeyCodeCombination, KeyCode, KeyCombination, MouseEvent}
import scalafx.event.ActionEvent
import scalafx.scene.control.Alert
import scalafx.scene.control.Alert.AlertType
import scalafx.scene.media.{Media, MediaPlayer}

import view.main

class MenuBarModel{

    //Adding Menu Bar

    val menuBar = new MenuBar()

    //Setting up Menu and Menu Item
  
    val general = new Menu ("General")
    val home = new MenuItem("Home")
    val quit = new MenuItem("Quit")

    val music = new Menu("Music")
    val mute = new MenuItem("Mute Music")
    val play = new MenuItem("Play Music")

    val volume = new Menu("Volume")
    val volumeup = new MenuItem("Volume Up")
    val volumedown = new MenuItem("Volume Down")
    

    val help = new Menu ("Help")
    val control = new MenuItem("Control")
    val rules = new MenuItem ("Rules")

    val info = new Menu ("Info")
    val about = new MenuItem ("About")


    //Adding Menu Item into Menu 
    //Adding Menu into Menu Bar

    general.items = List(home,music,new SeparatorMenuItem,quit)
    help.items = List(control,rules)
    info.items = List(about)
    music.items= List(mute,play,volume)
    volume.items= List(volumeup, volumedown)


    menuBar.menus = List(general,help,info)
    menuBar.prefWidth = 1000

    //Setting the Key Combination (ShortCut Key) for the menu
 

    quit.accelerator = new KeyCodeCombination(KeyCode.X, KeyCombination.ControlDown)
    control.accelerator = new KeyCodeCombination(KeyCode.C, KeyCombination.ControlDown)
    rules.accelerator = new KeyCodeCombination(KeyCode.R, KeyCombination.ControlDown)
    about.accelerator = new KeyCodeCombination(KeyCode.I,KeyCombination.ControlDown)

    mute.accelerator = new KeyCodeCombination(KeyCode.M,KeyCombination.ControlDown)
    play.accelerator = new KeyCodeCombination(KeyCode.P,KeyCombination.ControlDown)
    volumeup.accelerator = new KeyCodeCombination(KeyCode.Plus,KeyCombination.ControlDown)
    volumedown.accelerator = new KeyCodeCombination(KeyCode.Minus,KeyCombination.ControlDown)



    //Setting the action for each Menu Item

    quit.onAction = (e:ActionEvent) => {
    sys.exit(0)
    println("Game Closed")
    }

 

    control.onAction = (e:ActionEvent) => {

        new Alert(AlertType.Information) {
                    title = "Control"
                    headerText = "Game Information"
                    contentText = "Control \n1. Press and hold space bar to increase the height of doge. \n 2. Release the space bar to drop the doge. \n 3. Press and Released Space Bar simultaneously to make the doge jump."
                    }.showAndWait()

    }

   rules.onAction = (e:ActionEvent) => {

        new Alert(AlertType.Information) {
                    title = "Rules"
                    headerText = "Game Information"
                    contentText = "Rules:\n 1. Pass through the hole between two tube to get 1 point. \n 2. Collect bonus with circle shape to gain extra life and 5 points. \n (Maximum 5 lifes) \n 3. If doge hit the tube, the life will deduct by one. "
                    }.showAndWait()

    }

    about.onAction = (e:ActionEvent) => {

        new Alert(AlertType.Information) {
                    title = "About"
                    headerText = "About this Game"
                    contentText = "Created by Karen Ng Kai En (19043934) for Sunway University Object Oriented Programming Final Assessment"
                    }.showAndWait()

    }

    mute.onAction = (e:ActionEvent) => {
        main.player.pause()
    }

    play.onAction = (e:ActionEvent) => {
        main.player.play()
    }

    volumeup.onAction = (e:ActionEvent) => {
        main.player.volume = 0.8
    }

    volumedown.onAction = (e:ActionEvent) => {
        main.player.volume = 0.3
    }




    


                    

               

 




    


    
}