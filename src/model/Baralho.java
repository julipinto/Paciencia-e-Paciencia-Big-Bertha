package model;

import java.util.ArrayList;

import util.ListaDeCartas;


/**
 * Classe que contém o baralho criado.
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class Baralho extends ListaDeCartas{

    private int quantidadeBaralhos;//quantidade de baralhos presente no jogo

    /**
     * Construtor da classe
     *
     * @param quantidadeBaralhos quantidade da baralhos do jogo
     */
    public Baralho(ArrayList<Carta> baralho, int quantidadeBaralhos) {
        super(baralho);
        this.quantidadeBaralhos = quantidadeBaralhos;
    }

    
    /** 
     * Retorna o baralho
     * 
     * @return ArrayList<Carta>
     */
    public ArrayList<Carta> getBaralho(){
        return this.cartas;
    }

    
    /** 
     * Retorna a quantidade de baralhos do jogo
     * 
     * @return int
     */
    public int getQuantidadeBaralhos() {
        return quantidadeBaralhos;
    }

}