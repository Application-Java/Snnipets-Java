package com.codes.JavaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ImageViewJavaFX extends Application{

	 @Override
	    public void start(Stage primaryStage) throws Exception {
	        primaryStage.setTitle("ImageView Experiment 1");

	        FileInputStream input = new FileInputStream("resources/images/logo_euronews.jpg");
	        Image image = new Image(input);
	        ImageView imageView = new ImageView(image);

	        HBox hbox = new HBox(imageView);

	        Scene scene = new Scene(hbox, 1000, 500);
	        primaryStage.setScene(scene);
	        primaryStage.show();

	    }

	    public static void main(String[] args) {
	        Application.launch(args);
	    }

}
