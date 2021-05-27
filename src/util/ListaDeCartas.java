package util;

import java.util.ArrayList;

import model.Carta;

public class ListaDeCartas {

  public ArrayList<Carta> cartas;

  public ListaDeCartas(ArrayList<Carta> cartas) {
    this.cartas = cartas;
  }
  
  public ArrayList<Carta> subLista(int fromIndex, int toIndex) {
    ArrayList<Carta> subLista = new ArrayList<Carta>(this.cartas.subList(fromIndex, toIndex + 1));
    return subLista;
  }

  public int indexUltimaCarta(){
    if(!cartas.isEmpty()){
      return cartas.size() -1;
    }
    return 0;
  }

  public boolean isEmpty(){
    return cartas.isEmpty();
  }

  public int size(){
    return cartas.size();
  }
}
