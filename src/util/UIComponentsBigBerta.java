package util;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class UIComponentsBigBerta {
  public ArrayList<ListView<String>> UIListFileiras;
  public ArrayList<RadioButton> UIListFromRadioButtons;

  @FXML   public ListView<String> fileira0;
  @FXML   public ListView<String> fileira1;
  @FXML   public ListView<String> fileira2;
  @FXML   public ListView<String> fileira3;
  @FXML   public ListView<String> fileira4;
  @FXML   public ListView<String> fileira5;
  @FXML   public ListView<String> fileira6;
  @FXML   public ListView<String> fileira7;
  @FXML   public ListView<String> fileira8;
  @FXML   public ListView<String> fileira9;
  @FXML   public ListView<String> fileira10;
  @FXML   public ListView<String> fileira11;
  @FXML   public ListView<String> fileira12;
  @FXML   public ListView<String> fileira13;
  @FXML   public ListView<String> fileira14;

  @FXML   public RadioButton fromMonte;
  @FXML   public RadioButton fromFileira0;
  @FXML   public RadioButton fromFileira1;
  @FXML   public RadioButton fromFileira2;
  @FXML   public RadioButton fromFileira3;
  @FXML   public RadioButton fromFileira4;
  @FXML   public RadioButton fromFileira5;
  @FXML   public RadioButton fromFileira6;
  @FXML   public RadioButton fromFileira7;
  @FXML   public RadioButton fromFileira8;
  @FXML   public RadioButton fromFileira9;
  @FXML   public RadioButton fromFileira10;
  @FXML   public RadioButton fromFileira11;
  @FXML   public RadioButton fromFileira12;
  @FXML   public RadioButton fromFileira13;
  @FXML   public RadioButton fromFileira14;

  @FXML   public TextField fromWhich;

  public void initializeFileiras(){
    UIListFileiras = new ArrayList<ListView<String>>();
    UIListFileiras.add(fileira0);
    UIListFileiras.add(fileira1);
    UIListFileiras.add(fileira2);
    UIListFileiras.add(fileira3);
    UIListFileiras.add(fileira4);
    UIListFileiras.add(fileira5);
    UIListFileiras.add(fileira6);
    UIListFileiras.add(fileira7);
    UIListFileiras.add(fileira8);
    UIListFileiras.add(fileira9);
    UIListFileiras.add(fileira10);
    UIListFileiras.add(fileira11);
    UIListFileiras.add(fileira12);
    UIListFileiras.add(fileira13);
    UIListFileiras.add(fileira14);
  }

  public void initializeFromButtons(){
    UIListFromRadioButtons = new ArrayList<RadioButton>();
    UIListFromRadioButtons.add(fromFileira0);
    UIListFromRadioButtons.add(fromFileira1);
    UIListFromRadioButtons.add(fromFileira2);
    UIListFromRadioButtons.add(fromFileira3);
    UIListFromRadioButtons.add(fromFileira4);
    UIListFromRadioButtons.add(fromFileira5);
    UIListFromRadioButtons.add(fromFileira6);
    UIListFromRadioButtons.add(fromFileira7);
    UIListFromRadioButtons.add(fromFileira8);
    UIListFromRadioButtons.add(fromFileira9);
    UIListFromRadioButtons.add(fromFileira10);
    UIListFromRadioButtons.add(fromFileira11);
    UIListFromRadioButtons.add(fromFileira12);
    UIListFromRadioButtons.add(fromFileira13);
    UIListFromRadioButtons.add(fromFileira14);
    UIListFromRadioButtons.add(fromMonte);
  }
  
}
