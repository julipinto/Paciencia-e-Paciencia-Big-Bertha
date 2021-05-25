package controller;

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

    Baralho baralho;

    @FXML
    private HBox estoque;

    @FXML
    private ImageView aComprar;

    @FXML
    private ImageView comprada;

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
    @FXML   private ListView<String> fileira15;


    private void addCarta(Carta carta){
        aComprar.setImage(new Image("../Assets/10C.jpg"));
    }

    @FXML
    void onComprarCarta(ActionEvent event) {
        // Image image = new Image("assets/10C.jpg", 100, 150, true, true);
        // aComprar.setImage(image);
        // ImageView imageV = new ImageView(image);
        // // imageV.maxWidth(100);
        // imageV.setFitWidth(10);
        // listView.maxWidth(10);
        // imageV.setFitHeight(15);

        // listView.getItems().add(new ImageView(image));
        // listView.getItems().add(new ImageView(image));
        // listView.getItems().add(new ImageView(image));
        // listView.child
        for(Carta c: baralho.getBaralho()){
            c.setVisivel(true);
            fileira1.getItems().add(c.toPureString());
        }

    }

    @FXML
    void initialize() {
        baralho = new BaralhoFactory().criarBaralho(2);
        // assert estoque != null : "fx:id=\"estoque\" was not injected: check your FXML file 'layout.fxml'.";
        // assert aComprar != null : "fx:id=\"aComprar\" was not injected: check your FXML file 'layout.fxml'.";
        // assert comprada != null : "fx:id=\"comprada\" was not injected: check your FXML file 'layout.fxml'.";
        // assert listView != null : "fx:id=\"listView\" was not injected: check your FXML file 'layout.fxml'.";

    }

}
