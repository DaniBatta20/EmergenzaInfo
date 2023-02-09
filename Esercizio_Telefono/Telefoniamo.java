package Telefono;

public class Telefoniamo {

	public static void main(String[] args) {
		//Creiamo tre Batterie: b1, b2, b3:
		//1) b1 nasce usando il costuttore vuoto:
		//NomeClasse nomeOggetto = new NomeClasse(parametri se ci sono);
		Batteria b1 = new Batteria();
		
		//2) b2 nasce usando il costruttore con un solo parametro:
		Batteria b2 = new Batteria(90);
		
		//3) b3 nasce usando il costruttore di copia:
		Batteria b3 = new Batteria(b1);
		
		//Chiamare su tutti e 3 gli oggetti il ToString per vedere a video le info sulle batterie
		
		//nomeOggetto.nomeMetodo(parametri se ci sono);
		
		System.out.println(b1.ToString());
		System.out.println(b2.ToString());
		System.out.println(b3.ToString());
		
		//Creiamo tre cellulari: iphone, cinese, nokia usando rispettivamente le batterie b1, b2, b3
		
		Cellulare iphone = new Cellulare(b1, 10, 10);
		Cellulare nokia = new Cellulare(b2, 10, 10);
		Cellulare cinese = new Cellulare();
		
		//chiama il tuo amico cinese per 20 minuti col telefono cinese:
		cinese.Telefona(20);
		
		//chiama il tuo amico ricchissimo con l'iphone per 40 minuti:
		iphone.Telefona(40);
		
		//chiama lo zio di Foggia con il tuo nokia per 1 minuto perchè
		//la guarda di finanzia vi ha intercettati:
		nokia.Telefona(1);
		
		//non demordi e mandi 5 sms allo zio di Foggia per fargli gli auguri
		//per il suo onomastico:
		for(int i=0; i<5; i++)
		{
			nokia.inviaSMS();
		}
		
		//Metti in carica il telefono cinese per quanto vuoi tu:
		cinese.b.Ricarica(10);
		
		//Metti in carica il nokia per 60:
		nokia.getb().Ricarica(60);
		
	}

}
