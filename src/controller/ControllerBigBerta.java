package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import factory.BaralhoFactory;
import model.Baralho;
import model.Carta;
import model.Pilha;
import model.PilhaEstoque;
import model.PilhaFileira;
import model.PilhaFundacao;
import util.CompararCartas;

public class ControllerBigBerta {
  Baralho baralho;
  public PilhaFileira[] fileiras = new PilhaFileira[15];
  public PilhaFundacao[] fundacoes = new PilhaFundacao[8];
  public PilhaFundacao fundacaoK;
  public PilhaEstoque estoque;
  private Map<String, Pilha> map;

  public ControllerBigBerta() {
    initializeBaralho();
    initializeFileirasEstoqueEFundacoes();
    initializeMap();
  }

  private void initializeBaralho() {
    this.baralho = new BaralhoFactory().criarBaralho(2);
  }

  private void initializeFileirasEstoqueEFundacoes() {
    int from = 0;
    int to = 5;
    for(int i = 0; i < 15; i++){
      ArrayList<Carta> subLista = this.baralho.subLista(from, to);
      fileiras[i] = new PilhaFileira();
      fileiras[i].addCartasDeOutraFileira(subLista);
      from = to + 1;
      to += 6;
    }
    estoque = new PilhaEstoque();
    estoque.addEstoque(this.baralho.subLista(from, this.baralho.indexUltimaCarta()));

    for (int i = 0; i < 8; i++) {
      fundacoes[i] = new PilhaFundacao();
    }

    fundacaoK = new PilhaFundacao();
  }

  private void initializeMap(){
    map = new HashMap<String, Pilha>();
    map.put("fileira0" , fileiras[0]);
    map.put("fileira1" , fileiras[1]);
    map.put("fileira2" , fileiras[2]);
    map.put("fileira3" , fileiras[3]);
    map.put("fileira4" , fileiras[4]);
    map.put("fileira5" , fileiras[5]);
    map.put("fileira6" , fileiras[6]);
    map.put("fileira7" , fileiras[7]);
    map.put("fileira8" , fileiras[8]);
    map.put("fileira9" , fileiras[9]);
    map.put("fileira10", fileiras[10]);
    map.put("fileira11", fileiras[11]);
    map.put("fileira12", fileiras[12]);
    map.put("fileira13", fileiras[13]);
    map.put("fileira14", fileiras[14]);
    
    map.put("fundacao0",fundacoes[0]);
    map.put("fundacao1",fundacoes[1]);
    map.put("fundacao2",fundacoes[2]);
    map.put("fundacao3",fundacoes[3]);
    map.put("fundacao4",fundacoes[4]);
    map.put("fundacao5",fundacoes[5]);
    map.put("fundacao6",fundacoes[6]);
    map.put("fundacao7",fundacoes[7]);

    map.put("fundacaoK",fundacaoK);

    map.put("monte",estoque);
  }

  private String resolveID(String id){
    if(id.contains("fromFileira")){
      return id.replace("fromFileira", "fileira");
    }
    if(id.contains("fromMonte")){
      return "monte";
    }
    if(id.contains("toFundacao")){
      return id.replace("toFundacao", "fundacao");
    }
    if(id.contains("toFileira")){
      return id.replace("toFileira", "fileira");
    }
    return "";
  }

  public boolean Jogar(String from, String to, int qtd){
    from = resolveID(from);
    to = resolveID(to);

    Pilha fromPilha = map.get(from);
    Pilha toPilha = map.get(to);

    if(to.equals("fundacaoK")){
      verificarEmoverToFundacaoK(fromPilha, toPilha);
      return false;
    }
    if(qtd < 1 ){
      verificarEMoverUmaCarta(fromPilha, toPilha);
      return false;
    }
    verificarEMoverVariasCartas(fromPilha, toPilha, qtd);

    return verificaVitoria();
  }

  private void verificarEmoverToFundacaoK(Pilha fromPilha, Pilha toPilha){
    if(fromPilha.getLastCarta().getValor().equals("K")){
      moveOne(fromPilha, toPilha);
    }
  }

  private boolean verificaVitoria(){
    int i = 0;
    for (PilhaFundacao f : fundacoes){
      i+= f.size();
    }
    i+= fundacaoK.size();
    return i == baralho.size();
  }

  
  //Se tiver nenhuma carta na fileira pode mover
  //se tiver nenhuma carta na fundação só pode mover o A
  //Se tiver carta na fileira tem que ser distância 1 e cor alternada
  //Se tiver carta na fundação tem que ser de mesmo naipe e distância 1
  //Se a carta for K só pode mover para a f
  private void verificarEMoverUmaCarta(Pilha fromPilha, Pilha toPilha){
    if(!fromPilha.isEmpty()){
      Carta cartaAMover = fromPilha.getLastCarta();
      if(toPilha.isEmpty()){
        if((toPilha instanceof PilhaFileira) || 
          (toPilha instanceof PilhaFundacao && cartaAMover.getValor().equals("A"))){
          moveOne(fromPilha, toPilha);
        }
      }else{
        Carta cartaAComparar = toPilha.getLastCarta();
        if(
            toPilha instanceof PilhaFileira && 
            CompararCartas.compararPesoECorInvertida(cartaAMover, cartaAComparar)
          ){
            moveOne(fromPilha, toPilha);
        }else if(
            toPilha instanceof PilhaFundacao &&
            CompararCartas.compararPesoEMesmoNaipe(cartaAComparar, cartaAMover) && 
            !cartaAMover.getValor().equals("K")
          ){
            moveOne(fromPilha, toPilha);
        }
      }
    }
  }

  //Se a quantidade for maior que o tamanho de origem não pode mover
  //se a sublista não for de cor alternada e distancia não pode mover
  //Se a ultima carta do destino não for alternada e distancia não pode mover
  // se destino vazio e cor alternada e distancia pode mover
  private void verificarEMoverVariasCartas(Pilha fromPilha, Pilha toPilha, int qtd){
    if((!fromPilha.isEmpty()) && fromPilha.size() >= qtd && toPilha instanceof PilhaFileira){

      int index = fromPilha.size() - qtd;
      if(!verificaCartasAlternadas(fromPilha, index)){
        return;
      }

      if(toPilha.isEmpty()){
        moveVarios(fromPilha, toPilha, index);
        return;
      }

      if(CompararCartas.compararPesoECorInvertida(fromPilha.get(index), toPilha.getLastCarta())){
        moveVarios(fromPilha, toPilha, index);
        return;
      }

    }
  }

  private boolean verificaCartasAlternadas(Pilha pilha, int index){
    for(int i = pilha.getLastIndex(); i < index; i--){
      Carta carta1 = pilha.get(i);
      Carta carta2 = pilha.get(i--);
      if(!CompararCartas.compararPesoECorInvertida(carta1, carta2)){
        return false;
      }
    }
    return true;
  }



  private void moveOne(Pilha fromPilha, Pilha toPilha){
    Carta carta = fromPilha.removerCarta();
    toPilha.addCarta(carta);
  }

  private void moveVarios(Pilha fromPilha, Pilha toPilha, int index){
    List<Carta> cartas = fromPilha.fatiarAPartirDe(index);
    toPilha.addVariasCartas(cartas);
  }

  //Get itens to assembly the UI

  public ArrayList<String> getStringFileiraByIndex(int index){
    ArrayList<String> strCartas = new ArrayList<String>();
    for(Carta c: fileiras[index].getPilha()){
      strCartas.add(c.toPureString());
    }
    return strCartas;
  }

  public String getCartaMonte(){
    try{
      Carta carta = estoque.get(estoque.size() - 1);
      return carta.toPureString();
    }catch(Exception e){
      return "[    ]";
    }
  }

  public String getProxCartaMonte(){
    try{
      Carta carta = estoque.get(estoque.size() - 2);
      return carta.toPureString();
    }catch(Exception e){
      return "[    ]";
    }
  }

  public int getQtdRestanteMonte(){
    return estoque.size();
  }

  public ArrayList<String> getUltimasFundacoes(){
    ArrayList<String> cartas = new ArrayList<String>();

    for(PilhaFundacao f : fundacoes){
      if(f.isEmpty()){
        cartas.add("[    ]");
      }else{
        cartas.add(f.getLastCarta().toPureString());
      }
    }
    if(fundacaoK.isEmpty()){
      cartas.add("[    ]");
    }else{
      cartas.add(fundacaoK.getLastCarta().toPureString());
    }
    
    return cartas;
  }

}
