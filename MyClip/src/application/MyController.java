package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *Controlador de la rama OtherStage y unico controlador
 *
 * @author Gonzalo RL
 */
public class MyController {
	
	//not using yet
	@FXML
	private ImageView imageRaw;

    // Reference to the main application
    private Main mainApp;

    /**
     * Es llamado por la aplicación principal para dar una referencia de nuevo a sí mismo
     * 
     * @param mainApp
     */
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

	/**
     * Envia el perfil
     * 
     */
    
    public void showSendProfile() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../view/OtherStage.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Send Profile");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);
            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Metodo que maneja la accion de la imagen en la actividad principal
     * 
     */
    
    @FXML
    private void handleSend() {
    	showSendProfile(); 
    }

    /**
     * Cierra la aplicacion 
     * 
     */
    @FXML
    private void handleClose() {
   	        System.exit(0);
    }
    }
