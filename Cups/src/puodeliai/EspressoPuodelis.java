package puodeliai;

import produktai.ProduktuRinkinys;

public class EspressoPuodelis extends KavosPuodelis {
	public EspressoPuodelis() {
		this.kavosPavadinimas = "espresso";
		this.puodelioProduktai = new ProduktuRinkinys(2, 2, 2, 0);
	}
}
