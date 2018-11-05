package puodeliai;

import produktai.ProduktuRinkinys;

public class CappuccinoPuodelis extends KavosPuodelis {

	public CappuccinoPuodelis() {
		this.kavosPavadinimas = "cappuccino";
		this.puodelioProduktai = new ProduktuRinkinys(1, 2, 2, 1);
	}
}
