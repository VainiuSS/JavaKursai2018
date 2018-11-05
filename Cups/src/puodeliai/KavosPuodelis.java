package puodeliai;

import produktai.ProduktuRinkinys;

public class KavosPuodelis extends Puodelis {
	public ProduktuRinkinys puodelioProduktai;
	protected String kavosPavadinimas;
	public boolean arPagaminta;
	
	
	
	@Override
	public String toString() {
		
		StringBuilder puodelioInfo = new StringBuilder();

		puodelioInfo.append("Kavos pavadinimas: " + kavosPavadinimas + ". ");
		puodelioInfo.append("Cukrus - " + puodelioProduktai.cukrausKiekis + " ");
		puodelioInfo.append("pupeles - " + puodelioProduktai.pupeliuKiekis + " ");
		puodelioInfo.append("vanduo - " + puodelioProduktai.vandensKiekis + " ");
		puodelioInfo.append("pienas -  " + puodelioProduktai.pienoKiekis);

		System.out.println(puodelioInfo.toString());
		
		return puodelioInfo.toString();
	}
}
