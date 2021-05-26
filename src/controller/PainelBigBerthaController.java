package controller;

import java.util.ArrayList;

import factory.BaralhoFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;
import model.Baralho;
import model.Carta;

import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class PainelBigBerthaController {

    private ControllerBigBerta controller;
    private ArrayList<ListView<String>> UIFileiras;

    @FXML
    private HBox estoque;

    @FXML
    private ImageView aComprar;

    @FXML
    private ImageView comprada;

    @FXML   private ListView<String> fileira0;
    @FXML   private ListView<String> fileira1;
    @FXML   private ListView<String> fileira2;
    @FXML   private ListView<String> fileira3;
    @FXML   private ListView<String> fileira4;
    @FXML   private ListView<String> fileira5;
    @FXML   private ListView<String> fileira6;
    @FXML   private ListView<String> fileira7;
    @FXML   private ListView<String> fileira8;
    @FXML   private ListView<String> fileira9;
    @FXML   private ListView<String> fileira10;
    @FXML   private ListView<String> fileira11;
    @FXML   private ListView<String> fileira12;
    @FXML   private ListView<String> fileira13;
    @FXML   private ListView<String> fileira14;

    @FXML
    void onComprarCarta(ActionEvent event) {

    }

    @FXML
    void initialize() {
        controller = new ControllerBigBerta();
        initializeFileiras();

        // assert estoque != null : "fx:id=\"estoque\" was not injected: check your FXML file 'layout.fxml'.";
        // assert aComprar != null : "fx:id=\"aComprar\" was not injected: check your FXML file 'layout.fxml'.";
        // assert comprada != null : "fx:id=\"comprada\" was not injected: check your FXML file 'layout.fxml'.";
        // assert listView != null : "fx:id=\"listView\" was not injected: check your FXML file 'layout.fxml'.";

    }

    private void initializeFileiras(){
        UIFileiras = new ArrayList<ListView<String>>();
        UIFileiras.add(fileira0);
        UIFileiras.add(fileira1);
        UIFileiras.add(fileira2);
        UIFileiras.add(fileira3);
        UIFileiras.add(fileira4);
        UIFileiras.add(fileira5);
        UIFileiras.add(fileira6);
        UIFileiras.add(fileira7);
        UIFileiras.add(fileira8);
        UIFileiras.add(fileira9);
        UIFileiras.add(fileira10);
        UIFileiras.add(fileira11);
        UIFileiras.add(fileira12);
        UIFileiras.add(fileira13);
        UIFileiras.add(fileira14);
        renderFileiras();
    }

    public void renderFileiras(){
        for (int i = 0; i <15; i++){
            ListView<String> lv = UIFileiras.get(i);
            lv.getItems().setAll(controller.getStringFileiraByIndex(i));
        }
    }

    

}

// Image image3 = new Image("assets/Group 3.png");
// Image image4 = new Image("assets/Group 4.png");
// Image image5 = new Image("assets/Group 5.png");
// Image image6 = new Image("assets/Group 6.png");
// fileira14.getItems().add(new ImageView(image3));
// fileira14.getItems().add(new ImageView(image4));
// fileira14.getItems().add(new ImageView(image5));
// fileira14.getItems().add(new ImageView(image6));