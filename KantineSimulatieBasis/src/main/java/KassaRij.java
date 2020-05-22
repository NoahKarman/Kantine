import java.util.ArrayList;

public class KassaRij {

    /**
     * Constructor
     */
    private ArrayList<Dienblad> dienbladen;
    private Dienblad klant;

    public KassaRij() {

        this.dienbladen = new ArrayList<>();
    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant - Een klant
     */
    public void sluitAchteraan(Dienblad klant) {

        dienbladen.add(klant);
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
            Dienblad temp = dienbladen.get(0);
            dienbladen.remove(0);
            return temp;
        }
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {

        if (dienbladen.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
