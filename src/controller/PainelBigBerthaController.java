package controller;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import util.UIComponentsBigBerta;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class PainelBigBerthaController extends UIComponentsBigBerta{

    private ControllerBigBerta controller;
    public String moveFromId;
    public String moveToId;
    public boolean venceu = false;

    @FXML
    void onFromSelected(ActionEvent event) {
        RadioButton target = (RadioButton) event.getTarget();
        String id = target.getId();
        moveFromId = id;

        if(id.equals("fromMonte")){
            fromWhich.setDisable(true);
            fromWhich.setText("");
        }else{
            fromWhich.setDisable(false);
        }

        for(RadioButton button: UIListFromRadioButtons){
            if(id != button.getId()){
                button.setSelected(false);
            }
        }
    }

    @FXML
    void onToSelected(ActionEvent event) {
        RadioButton target = (RadioButton) event.getTarget();
        String id = target.getId();
        moveToId = id;

        for(RadioButton button: UIListToRadioButtons){
            if(id != button.getId()){
                button.setSelected(false);
            }
        }
    }

    
    @FXML
    void onJogar(ActionEvent event) {
        setWarningWin();
        if(venceu){
            return;
        }

        if(!(moveFromId.equals("") || moveToId.equals(""))){
            String strIndex = fromWhich.getText();
            int index;
    
            try {
                index = Integer.parseInt(strIndex);
            } catch (NumberFormatException e) {
                index = -99;
            }
            
            boolean status = controller.Jogar(moveFromId, moveToId, index);
            warnings.setVisible(!status);

            if(controller.verificaVitoria()) setWarningWin();
        }
        clearSelections();
        renderTela();
        moveFromId = "";
        moveToId = "";
    }

    private void clearSelections(){
        moveFromId = "";
        moveToId = "";
        fromWhich.setText("");

        for(RadioButton button: UIListFromRadioButtons){
            button.setSelected(false);
        }
        for(RadioButton button: UIListToRadioButtons){
            button.setSelected(false);
        }
    }

    public void setWarningWin(){
        warnings.setImage(new Image("assets/PARABENIZACAO.png"));
        warnings.setVisible(true);
        venceu = true;
    }


    @FXML
    void initialize() {
        controller = new ControllerBigBerta();
        initializeAllUIComponents();
        renderTela();
        warnings.setImage(new Image("assets/MOVIMENTO_INVALIDO.png"));
        warnings.setVisible(false);
    }

    public void renderTela(){
        renderFileiras();
        renderMontes();
        renderFundacoes();
    }


    public void renderFileiras(){
        for (int i = 0; i <15; i++){
            ListView<ImageView> lv = UIListFileiras.get(i);
            ArrayList<ImageView> images = new ArrayList<ImageView>();
            for(String path: controller.getPathsFileira(i)){
                Image image = new Image(path);
                images.add(new ImageView(image));
            }

            lv.getItems().setAll(images);
        }
    }

    public void renderMontes(){
        qtdCartasRestantes.setText("(" + controller.getQtdRestanteMonte() + ")");
        monte.setImage(new Image(controller.getURLMonte(1)));
        proxCartaAComprar.setImage(new Image(controller.getURLMonte(2)));
        carta3Monte.setImage(new Image(controller.getURLMonte(3)));
    }

    public void renderFundacoes(){
        ArrayList<String> faces = controller.getURLUltimasFundacoes();
        for (int i = 0; i < 9; i++) {
            // UIFundacoesLabel.get(i).setText(faces.get(i));
            UIFundacoesLabel.get(i).setImage(new Image(faces.get(i)));
        }
        // UIFundacoesLabel.get(8).setText(faces.get(8));
        fundacaoK.setImage(new Image(faces.get(8)));
    }

}