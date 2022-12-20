package com.calculator_demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("calculator_layout.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.getIcons().addAll(new Image(getClass().getResource("calc_icon.png").toString()));
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 574, 500));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
