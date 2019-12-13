package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class BlurCon {

	@FXML
	private Pane mypane;    

/**
 * Permite difuminar la imagen
 */
	@FXML
    public void setblur() {           
             mypane.setEffect(new GaussianBlur(5));

    }
	/**
	 * Permite enfocar la imagen
	 */
	@FXML
    public void setfocus() {           
             mypane.setEffect(new GaussianBlur(0));
    }
	
	@FXML
	private void Close() {
	
	        System.exit(0);
	}
	
	
}
