import interfeisai.Duztantis;


public class Stikline implements Duztantis{
	String Busena;
	boolean arTuscia = true;
	
	public void papildyti(){
		arTuscia = false;
		System.out.println("Stikline ne tuscia" + Duztantis.Busena);
	}
	
	public void suskilti(){
		Busena = "Suskilusi";
		System.out.println("Stiklines busena: " + Busena);
	}
	public void subyreti(){
		Busena = "Subyrejusi";
		System.out.println("Stiklines busena: " + Busena);

	}
	public void kristi() {
		Busena = "Nukrito";
		System.out.println(Busena);

	}

	public void atsitrenkti() {
		Busena = "Atsitrenke";
		System.out.println(Busena);
	}
}
