package puodeliai;

import produktai.ProduktuRinkinys;

public class LattePuodelis extends KavosPuodelis {
	public LattePuodelis() {
		this.kavosPavadinimas = "latte";
		this.puodelioProduktai = new ProduktuRinkinys(1, 1, 2, 2);
	}
}
