package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Ellipse;

public class Main extends Application {

	private AnchorPane rootLayout;
	private Stage primaryStage;
	private Ellipse clip;
	@FXML
	private ImageView imageRaw;

	@Override
	public void start(Stage primaryStage) {
		try {

			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("MyClip");
			this.primaryStage.setX(200);
			this.primaryStage.setY(200);
			// BorderPane root = new BorderPane();
			// Scene scene = new Scene(root,400,400);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// primaryStage.setScene(scene);
			primaryStage.show();

			initRootLayout();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	public class SampleController implements Initializable {
//
//	    @FXML
//	    private ImageView imageView;
//
//	    @Override
//	    public void initialize(URL location, ResourceBundle resources) {
//	        File file = new File("src/Box13.jpg");
//	        Image image = new Image(file.toURI().toString());
//	        imageView.setImage(image);
//	    }
//	}
	
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("MyView.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);

			primaryStage.setScene(scene);

			// // Give the controller access to the main app.
			// RootLayoutController controller = loader.getController();
			// controller.setMainApp(this);

//			 clip.centerXProperty().setValue(200);
//			 clip.centerYProperty().setValue(200);
//			 clip.radiusYProperty().setValue(10);
//			 clip.radiusYProperty().setValue(10);

//			clip.centerXProperty().bind(
//					rootLayout.widthProperty().multiply(0.65));
//			clip.centerYProperty().bind(
//					rootLayout.widthProperty().multiply(0.38));
//			clip.radiusXProperty().bind(
//					rootLayout.widthProperty().multiply(0.1));
//			clip.radiusYProperty().bind(
//					rootLayout.heightProperty().multiply(0.1));

//			imageRaw.setClip(clip);
			Image image=new Image(getClass().getResourceAsStream("../images/yo00.png"));
//			Image image = new Image("file:../images/yo00.png");
		    imageRaw = new ImageView();
		    imageRaw.setImage(image);
//		    System.out.println(FrameController.getClass().getResource(
//		    	    "/com/mycompany/myapp/myproject/img/img.jpg").toExternalForm()
//		    	);
			
			imageRaw.setEffect(new GaussianBlur(20));

			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
