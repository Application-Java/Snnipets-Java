package com.codes.JavaFx;

import java.io.FileInputStream; 
import java.io.FileNotFoundException;



import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.image.Image;  
import javafx.scene.image.ImageView; 
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class DisplayImagesJavaFx extends Application {
	
	 

	 @Override 
	   public void start(Stage stage) throws FileNotFoundException {  
		 
		 
		
		 
	      //Creating an image 
	      Image image1 = new Image(new FileInputStream("resources/images/logo_euronews.jpg"));  
	      
	      //Setting the image view 1 
	      ImageView imageView1 = new ImageView(image1); 
	      
	      //Setting the position of the image 
	      imageView1.setX(50); 
	      imageView1.setY(25); 
	      
	      //setting the fit height and width of the image view 
	      imageView1.setFitHeight(100); 
	      imageView1.setFitWidth(100);         
	      
	      //Setting the preserve ratio of the image view 
	      imageView1.setPreserveRatio(true); 
	      
	      Image image2 = new Image(new FileInputStream("resources/images/logo_euronews.jpg"));  
	         
	      //Setting the image view 2 
	      ImageView imageView2 = new ImageView(image2);
	      
	      //Setting the position of the image 
	      imageView2.setX(350); 
	      imageView2.setY(25); 
	      
	      //setting the fit height and width of the image view 
	      imageView2.setFitHeight(100); 
	      imageView2.setFitWidth(100);          
	      
	      //Setting the preserve ratio of the image view 
	      imageView2.setPreserveRatio(true); 
	      
	      Image image3 = new Image(new FileInputStream("resources/images/logo_euronews.jpg"));      
	         
	      //Setting the image view 3 
	     // ImageView imageView3 = new ImageView(image3);  
	      
	      ImageView imageView3 = new ImageView();
	      
	      imageView3.setImage(image3);      
	    
	      
	      //Setting the position of the image 
	      imageView3.setX(600); 
	      imageView3.setY(25); 
	      
	      //setting the fit height and width of the image view 
	      imageView3.setFitHeight(100); 
	      imageView3.setFitWidth(100); 
	      
	     
	      
	      
	      //Setting the preserve ratio of the image view 
	      imageView3.setPreserveRatio(true);  
	      
	      String srcImg = "resources/images/test.jpg";
	      
	      
        Image image4 = new Image(new FileInputStream(srcImg));  
	      
	      //Creating the mouse event handler 
	      EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
	         @Override 
	         public void handle(MouseEvent e) { 
	        	 
	        	 System.out.println("Hello World");    
	        	 
	        	 imageView3.setImage(null);       
	          
	        	
	        	// imageView3.setImage(new Image("http://2.bp.blogspot.com/-Ol8pLJcc9oo/TnZY6R8YJ5I/AAAAAAAACSI/YDxcIHCZhy4/s150/duke_44x80.png"));
	        	 
	        	 imageView3.setImage(image4);
	          	
	  	       
	            
	         } 
	      };  
	      //Registering the event filter 
	      imageView3.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);  
	      
	      //Creating a Group object  
	      Group root = new Group(imageView1, imageView2, imageView3);  
	      
	      //Creating a scene object 
	      Scene scene = new Scene(root, 1000, 400);  
	      
	      //Setting title to the Stage 
	      stage.setTitle("Multiple views of an image");  
	      
	      //Adding scene to the stage 
	      stage.setScene(scene);  
	      
	      //Displaying the contents of the stage
	      stage.show(); 
	   }  
	   public static void main(String args[]) { 
	      launch(args); 
	   } 

}
