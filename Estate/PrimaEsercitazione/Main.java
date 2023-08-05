/******************************************************************************
Consegna....
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    //Come si creano gli oggetti?
	    //(Nome classe) (nome oggetto) = new (chiamata al costruttore);
	    
	    //Creo un oggetto p1 usando il costruttore di default:
	    Prodotto p1 = new Prodotto();
	    //Creo un oggetto p2 usando il costruttore con parametri:
	    Prodotto p2 = new Prodotto(1, "Frullatore", "costoso", 150.50, 15);
	    //Creo un oggetto p3 usando il costruttore di copia con p2:
	    Prodotto p3 = new Prodotto(p2);
	    
	    //Usando il setter, cambiare il prezzo di p3 impostandolo a 190.50:
	    //Come si invocano i metodi sugli oggetti?
	    //(nome oggetto).(nome metodo)(eventuali argomenti....);
	    p3.setPrezzo(190.50);
	    
	}
}

