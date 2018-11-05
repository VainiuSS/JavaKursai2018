package aparatai;

import produktai.ProduktuRinkinys;
import puodeliai.CappuccinoPuodelis;
import puodeliai.EspressoPuodelis;
import puodeliai.KavosPuodelis;
import puodeliai.LattePuodelis;

public class KavosAparatas {
	private ProduktuRinkinys aparatoProduktai;
	private int panaudojimuSkaicius;
	private static final int panaudojimuRiba = 10;

	public int getPanaudojimoRiba() {
		return panaudojimuRiba;
	}

	public void setPanaudojimuSkaicius(int panaudojimuSkaicius) {
		this.panaudojimuSkaicius = panaudojimuSkaicius;
	}

	public int getPanaudojimuSkaicius() {
		return this.panaudojimuSkaicius;
	}

	public void setProduktuRinkinys(ProduktuRinkinys produktai) {
		this.aparatoProduktai = produktai;
	}

	public ProduktuRinkinys getProduktuRinkinys() {
		return this.aparatoProduktai;
	}

	public KavosAparatas() {
		// default constructor
	}

	public KavosAparatas(ProduktuRinkinys produktai) {
		this.aparatoProduktai = produktai;
	}

	public KavosPuodelis gamintiGerima(String gerimoTipas) {
		KavosPuodelis gaminamaKava = null; // Kol puodelis nepagamintas, priskiriame null;
		
		if (this.panaudojimuSkaicius < panaudojimuRiba) {
			switch (gerimoTipas) {
			case "espresso":
				EspressoPuodelis espressoPuodelis = new EspressoPuodelis();
				gamintiKava(espressoPuodelis, gerimoTipas);
				
				if(espressoPuodelis.arPagaminta) {
					gaminamaKava = espressoPuodelis;
				}
				
				break;
			case "cappuccino":
				CappuccinoPuodelis cappuccinoPuodelis = new CappuccinoPuodelis();
				gamintiKava(cappuccinoPuodelis, gerimoTipas);
				
				if(cappuccinoPuodelis.arPagaminta) {
					gaminamaKava = cappuccinoPuodelis;
				}
				break;
			case "latte":
				LattePuodelis lattePuodelis = new LattePuodelis();
				gamintiKava(lattePuodelis, gerimoTipas);
				
				if(lattePuodelis.arPagaminta) {
					gaminamaKava = lattePuodelis;
				}
				
				break;
			default:
				System.out.println("Tokio gerimo tipo nerasta.");
			}
		} else {
			System.out.println("Pasiekta panaudojimu riba. Reikia isvalyti aparata pries naudojant toliau.");
		}

		return gaminamaKava;
	}

	public void papildyti(ProduktuRinkinys produktaiPapildymui) {
		aparatoProduktai.vandensKiekis += produktaiPapildymui.vandensKiekis;
		aparatoProduktai.pupeliuKiekis += produktaiPapildymui.pupeliuKiekis;
		aparatoProduktai.cukrausKiekis += produktaiPapildymui.cukrausKiekis;
		aparatoProduktai.pienoKiekis += produktaiPapildymui.pienoKiekis;

		System.out.println("Aparatas buvo sekmingai papildytas.");
	}

	public void plauti() {
		this.panaudojimuSkaicius = 0;
	}

	public void atspausdintiArPasiruoses() {
		StringBuilder pranesimoTekstas = new StringBuilder();

		if (this.panaudojimuSkaicius >= panaudojimuRiba)
			pranesimoTekstas.append("Reikia isvalyti aparata pries naudojant toliau. ");

		if (aparatoProduktai.cukrausKiekis == 0)
			pranesimoTekstas.append("Cukrus pasibaige. ");
		else if (aparatoProduktai.cukrausKiekis < 3)
			pranesimoTekstas.append("Cukrus baigiasi. Kiekis liko: " + aparatoProduktai.cukrausKiekis + ". ");

		if (aparatoProduktai.pupeliuKiekis == 0)
			pranesimoTekstas.append("Pupeles pasibaige. ");
		else if (aparatoProduktai.pupeliuKiekis < 3)
			pranesimoTekstas.append("Pupeles baigiasi. Kiekis liko: " + aparatoProduktai.pupeliuKiekis + ". ");

		if (aparatoProduktai.pienoKiekis == 0)
			pranesimoTekstas.append("Pienas pasibaige. ");
		else if (aparatoProduktai.pienoKiekis < 3)
			pranesimoTekstas.append("Pienas baigiasi. Kiekis liko: " + aparatoProduktai.pienoKiekis + ". ");

		if (aparatoProduktai.vandensKiekis == 0)
			pranesimoTekstas.append("Vanduo pasibaige. ");
		else if (aparatoProduktai.vandensKiekis < 3)
			pranesimoTekstas.append("Vanduo baigiasi. Kiekis liko: " + aparatoProduktai.vandensKiekis + ". ");

		if (pranesimoTekstas.toString().length() == 0)
			pranesimoTekstas.append("Aparato dar valyti nereikia ir produktu kiekis yra pakankamas.");

		System.out.println(pranesimoTekstas.toString());
	}

	public void atspausdintiProduktuBusena() {
		System.out.println("Siuo metu turimi produktu kiekiai: ");
		System.out.println("Cukrus: " + aparatoProduktai.cukrausKiekis);
		System.out.println("Pupeles: " + aparatoProduktai.pupeliuKiekis);
		System.out.println("Pienas: " + aparatoProduktai.pienoKiekis);
		System.out.println("Vanduo: " + aparatoProduktai.vandensKiekis);
	}

	public void atspausdintiAparatoBusena() {
		atspausdintiProduktuBusena();

		System.out.println("Iki plovimo liko: " + (panaudojimuRiba - panaudojimuSkaicius) + " panaudojimai (-as, -ø)");
	}

	private void gamintiKava(KavosPuodelis puodelis, String kavosTipas) {

		if (aparatoProduktai.cukrausKiekis < puodelis.puodelioProduktai.cukrausKiekis
				|| aparatoProduktai.pienoKiekis < puodelis.puodelioProduktai.pienoKiekis
				|| aparatoProduktai.pupeliuKiekis < puodelis.puodelioProduktai.pupeliuKiekis
				|| aparatoProduktai.vandensKiekis < puodelis.puodelioProduktai.vandensKiekis) {

			System.out.println("Ingredientu kiekis nepakankamas, kad pasidaryti gerima - " + kavosTipas);
			atspausdintiProduktuBusena();
		} else {
			aparatoProduktai.cukrausKiekis -= puodelis.puodelioProduktai.cukrausKiekis;
			aparatoProduktai.pienoKiekis -= puodelis.puodelioProduktai.pienoKiekis;
			aparatoProduktai.pupeliuKiekis -= puodelis.puodelioProduktai.pupeliuKiekis;
			aparatoProduktai.vandensKiekis -= puodelis.puodelioProduktai.vandensKiekis;

			this.panaudojimuSkaicius++;
			puodelis.arPagaminta = true;

			System.out.println("Prasom pasiimti - Jusu " + kavosTipas + ". Skanaus!");
		}
	}
}
