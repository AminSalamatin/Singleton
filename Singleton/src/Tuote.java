
public class Tuote {
	String tyyppi;
	String tehdas;

	//haetaan instanssi
	History history = History.getHistoryInstance();
	
	public Tuote(String tyyppi, String tehdas) {
		this.tyyppi = tyyppi;
		this.tehdas = tehdas;
	}
	
	public String toString() {
		String str = tyyppi+", "+tehdas;
		history.update(str);
		return str;
	}
}
