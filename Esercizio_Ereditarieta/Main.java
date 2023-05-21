
public class Main
{
	public static void main(String[] args) {
		//Creo un portamonete p1 usando il costruttore di default:
		PortaMonete p1 = new PortaMonete();
		//Creo un portamonete p2 usando il costruttore con parametri:
		PortaMonete p2 = new PortaMonete(1 , 2, 3);
		p2.denaroPerTipo();
		
		
		//Creo un portafoglio pf1 usando il costruttore con parametri:
		Portafoglio pf1 = new Portafoglio(1 ,2 , 3, 4, 5, 6);
		System.out.println("Soldi dentro pf1 : " + pf1.denaroTotale());
		
		
	}
}
