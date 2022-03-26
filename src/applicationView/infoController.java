package applicationView;

import com.g3.dao.*;
import com.g3.model.Etudiants;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import com.g3.dao.*;
import javafx.scene.control.TableColumn;



public class infoController implements Initializable {
	

	EtudiantsDao hans = new EtudiantsDao();
	Etudiants h = new Etudiants();
	//hans.getAllEtudiants();
	
	List < Etudiants > c = hans.getAllEtudiants();
	@FXML
	    private Button IdQuitter;

	    @FXML
	    private Button IdSupprimer;

	    @FXML
	    private TableColumn<Etudiants, String> NomtblOneLicenceOne;

	    @FXML
	    private TableColumn<Etudiants, String> NomtblThreeLicenceThree;

	    @FXML
	    private TableColumn<Etudiants, String> NomtblTwoLicenceTwo;

	    @FXML
	    private TableColumn<Etudiants, String> PrenomtblOneLicenceOne;

	    @FXML
	    private TableColumn<Etudiants, String> PrenomtblThreeLicenceThree;

	    @FXML
	    private TableColumn<Etudiants, String> PrenomtblTwoLicenceTwo;

	    @FXML
	    private Button idModifier;

	    @FXML
	    private TableView<Etudiants> tblOneLicenceOne;

	    @FXML
	    private TableView<Etudiants> tblThreeLicenceThree;

	    @FXML
	    private TableView<Etudiants> tblTwoLicenceTwo;

	    @FXML
	    void openModifier(ActionEvent event) {

	    }

	    @FXML
	    void openQuitter(ActionEvent event) {

	    }

	    @FXML
	    void openSupprimer(ActionEvent event) {

	    }

	    @FXML
	    void opentblOneLicenceOne(ActionEvent event) {

	    }

	    @FXML
	    void opentblThreeLicenceThree(ActionEvent event) {

	    }

	    @FXML
	    void opentblTwoLicenceTwo(ActionEvent event) {

	    }
	

	
	    private void init(){

			NomtblOneLicenceOne.setCellValueFactory(new PropertyValueFactory<>("noms"));
			PrenomtblOneLicenceOne.setCellValueFactory(new PropertyValueFactory<>("prenoms"));
			
			
			NomtblTwoLicenceTwo.setCellValueFactory(new PropertyValueFactory<>("noms"));
			PrenomtblTwoLicenceTwo.setCellValueFactory(new PropertyValueFactory<>("prenoms"));
			
			NomtblThreeLicenceThree.setCellValueFactory(new PropertyValueFactory<>("noms"));
			PrenomtblThreeLicenceThree.setCellValueFactory(new PropertyValueFactory<>("prenoms"));
		 }
	ObservableList<Etudiants> oblist = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		init();
		EtudiantsDao hans = new EtudiantsDao();
		Etudiants h = new Etudiants();

		tblOneLicenceOne.getItems().setAll(hans.getAllEtudiants());
		tblTwoLicenceTwo.getItems().setAll(hans.getAllEtudiants());
		tblThreeLicenceThree.getItems().setAll(hans.getAllEtudiants());
		
	}

}
