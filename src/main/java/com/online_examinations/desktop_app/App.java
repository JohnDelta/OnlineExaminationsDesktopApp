package com.online_examinations.desktop_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application
{
	private Stage stage;
    
	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		Scene scene = getLoginScene();
        stage.setScene(scene);
        stage.show();
	}
	
	public Scene getLoginScene() throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		return new Scene(root);
	}
	
	public Scene getMainScene() throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		return new Scene(root);
	}
	
	public static void main( String[] args )
    {
        launch(args);
    }

}
