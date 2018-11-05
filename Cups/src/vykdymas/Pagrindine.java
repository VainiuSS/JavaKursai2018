package vykdymas;

import aparatai.KavosAparatas;
import produktai.ProduktuRinkinys;
import puodeliai.KavosPuodelis;

public class Pagrindine {
	public static void main (String[] args) {
		
		// Pasigaminkime kavos!
		
		// 1 - sukuriame produktus, kuriuos idesime i kavos aparata
		ProduktuRinkinys aparatoProduktai = new ProduktuRinkinys(20, 20, 20, 20);
		
		// 2 - sukuriame kavos aparate ir i ji idedame produktus
		KavosAparatas aparatas = new KavosAparatas(aparatoProduktai);
		
		
		// Gaminames kava siame aparate
		KavosPuodelis cappuccino =  aparatas.gamintiGerima("cappuccino");
		cappuccino.toString();
		
		KavosPuodelis espresso = aparatas.gamintiGerima("espresso");
		espresso.toString();
		
		KavosPuodelis latte = aparatas.gamintiGerima("latte");
		latte.toString();
	}
}
