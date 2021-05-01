package util;

import model.Carta;


/**
 * 
 * Classe para comparar as cartas 
 * 
 * @author Adlla Katarine e Daniel Alves
 */
public class ComparacaoCartas {
    Carta carta1, carta2;

    public ComparacaoCartas(Carta carta1, Carta carta2){
        this.carta1 = carta1;
        this.carta2 = carta2;
    }

    /**
     * 
     * Comparar cartas por cores
     * falta mudar isso
     * @return true caso as cores sejam diferentes e de pesos diferentes 
     */
    public boolean ComparacaoCoresDiferentes(){
        //substituir por compareTo
        if(!this.carta1.getCor().equals(this.carta2.getCor()) && this.carta1.getPeso() != this.carta2.getPeso()){
            return true;
        }
        return false;
    }
}
