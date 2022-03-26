package applicationView;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class accueilController{
	
	@FXML
	private VBox VBox;
	@FXML
	private Button btn_Miage;
	@FXML
	private Button btn_Assri;
	@FXML
	private Button btn_Sea;
	@FXML
	private Button btn_Eeea;
	@FXML
	private Button btn_Parrainage;

	// Event Listener on Button[#btn_Miage].onAction
	@FXML
	public void openMiage(ActionEvent event) {
		// TODO Autogenerated
		try {
			fxml=FXMLLoader.load(getClass().getResource("/applicationView/info.fxml"));
			
			root.getChildren().removeAll();
			root.getChildren().setAll(fxml);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	// Event Listener on Button[#btn_Assri].onAction
	@FXML
	public void openAssri(ActionEvent event) {
		// TODO Autogenerated
		try {
			fxml=FXMLLoader.load(getClass().getResource("/applicationView/info.fxml"));
			
			root.getChildren().removeAll();
			root.getChildren().setAll(fxml);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	// Event Listener on Button[#btn_Sea].onAction
	@FXML
	public void openSea(ActionEvent event) {
		// TODO Autogenerated
		try {
			fxml=FXMLLoader.load(getClass().getResource("/applicationView/info.fxml"));
			
			root.getChildren().removeAll();
			root.getChildren().setAll(fxml);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	// Event Listener on Button[#btn_Eeea].onAction
	@FXML
	public void openEeea(ActionEvent event) {
		// TODO Autogenerated
		try {
			fxml=FXMLLoader.load(getClass().getResource("/applicationView/info.fxml"));
			
			root.getChildren().removeAll();
			root.getChildren().setAll(fxml);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	// Event Listener on Button[#btn_Parrainage].onAction
	@FXML
	public void openParrainage(ActionEvent event) {
		// TODO Autogenerated
		try {
			fxml=FXMLLoader.load(getClass().getResource("/applicationView/accueil.fxml"));
			
			root.getChildren().removeAll();
			root.getChildren().setAll(fxml);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}	
	
	private AnchorPane root;
	private Parent fxml;
	void accueil() {
		try {
			fxml=FXMLLoader.load(getClass().getResource("/applicationView/accueil.fxml"));
			
			root.getChildren().removeAll();
			root.getChildren().setAll(fxml);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
			
	}

}