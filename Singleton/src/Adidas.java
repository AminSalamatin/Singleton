import java.util.ArrayList;

public class Adidas implements AbstractFactory {
	
	ArrayList<Tuote> vaatteet = new ArrayList<Tuote>();

	@Override
	public void luoVaate(String tyyppi) {
		vaatteet.add(new Tuote(tyyppi, "adidas"));
		
	}
	
	public ArrayList<Tuote> otaVaatteet() {
		return vaatteet;
	}

}
