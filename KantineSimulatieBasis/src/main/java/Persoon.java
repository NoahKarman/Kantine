/**
 * Een Persoon klasse
 * 
 * @author Noah Karman
 * @version 15/5/2020
 * 
 */

public class Persoon {
    
    private int BSN;
    private String Voornaam;
    private String Achternaam;
    private Datum Geboortedatum;
    private char Geslacht;

    /**
     * Constructor voor de klasse Persoon
     * 
     * @param BSN
     * @param Voornaam
     * @param Achternaam
     * @param Geboortedatum
     * @param Geslacht
     */
    public Persoon (int BSN, String Voornaam, String Achternaam, Datum Geboortedatum, char Geslacht) {
        this.BSN = BSN;
        this.Voornaam = Voornaam;
        this.Achternaam = Achternaam;
        this.Geboortedatum = Geboortedatum;
        this.Geslacht = Geslacht;
    }
    









    /**
     * Stel de BSN van de persoon in
     * 
     * @param BSN - De BSN van de persoon
     */
    public void setBSN(int BSN) {
        this.BSN = BSN;
    } 

    /**
     * Stel de voornaam van de persoon in
     * 
     * @param Voornaam = De voornaam van de persoon
     */
    public void setVoornaam (String Voornaam) {
        this.Voornaam = Voornaam;
    }

    /**
     * Stel de achternaam van de persoon in
     * 
     * @param Achternaam
     */
    public void setAchternaam (String Achternaam) {
        this.Achternaam = Achternaam;
    }

    /**
     * Stel de geboortedatum van de persoon in
     *
     *@param Geboortedatum - De geboortedatum van de persoon 
     */
    public void setGeboortedatum (Datum Geboortedatum) {
        this.Geboortedatum = Geboortedatum;
    }

    /**
     * Stel het geslacht van de persoon in
     * 
     * 
     * @param Geslacht - het geslacht van de persoon
     */
    public void setGeslacht (char Geslacht) {
        

        if (Geslacht == M || Geslacht == V) {
            this.Geslacht = Geslacht;
        } else this.Geslacht = O;
        
        
        
    }


	
}