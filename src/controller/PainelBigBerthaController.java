package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import model.Carta;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class PainelBigBerthaController {

    @FXML
    private HBox estoque;

    @FXML
    private ImageView aComprar;

    @FXML
    private ImageView comprada;

    @FXML
    private ListView<ImageView> listView;

    private void addCarta(Carta carta){
        aComprar.setImage(new Image("../Assets/10C.jpg"));
    }

    @FXML
    void onComprarCarta(ActionEvent event) {
        Image image = new Image("assets/10C.jpg", 100.0, 150.0, true, true);
        // Image image = new Image("assets/10C.jpg",);
        // Image = image2 = new Image()
        aComprar.setImage(image);
        ImageView imageV = new ImageView(image);
        // imageV.maxWidth(100);
        imageV.setFitWidth(10);
        listView.maxWidth(10);
        imageV.setFitHeight(15);

        listView.getItems().add(new ImageView(image));
        listView.getItems().add(new ImageView(image));
        listView.getItems().add(new ImageView(image));
        // listView.child
    }

}
