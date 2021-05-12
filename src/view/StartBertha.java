package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StartBertha extends Application{

  public static void go(){
    launch();
  }

  @Override
  public void start(Stage palco) throws Exception {
    StackPane raiz = new StackPane(); // 4
    Label lblMensagem = new Label(); // 5
  
    lblMensagem.setText("Paciência Big Bertha"); // 6
    raiz.getChildren().add(lblMensagem); // 7
  
    Scene cena = new Scene(raiz, 800, 800); // 8
    
    palco.setTitle("Aprendendo JavaFX"); // 9
    palco.setScene(cena); // 10
    palco.show(); // 11
    
  }
  
}
