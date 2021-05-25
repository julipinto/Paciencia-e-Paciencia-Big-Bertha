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
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
    Parent root = fxmlLoader.load();
    Scene tela = new Scene(root);
    
    primaryStage.setTitle("Paciência Big Bertha");
    primaryStage.setScene(tela);
    primaryStage.show();
    
  }
  
}
