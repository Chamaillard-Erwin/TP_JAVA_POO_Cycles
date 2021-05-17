
/**
 * Classe abstraite Cycle dont on peut créer avec l'héritage, une instance de type :
 * <ul>
 *     <li>Vélo</li>
 *     <li>Gyro (classe abstraite)</li>
 *     <ul>
 *         <li>Gyropode</li>
 *         <li>Gyroroue</li>
 *     </ul>
 * </ul>
 *
 * @author echamaillard2021
 */

package fr.eni.bo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;


public abstract class Cycle {
    private String marque;
    private String modele;
    private LocalDate dateAchat;
    private int diff;
    protected float tarif;


    /**
     * Constructeur par défaut
     * @param marque : Marque du cycle
     * @param modele : Type de cycle
     * @param dateAchat :Date d'achat du cycle
     */
    public Cycle(String modele, String marque, LocalDate dateAchat, float tarif) {
        this.modele = modele;
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return  this.modele +
                " " + this.marque  +
                " (" + ChronoUnit.YEARS.between(this.dateAchat, LocalDate.now()) +
                "an" + ((ChronoUnit.YEARS.between(this.dateAchat, LocalDate.now()) > 1 ? "s) " : ") "))
                ;
    }


}
