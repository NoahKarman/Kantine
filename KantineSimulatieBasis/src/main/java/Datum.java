package main.java;

/**
 * Een Datum klasse
 *
 * @author Redouan Klick & Noah Karman
 * @version 15/5/2020
 */
public class Datum {

	private int dag;
	private int maand;
	private int jaar;

	/**
	 * Constructor
	 * @param dag - Dag van de maand
	 * @param maand - Maand van het jaar
	 * @param jaar - Jaar getaal tussen 1900 - 2100
	 */
	public Datum (int dag,int maand,int jaar){
	if (bestaatDatum(dag,maand,jaar)){
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	} else {
		this.dag = 0;
		this.maand = 0;
		this.jaar = 0;
	} }


	public Datum (){
		this.dag = getDag();
		this.maand = getMaand();
		this.jaar = getJaar();
	}

	/**
	 *
	 * @param dag - Dag van de maand
	 * @param maand - Maand van het jaar
	 * @param jaar - Jaar getaal tussen 1900 - 2100
	 * @return - De gekozen correcte datum
	 */
	public boolean bestaatDatum(int dag, int maand, int jaar) {

		// schikkeljaarCorrect gebruik je alleen in deze methode dus die plaats je niet boven als een variabelen.
		boolean dagCorrect, maandCorrect , jaarCorrect , schrikkeljaarCorrect;
		// Manden die eindigen op 31 dagen
		switch (maand){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:


				if (dag>=1 && dag <=31){
					dagCorrect = true;
				}else{
					return false;
				}
				break;
			// manden die eindigen op 30 dagen
			case 4:
			case 6:
			case 9:
			case 11:
				if (dag>=1 && dag <=30){
					dagCorrect = true;
				}else{
					return false;
				}
				break;
				// 4 en 400 is well correct , en 100 niet
			// Als het schikkeljaar heeft de maand feb met 29 dagen
			case 2:
				if (jaar % 4 == 0 || jaar % 100!= 0 || jaar % 400 == 0 ){
					schrikkeljaarCorrect = true;
				} else {
					schrikkeljaarCorrect = false;
				}
				if (schrikkeljaarCorrect){
					if (dag >= 1 && dag <= 29 ){
						dagCorrect = true;
					}else{
						return false;
					}}else{
					if (dag >= 1 && dag <= 28){
						dagCorrect = true;
					}else{
						return false;
					}
				}
				break;
		}//end switch
		if (maand >= 1 && maand <= 12 ){
			maandCorrect = true;
		}else{
			return false;
		}
		if (jaar >= 1900 && jaar <= 2100){
			jaarCorrect = true;
		}else{
			return false;
		}
		// Als alle eisen voldoen van het gehele methode dan return die true.
		return true;
	}

	/**
	 * Getter voor Sting weergave van datum
	 *
	 * @return Geboortedatum
	 */
	public int getDag() {
		return dag;
	}

	public void setDag(int dag) {
		this.dag = dag;
	}

	public int getMaand() {
		return maand;
	}

	public void setMaand(int maand) {
		this.maand = maand;
	}

	public int getJaar() {
		return jaar;
	}

	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

	public String getDatumAsString() {
        return setDatumAsString();

	}
	public String setDatumAsString(){
		System.out.println("De Datum is" + dag +"." + maand + "." + jaar);
		return null;
	}

	
}
