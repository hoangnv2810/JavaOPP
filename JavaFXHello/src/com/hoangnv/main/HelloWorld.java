/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangnv.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hn281
 */
public class HelloWorld extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Hello World");
        StackPane root = new StackPane();
        root.getChildren().add(button);
        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.setTitle("JavaFx Hello world");
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
