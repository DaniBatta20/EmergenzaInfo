package Fatturazione;

public class Fatturazione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creare un oggetto di tipo cliente chiamato c1 con dati a piacere: (senza saldo)
		Cliente c1 = new Cliente("Mario Rossi", "12345678910");
		//Creare un oggetto di tipo cliente chiamato c1 con dati a piacere: (con saldo di 150)
		Cliente c2 = new Cliente("Adam El Maani", "12345678710", 150);
		
		//Chiama il metodo stampaSituazione sul cliente:
		c1.stampaSituazione();
		
		//lo stesso sull'oggetto c2:
		c2.stampaSituazione();
	}

}
