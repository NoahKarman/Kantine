public class Datum {

	private int dag;
	private int maand;
	private int jaar;

	/**
	 * Constructor
	 */
	// TODO
	public Datum (int dag,int maand,int jaar){

		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}

	public Datum (){
		System.out.println();
	}

	public boolean bestaatDatum(int dag, int maand, int jaar) {
		// TODO
		return false;
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
		// TODO
		return "";
	}
}
