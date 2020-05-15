/**
 * Een Persoon klasse
 * 
 * @author Redouan Klick & Noah Karman
 * @version 15/5/2020
 * 
 */

public class Persoon {
    
    private int BSN;
    private String Voornaam;
    private String Achternaam;
    private String Geboortedatum;
    private char Geslacht;

    /**
     * Constructor voor de klasse Persoon
     * 
     * @param BSN - de BSN van de persoon
     * @param voornaam - de voornaam van de persoon
     * @param achternaam - de achternaam van de persoon
     * @param geboortedatum - de geboortedatum van de persoon
     * @param geslacht - het geslacht van de persoon
     */

    public Persoon(int BSN, String voornaam, String achternaam, String geboortedatum, char geslacht) {
        this.BSN = BSN;
        Voornaam = voornaam;
        Achternaam = achternaam;
        Geboortedatum = geboortedatum;
        Geslacht = geslacht;
    }

    public Persoon() {
        this.BSN = 0;
        Voornaam = "";
        Achternaam = "";
        Geboortedatum = "dd/mm/jj";
        Geslacht = 'O';
    }

    /**
     * Stel de BSN van de persoon in
     * @param BSN - De BSN van de persoon
     */
    public void setBSN(int BSN) {

        this.BSN = BSN;
    } 

    /**
     * Stel de voornaam van de persoon in
     * @param Voornaam = De voornaam van de persoon
     */
    public void setVoornaam (String Voornaam) {

        this.Voornaam = Voornaam;
    }

    /**
     * Stel de achternaam van de persoon in
     * @param Achternaam - Achternaam van de persoon
     */
    public void setAchternaam (String Achternaam) {

        this.Achternaam = Achternaam;
    }

    /**
     * Stel de geboortedatum van de persoon in
     *@param Geboortedatum - De geboortedatum van de persoon 
     */
    public void setGeboortedatum (String Geboortedatum) {

        this.Geboortedatum = Geboortedatum;
    }

    /**
     * Stel het geslacht van de persoon in
     * @param Geslacht - het geslacht van de persoon
     */
    public void setGeslacht (char Geslacht) {

        if (Geslacht == ('M'|'V')) {
            this.Geslacht = Geslacht;
        } else this.Geslacht = 'O';
    }

    /**
     * Getter voor BSN
     * @return BSN
     */
    public int getBSN() {
        return BSN;
    }

    /**
     * Getter voor Voornaam
     * @return Voornaam
     */
    public String getVoornaam() {
        return Voornaam;
    }

    /**
     * Getter voor Achternaam
     * @return Achternaam
     */
    public String getAchternaam() {
        return Achternaam;
    }

    /**
     * Getter voor Geboortedatum
     * @return Geboortedatum
     */
    public String getGeboortedatum() {
        return Geboortedatum;
    }

    /**
     * Getter voor Geslacht
     * @return Geslacht
     */
    public String getGeslacht() {

        if (Geslacht == 'M') {
            return "Man";
        } else if (Geslacht == 'V') {
            return "Vrouw";
        } else {
            return "Onbekend";
        }
    }
}