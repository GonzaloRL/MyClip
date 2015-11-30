package application;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import application.Main;

/**
 * The controller for the root layout. The root layout provides the basic
 * application layout containing a menu bar and space where other JavaFX
 * elements can be placed.
 * 
 * @author ernesto
 */
public class OneController {

    // Reference to the main application
    private Main mainApp;

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

	/**
     * Opens a dialog to show birthday statistics.
     */
    public void showSendProfile() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("SendView.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Send Profile");
//            sendStage.initModality(Modality.WINDOW_MODAL);
//            sendStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            sendStage.setScene(scene);



            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Opens a new stage 
     */
    @FXML
    private void handleSend() {
    	showSendProfile();
    }

    /**
     * Closes the application.
     */
    @FXML
    private void handleClose() {
   	        System.exit(0);
    }
    }
