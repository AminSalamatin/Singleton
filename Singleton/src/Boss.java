import java.util.ArrayList;

public class Boss implements AbstractFactory {
	
	ArrayList<Tuote> vaatteet = new ArrayList<Tuote>();

	@Override
	public void luoVaate(String tyyppi) {
		vaatteet.add(new Tuote(tyyppi, "boss"));
		
	}
	
	public ArrayList<Tuote> otaVaatteet() {
		return vaatteet;
	}

}
