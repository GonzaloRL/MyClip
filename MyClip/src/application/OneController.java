package application;

import java.io.File;
import javafx.fxml.FXML;
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
     * Closes the application.
     */
    @FXML
    private void handleSend() {
        System.exit(0);
    }
}
