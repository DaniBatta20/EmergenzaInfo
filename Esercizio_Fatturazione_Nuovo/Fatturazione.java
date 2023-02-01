package Fatturazione;
import java.util.Scanner;

public class Fatturazione {
	static Scanner sc = new Scanner(System.in);
	
	public static Cliente costruisciCliente()
	{
		String nomeInserito;
		String partitaIvaInserita;
		double saldoInserito;
		
		System.out.print("Inserisci il nome del cliente: ");
		nomeInserito = sc.next();
		System.out.print("Inserisci la partita iva del cliente: ");
		partitaIvaInserita = sc.next();
		
		//Obbligo l'utente a darmi un saldo fintanto che è negativo:
		do {
			System.out.print("Inserisci il saldo del cliente: ");
			saldoInserito = sc.nextDouble();
		}while(saldoInserito<0);
		
		//Creo il cliente:
		Cliente c = new Cliente(nomeInserito, partitaIvaInserita, saldoInserito);
		
		//restituisco il cliente:
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creare un oggetto cliente c1 usando valori a scelta:
		Cliente c1 = new Cliente("Mario Rossi", "012345678910", 100);
		//c1 è un oggetto di tipo Cliente
		
		//Creare un altro oggetto Cliente c2:
		Cliente c2 = new Cliente("Luca Capretti", "012345678910", 0);
		
		Cliente nuovoCliente = costruisciCliente();
		//Chiama il metodo stampaSituazione() su nuovoCliente:
		nuovoCliente.stampaSituazione();
		
		//addebita 100 euro a nuovoCliente:
		nuovoCliente.addebbita(100);
		
		//richiama la stampaSituazione():
		nuovoCliente.stampaSituazione();
		
		//togli 100 euro da nuovoCliente e stampa la sua situazione:
		nuovoCliente.paga(100);
		nuovoCliente.stampaSituazione();
		
		
		//Creare un oggetto di tipo fattura chiamato f1 usando nuovoCliente
		Fattura f1 = new Fattura(nuovoCliente);
		//emetto la fattura f1:
		f1.emetti();
		//stampa la fattura emessa:
		f1.stampaFattura();
		
		//Creare altre due fatture (f2, f3) usando sempre nuovoCliente:
		Fattura f2 = new Fattura(nuovoCliente);
		f2.emetti();
		f2.stampaFattura();
		
		Fattura f3 = new Fattura(nuovoCliente);
		f3.emetti();
		f3.stampaFattura();
		
		System.out.println(f1.getNumeroCorrente());
		

	}

}
