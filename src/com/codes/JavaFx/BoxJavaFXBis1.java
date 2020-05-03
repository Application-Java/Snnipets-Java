/**
 * 
 */
package com.codes.JavaFx;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.shape.DrawMode; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.scene.shape.Box; 
import javafx.scene.control.*; 
import javafx.stage.Stage; 
import javafx.scene.Group; 

/**
 * @author abdel-dev
 *
 */
public class BoxJavaFXBis1 extends Application{

	/**
	 * @param args
	 */
	 // launch the application 
    public void start(Stage stage) 
    { 
        // set title for the stage 
        stage.setTitle("creating box"); 
  
        // create a box 
        Box box = new Box(200.0f, 120.0f, 150.0f); 
        
      
  
        // create a Group 
        Group group = new Group(box); 
  
        // translate the box to a position 
        box.setTranslateX(100); 
        box.setTranslateY(100);        
      
  
        // create a scene 
        Scene scene = new Scene(group, 500, 300); 
  
        // set the scene 
        stage.setScene(scene); 
  
        stage.show(); 
    } 
  
    public static void main(String args[]) 
    { 
        // launch the application 
        launch(args); 
    } 

}
