package model;

import java.util.ArrayList;


/**
 * Classe que contém o baralho criado.
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class Baralho{
    public ArrayList<Carta> baralho;

    private int quantidadeBaralhos;//quantidade de baralhos presente no jogo

    /**
     * Construtor da classe
     *
     * @param quantidadeBaralhos quantidade da baralhos do jogo
     */
    public Baralho(ArrayList<Carta> baralho, int quantidadeBaralhos) {
        this.baralho = baralho;
        this.quantidadeBaralhos = quantidadeBaralhos;
    }

    
    /** 
     * Retorna o baralho
     * 
     * @return ArrayList<Carta>
     */
    public ArrayList<Carta> getBaralho(){
        return this.baralho;
    }

    
    /** 
     * Retorna a quantidade de baralhos do jogo
     * 
     * @return int
     */
    public int getQuantidadeBaralhos() {
        return quantidadeBaralhos;
    }

    public ArrayList<Carta> subLista(int fromIndex, int toIndex) {
      ArrayList<Carta> subLista = new ArrayList<Carta>(this.baralho.subList(fromIndex, toIndex + 1));
      return subLista;
    }
  
    public int indexUltimaCarta(){
      if(!baralho.isEmpty()){
        return baralho.size() -1;
      }
      return 0;
    }
  
    public boolean isEmpty(){
      return baralho.isEmpty();
    }
  
    public int size(){
      return baralho.size();
    }
}