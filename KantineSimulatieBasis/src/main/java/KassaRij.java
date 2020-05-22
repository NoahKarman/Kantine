package main.java;

import java.util.ArrayList;

/**
 * Een KassaRij klasse
 *
 * @author Redouan Klick & Noah Karman
 * @version 22/5/2020
 */
public class KassaRij {

    private final ArrayList<Dienblad> kassarij;
    private Dienblad klant;

    /**
     * Constructor voor de KassaRij klase
     * @param kassarij - Een arraylist met daarin klanten
     * @param klant -
     */
    public KassaRij(ArrayList<Dienblad> kassarij, Dienblad klant) {
        this.kassarij = kassarij;
        this.klant = klant;
    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant - Een klant
     */
    public void sluitAchteraan(Dienblad klant) {

        kassarij.add(klant);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit de rij verwijderen en retourneren. Als er
     * niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    public Dienblad eerstePersoonInRij() {
        if (!erIsEenRij()) {
            return null;
        } else {
            Dienblad temp = kassarij.get(0);
            kassarij.remove(0);
            return temp;
        }
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {

        if (kassarij.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
