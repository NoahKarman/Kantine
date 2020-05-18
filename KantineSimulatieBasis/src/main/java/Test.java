package main.java;

public class Test {
    public Test (){

    }


        public static void main(String[] args) {
            Test testing = new Test();
            testing.week1();
}
public void week1 () {
    // Opdracht 1
    System.out.println("ARTIKELEN");
    Artikel artikel = new Artikel("Flesje water", 1.20);
    Artikel artikel2 = new Artikel("Flesje wijn", 3.10);
    Artikel artikel3 = new Artikel("Flesje bier", 2.50);
    System.out.println(artikel.toString());
    System.out.println(artikel2.toString());
    System.out.println(artikel3.toString());
    // Opdracht 2
    System.out.println("DATUM");
    Datum test = new Datum(22,4,1995);
    Datum test2 = new Datum(33,2,2000); // foutieve dag
    Datum test3 = new Datum(10,13,2000); // foutieve maand
    Datum test4 = new Datum(29,2,2019); // foutief jaar (schrikkeljaar)
    System.out.println(test.getDatumAsString());
    System.out.println(test2.getDatumAsString());
    System.out.println(test3.getDatumAsString());
    System.out.println(test4.getDatumAsString());
    // Opdracht 3
    System.out.println("PERSONEN");
    Persoon anouk = new Persoon(123,"Anouk","Driessen", test, 'v');
    Persoon tim = new Persoon(321,"Tim","Brouwer", new Datum(3,7,1995), 'm');
    Persoon tester = new Persoon(254,"test","tester", test2, 'x');
    System.out.println(anouk.toString());
    System.out.println();
    System.out.println(tim.toString());
    System.out.println();
    System.out.println(tester.toString());
    System.out.println();
// Opdracht 4
    System.out.println("DIENBLAD");
    Dienblad klant = new Dienblad(anouk);
    Dienblad klant2 = new Dienblad(tim);
    klant.voegToe(artikel);
    klant.voegToe(artikel2);
    klant2.voegToe(artikel3);
    klant2.voegToe(artikel);
    System.out.println();
    // Opdracht 5
//    System.out.println("KASSARIJ");
//    KassaRij rij = new KassaRij();
//    System.out.println("Is er een rij: " + rij.erIsEenRij());
//    rij.sluitAchteraan(klant);
//    System.out.println("Is er een rij: " + rij.erIsEenRij());
//    System.out.println(rij.eerstePersoonInRij().getKlant().toString());
//    rij.sluitAchteraan(klant2);
//    System.out.println();
//    // Opdracht 6
//    System.out.println("KASSA");
//    Kassa kassa = new Kassa(rij);
//    System.out.println("Aantal artikelen: " + kassa.getAantalArtikelen());
//    System.out.println("Hoeveelheid: " + kassa.hoeveelheidGeldInKassa());
//    kassa.rekenAf(klant);
//    System.out.println(rij.eerstePersoonInRij().getKlant().toString());
//    kassa.rekenAf(klant2);
//    System.out.println("Aantal artikelen: " + kassa.getAantalArtikelen());
//    System.out.println("Hoeveelheid: " + kassa.hoeveelheidGeldInKassa());
}
}

