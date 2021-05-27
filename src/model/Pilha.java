package model;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe abstrata para a criação das pilhas.
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public abstract class Pilha {
    protected List<Carta> pilha;

    public Pilha() {
        this.pilha = new ArrayList<Carta>();
    }
    
    /** 
     * Método que retorna a List de cartas.
     * 
     * @return List<Carta>
     */
    public List<Carta> getPilha() {
        return pilha;
    }

    /** 
     * Método que adiciona uma carta na pilha.
     * 
     * @param carta
     */
    public void addCarta(Carta carta){
        this.pilha.add(carta);
    }

    /** 
     * Método que remove a última carta da pilha, retornando-a.
     * 
     * @return Carta
     */
    public Carta removerCarta(){
        if(!this.pilha.isEmpty()){
            return this.pilha.remove(pilha.size()-1);
        } return null;
    }

    public boolean isEmpty(){
        return this.pilha.isEmpty();
    }

    public Carta getLastCarta(){
        if(!this.pilha.isEmpty()){
            return this.pilha.get(pilha.size() -1);
        } return null;
    }

    public Carta getFirstCarta(){
        if(!this.pilha.isEmpty()){
            return this.pilha.get(0);
        } return null;
    }

    public int getLastIndex(){
        if(!this.pilha.isEmpty()){
            return pilha.size() -1;
        } return -99;
    }

    public int size(){
        return this.pilha.size();
    }

    public Carta get(int index){
        return this.pilha.get(index);
    }

    public ArrayList<Carta> subLista(int fromIndex, int toIndex) {
        ArrayList<Carta> subLista = new ArrayList<Carta>(this.pilha.subList(fromIndex, toIndex + 1));
        return subLista;
    }

    public ArrayList<Carta> fatiarAPartirDe(int fromIndex){
        ArrayList<Carta> fatia = new ArrayList<Carta>(this.pilha.subList(fromIndex, size()));
        this.pilha.subList(fromIndex, size()).clear();
        return fatia;
    }

    public void addVariasCartas(List<Carta> cartas){
        this.pilha.addAll(cartas);
    }


    /** 
     * Método que retorna o toString da pilha.
     * 
     * @return String
     */
    @Override
    public String toString() {
        return pilha.toString();
    }  
}