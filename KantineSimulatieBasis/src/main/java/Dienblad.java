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
    private ArrayList<Artikel> artikelen;
    private Artikel artikel ;
    private Persoon persoon;
    private int totalePrijs;
    private String klant;
    /**
     * Constructor
     * @param totalePrijs - het gehele prijs van alle artikelen op de dienblad
     * @param klant - Het persoon die het dienblad afrekent
     */
    public Dienblad() {
        // method body omitted
        totalePrijs = 0;
    }

    public Dienblad(int totalePrijs ,String klant ){
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
        if (artikel.size() <=0) {
            System.out.println("Je hebt niks op je dienblad");
        }else{
            System.out.println("Op je dienblad heb je" + artikel + "artikelen");
        }
    }

    /**
     * Methode om de totaalprijs van de artikelen op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    public double getTotaalPrijs() {
        // method body omitted
        totalePrijs = prijs;
        return totalePrijs;
    }
}

