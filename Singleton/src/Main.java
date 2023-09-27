
public class Main {

	public static void main(String[] args) {
		Jasper jasper = new Jasper();
		
		Adidas adidas = new Adidas();
		Boss boss = new Boss();
		
		
		for(String vaate : jasper.getVaatteet()) {
			adidas.luoVaate(vaate);
			boss.luoVaate(vaate);
		}
		
		jasper.laitaPäälle(adidas.otaVaatteet());
		jasper.luettelePäällä();
		
		jasper.laitaPäälle(boss.otaVaatteet());
		jasper.luettelePäällä();

		System.out.println("Tehtaiden luomat tuotteet:\n"+History.getHistoryInstance().getList());
		
		
	}

}
