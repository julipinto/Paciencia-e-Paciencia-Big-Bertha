package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StartBertha extends Application{

  public static void go(){
    launch();
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    // StackPane raiz = new StackPane(); // 4
    // Scene cena = new Scene(raiz, 800, 800); // 8

    // palco.setTitle("Paciência Big Bertha"); // 9
    // palco.setScene(cena); // 10
    // palco.show(); // 
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
    Parent root = fxmlLoader.load();
    Scene tela = new Scene(root);
    
    primaryStage.setTitle("Paciência Big Bertha");
    primaryStage.setScene(tela);
    primaryStage.show();
    
  }
  
}
