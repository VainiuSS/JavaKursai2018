import interfeisai.Duztantis;
public class Pagrindine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Balionas mazasBalionas = new Balionas();
		System.out.println((Duztantis) mazasBalionas);
		System.out.println("Baliono metodai:");
		System.out.println("kristi:");

		mazasBalionas.kristi();
		System.out.println("susprogti:");

		mazasBalionas.susprogti();
		System.out.println("atsitrenkti:");

		mazasBalionas.atsitrenkti();
		
		Stikline bokalas = new Stikline();
		System.out.println("Stiklines metodai:");
		System.out.println("papildyti:");

		bokalas.papildyti();
		System.out.println("subyreti:");

		bokalas.subyreti();
		System.out.println("suskilti:");

		bokalas.suskilti();
		System.out.println("atsitrenkti:");

		bokalas.atsitrenkti();
		System.out.println("kristi:");

		bokalas.kristi();
	}
}
