
/**
 * Programme permettant d'afficher la dénomination et les tarifs de différents cycles.
 * @author echamaillard2021
 */

package fr.eni.main;

import fr.eni.bo.Cycle;
import fr.eni.bo.Gyropode;
import fr.eni.bo.Gyroroue;
import fr.eni.bo.Velo;

import java.time.LocalDate;

public class Main {

    private static final int TAILLE = 20;

    public static void main(String[] args) {

        Cycle[] tabCycle = new Cycle[TAILLE];

        Cycle laPierre = new Velo("Lapierre speed 400", LocalDate.of(2019, 04, 15), 27, 4.90f);
        Cycle btwin = new Velo("Btwin riverside 900", LocalDate.of(2015, 04, 15), 10, 4.90f);

        Cycle segway = new Gyropode("Segway Ninebot Elite", LocalDate.of(2021, 04, 15), 40, 1.50f, 29.90f);
        Cycle weebot = new Gyropode("Weebot Echo", LocalDate.of(2018, 04, 15), 35, 1.60f, 29.90f);

        Cycle immotion = new Gyroroue("Immotion v8", LocalDate.of(2020, 04, 15), 40, 18.90f);
        Cycle segway02 = new Gyroroue("Segway Nineboot One E+", LocalDate.of(2020, 04, 15), 30, 18.90f);

       tabCycle[0] = laPierre;
        tabCycle[1] = btwin;
        tabCycle[2] = segway;
        tabCycle[3] = weebot;
        tabCycle[4] = immotion;
        tabCycle[5] = segway02;


        for (Cycle cycle : tabCycle) {
            if (cycle != null) {
                System.out.println(cycle.toString());
            }
        }



    }
}
