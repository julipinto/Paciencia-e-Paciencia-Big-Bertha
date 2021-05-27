package util;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class UIComponentsBigBerta {
  public ArrayList<ListView<String>> UIListFileiras;
  public ArrayList<RadioButton> UIListFromRadioButtons;
  public ArrayList<RadioButton> UIListToRadioButtons;
  public ArrayList<Label> UIFundacoesLabel;

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

  @FXML   public RadioButton toFileira0;
  @FXML   public RadioButton toFileira1;
  @FXML   public RadioButton toFileira2;
  @FXML   public RadioButton toFileira3;
  @FXML   public RadioButton toFileira4;
  @FXML   public RadioButton toFileira5;
  @FXML   public RadioButton toFileira6;
  @FXML   public RadioButton toFileira7;
  @FXML   public RadioButton toFileira8;
  @FXML   public RadioButton toFileira9;
  @FXML   public RadioButton toFileira10;
  @FXML   public RadioButton toFileira11;
  @FXML   public RadioButton toFileira12;
  @FXML   public RadioButton toFileira13;
  @FXML   public RadioButton toFileira14;

  @FXML   public RadioButton toFundacao0;
  @FXML   public RadioButton toFundacao1;
  @FXML   public RadioButton toFundacao2;
  @FXML   public RadioButton toFundacao3;
  @FXML   public RadioButton toFundacao4;
  @FXML   public RadioButton toFundacao5;
  @FXML   public RadioButton toFundacao6;
  @FXML   public RadioButton toFundacao7;
  @FXML   public RadioButton toFundacaoK;

  @FXML   public TextField fromWhich;

  @FXML   public Label qtdCartasRestantes;
  @FXML   public Label proxCartaAComprar;
  @FXML   public Label monte;

  @FXML   public Label fundacao0;
  @FXML   public Label fundacao1;
  @FXML   public Label fundacao2;
  @FXML   public Label fundacao3;
  @FXML   public Label fundacao4;
  @FXML   public Label fundacao5;
  @FXML   public Label fundacao6;
  @FXML   public Label fundacao7;
  @FXML   public Label fundacaoK;
  
  public void initializeAllUIComponents(){
    initializeFileiras();
    initializeFromButtons();
    initializeToButtons();
    initializeLabelFundacoes();
  }

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

  public void initializeToButtons(){
    UIListToRadioButtons = new ArrayList<RadioButton>();
    UIListToRadioButtons.add(toFileira0);
    UIListToRadioButtons.add(toFileira1);
    UIListToRadioButtons.add(toFileira2);
    UIListToRadioButtons.add(toFileira3);
    UIListToRadioButtons.add(toFileira4);
    UIListToRadioButtons.add(toFileira5);
    UIListToRadioButtons.add(toFileira6);
    UIListToRadioButtons.add(toFileira7);
    UIListToRadioButtons.add(toFileira8);
    UIListToRadioButtons.add(toFileira9);
    UIListToRadioButtons.add(toFileira10);
    UIListToRadioButtons.add(toFileira11);
    UIListToRadioButtons.add(toFileira12);
    UIListToRadioButtons.add(toFileira13);
    UIListToRadioButtons.add(toFileira14);

    UIListToRadioButtons.add(toFundacao0);
    UIListToRadioButtons.add(toFundacao1);
    UIListToRadioButtons.add(toFundacao2);
    UIListToRadioButtons.add(toFundacao3);
    UIListToRadioButtons.add(toFundacao4);
    UIListToRadioButtons.add(toFundacao5);
    UIListToRadioButtons.add(toFundacao6);
    UIListToRadioButtons.add(toFundacao7);
    UIListToRadioButtons.add(toFundacaoK);
  }

  public void initializeLabelFundacoes(){
    UIFundacoesLabel = new ArrayList<Label>();
    UIFundacoesLabel.add(fundacao0);
    UIFundacoesLabel.add(fundacao1);
    UIFundacoesLabel.add(fundacao2);
    UIFundacoesLabel.add(fundacao3);
    UIFundacoesLabel.add(fundacao4);
    UIFundacoesLabel.add(fundacao5);
    UIFundacoesLabel.add(fundacao6);
    UIFundacoesLabel.add(fundacao7);
    UIFundacoesLabel.add(fundacaoK);
  }

  
}
