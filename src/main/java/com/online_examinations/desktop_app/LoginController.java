package com.online_examinations.desktop_app;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	
	public void onLoginButtonClick(ActionEvent event) throws Exception {
		System.out.println("hello world");

		Stage stageTheEventSourceNodeBelongs = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new App().getMainScene();
		stageTheEventSourceNodeBelongs.setScene(scene);
		stageTheEventSourceNodeBelongs.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) { }

}
