package controller;

import java.util.ArrayList;
import java.util.List;

import factory.BaralhoFactory;
import model.Baralho;
import model.Carta;
import model.PilhaFileira;

public class ControllerBigBerta {
  Baralho baralho;
  public PilhaFileira[] fileiras = new PilhaFileira[15];

  public ControllerBigBerta() {
    initializeBaralho();
    initializeFileiras();
  }

  private void initializeBaralho() {
    this.baralho = new BaralhoFactory().criarBaralho(2);
  }

  private void initializeFileiras() {
    int from = 0;
    int to = 5;
    for(int i = 0; i < 15; i++){
      ArrayList<Carta> subLista = this.baralho.subLista(from, to);
      fileiras[i] = new PilhaFileira();
      fileiras[i].addCartasDeOutraFileira(subLista);
      from = to + 1;
      to += 6;
    }
  }

  public ArrayList<String> getStringFileiraByIndex(int index){
    ArrayList<String> strCartas = new ArrayList<String>();
    for(Carta c: fileiras[index].getPilha()){
      strCartas.add(c.toPureString());
    }
    return strCartas;
  }

}
