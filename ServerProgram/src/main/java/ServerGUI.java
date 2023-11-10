//Chris Wood
//Ana Theys
//Server program for word game

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class ServerGUI extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Project 3 server");

		BorderPane root = new BorderPane();
	     
		Scene scene = new Scene(root, 700,700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}