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
}
