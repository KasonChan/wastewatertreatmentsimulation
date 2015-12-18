package main

import java.awt.Toolkit

import scala.swing.BorderPanel.Position._
import scala.swing._

object Main extends SimpleSwingApplication {

  def top = new MainFrame {
    // Set the app to full screen
    val screenSize = Toolkit.getDefaultToolkit.getScreenSize
    preferredSize = screenSize

    val os = System.getProperty("os.name")

    val textfield: TextField = new TextField()

    val label: Label = new Label(os)

    contents = new BorderPanel() {
      add(textfield, North)
      add(label, South)
    }

    // Create new menu bar
    menuBar = new MenuBar {
      contents += new Menu("File") {
        contents += new MenuItem(Action("Exit") {
          sys.exit(0)
        })
      }
      contents += new Menu("Run")
    }
  }

}