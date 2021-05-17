
/**
 * Classe concrète Vélo qui permet de construire des instance de type Vélo
 * @author echamaillard2021
 */

package fr.eni.bo;

import java.time.LocalDate;

public class Velo extends Cycle{

    private int nbVitesse;

    /**
     * Constructeur de l'instance vélo
     * Constructeur du parent Cycle :
     *  @param marque
     *  @param dateAchat
     *  Attribut de l'instance supplémentaire :
     *  @param nbVitesse
     */
    public Velo(String marque, LocalDate dateAchat, int nbVitesse, float tarif) {
        super("Vélo", marque, dateAchat, tarif);
        this.nbVitesse = nbVitesse;
    }


    @Override
    public String toString() {
        return super.toString() +
                nbVitesse + " vitesses " +
                String.format("%.2f",this.tarif) + " €/heure"
                ;
    }
}
