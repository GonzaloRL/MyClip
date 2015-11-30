package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {

	private AnchorPane rootLayout;
	public Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {

			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("My GitHub Profile");
			this.primaryStage.setX(200);
			this.primaryStage.setY(200);
			primaryStage.show();

			initRootLayout();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("MyView.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout, 500, 400);
			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			
	        // Give the controller access to the main app.
	        OneController controller = loader.getController();
	        controller.setMainApp(this);

			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
