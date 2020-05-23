package main.java;
import main.java.Artikel;
import main.java.Persoon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.ArrayList;
/**
 * Een Dienblad klasse
 *
 * @author Noah Karman & Redouan Klick
 * @version 15/5/2020
 */
public class Dienblad {
    private ArrayList<Artikel> artikelen = new ArrayList<>();
    private Artikel artikel ;
    private Persoon persoon;
    private int totalePrijs;
    private Persoon klant;

    /**
     * Constructor
     */
    public Dienblad() {

        totalePrijs = 0;
    }
    /**
     * Constructor
     * @param totalePrijs - het gehele prijs van alle artikelen op de dienblad
     * @param klant - Het persoon die het dienblad afrekent
     */
    public Dienblad(int totalePrijs ,Persoon klant ){
        this.totalePrijs = totalePrijs;
        this.klant = klant;
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel - De artikel die op de dienblad terecht komt
     */
    public void voegToe(Artikel artikel) {

        artikelen.add(artikel);
    }

    /**
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen
     */
    public int getAantalArtikelen() {

        return artikelen.size();
    }

    /**
     * Methode om de totaalprijs van de artikelen op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    public double getTotaalPrijs() {
        double totaalprijs = 0;

        for (Artikel artikel : artikelen) {
            totaalprijs += artikel.getPrijs();
        } return totaalprijs;
    }
}

