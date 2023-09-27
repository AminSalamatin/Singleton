import java.util.ArrayList;

public class Jasper {
	
	 String[] vaatteet = {"Farmarit", "T-paita", "lippis", "kengät"};
	 ArrayList<Tuote> päällä;
	 
	 public String[] getVaatteet() {
		 return vaatteet;
	 }
	 
	 public void laitaPäälle(ArrayList<Tuote> päällä) {
		 this.päällä=päällä;
	 }
	 
	 public void luettelePäällä() {
		System.out.println("Jasperilla on päällä:");
		 for (Tuote vaate : päällä) {
			  System.out.println(vaate.toString());
		}
	 }

}
