
/**
 * Classe abstraite Gyro dont on peut créer avec l'héritage, une instance de type :
 * <ul>
 *     <li>Gyropode</li>
 *     <li>Gyroroue</li>
 * </ul>
 *
 * @author echamaillard2021
 */

package fr.eni.bo;

import java.time.LocalDate;

public abstract class Gyro extends Cycle{

    protected int autonomie;


    /**
     * Constructeur du parent Cycle :
     *  @param marque
     *  @param modele
     *  @param dateAchat
     *  Attribut de Gyro :
     *  @param autonomie
     */
    public Gyro(String modele, String marque, LocalDate dateAchat, int autonomie, float tarif) {
        super(modele, marque, dateAchat, tarif);
        this.autonomie = autonomie;
    }

}
