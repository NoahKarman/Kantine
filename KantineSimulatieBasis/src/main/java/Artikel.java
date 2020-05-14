/**
 * Een Artikel klasse
 *
 * @author noahk
 * @date 15/5/2020
 */

public class Artikel {

    private String naam;
    private double prijs;

    /**
     * Artikel constructor
     *
     * @param naam De naam van het artikel
     * @param prijs De prijs van het artikel
     */

    public Artikel (String naam, double prijs) {

        this.naam = naam;
        this.prijs = prijs;
    }

    /**
     * 2e Artikel constructor
     *
     * (parameterloos)
     */

    public Artikel () {

        System.out.println("Constructor called");
    }

    /**
     * Stel de naam van het artikel in
     *
     * @param naam - de naam van het artikel
     */

    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * Stel de prijs van het artikel in
     *
     * @param prijs - de prijs van het artikel
     */

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    /**
     * Vraag de prijs van het artikel op
     *
     * @return - prijs de prijs van het artikel
     */

    public double getPrijs() {
        return prijs;
    }

    /**
     * Vraag de naam van het artikel op
     *
     * @return - de naam van het artikel
     */

    public String getNaam() {
        return naam;
    }

}
