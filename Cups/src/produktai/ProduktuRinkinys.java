package produktai;

public class ProduktuRinkinys {
	public int cukrausKiekis;
	public int pupeliuKiekis;
	public int vandensKiekis;
	public int pienoKiekis;

	public ProduktuRinkinys(int cukrus, int pupeles, int vanduo, int pienas) {
		this.cukrausKiekis = cukrus;
		this.pupeliuKiekis = pupeles;
		this.vandensKiekis = vanduo;
		this.pienoKiekis = pienas;

	}

	public ProduktuRinkinys sukurtiTokiPatRinkini() {
		ProduktuRinkinys naujasRinkinys = new ProduktuRinkinys(this.cukrausKiekis, this.pupeliuKiekis, this.vandensKiekis, this.pienoKiekis);
		
		return naujasRinkinys;
	}
}
