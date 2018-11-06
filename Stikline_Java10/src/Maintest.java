import klases.Klase1;
import klases.Klase2;
import interfeisai.*;
public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Klase1 testas1 = new Klase1();
		testas1.print1();
		
		interface1 testas2 = new Klase2();
		testas2.print1();
		
		Klase2 testas3 = (Klase2) testas2;
		testas3.print2();
		
	}

}
