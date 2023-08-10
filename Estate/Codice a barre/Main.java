/******************************************************************************


*******************************************************************************/
import java.util.Scanner;

public class Main
{
    static final int DIMENSIONE = 13;
    static Scanner sc = new Scanner(System.in);
    
    public static int[] inserisciCodice()
    {
        //Creo il vettore:
        int[] v = new int[DIMENSIONE];
        
        //Inizializzo le prime 12 celle con numeri positivi:
        int numeroInserito;
        for(int i=0;i<v.length-1;i++)
        {
            //uso un do-while per controllare:
            do
            {
                //Leggo il numero da tastiera:
                System.out.print("Dammi un numero intero POSITIVO: ");
                numeroInserito = sc.nextInt();
            }while(numeroInserito<0);
            
            //effettuo l'assegnazione:
            v[i] = numeroInserito;
        }
        //Restituisco TUTTO il vettore:
        return v;
    }
    
    public static int getCifraControllo(int v[])
    {
        int sommaPari = 0;
        int sommaDispari = 0;
        int sommaTotale;
        
        for(int i=0;i<v.length-1;i++)
        {
            if(i%2 == 0) //posizione pari:
            {
                sommaPari = sommaPari + (3*v[i]);
            }
            else //posizione dispari
            {
                sommaDispari = sommaDispari + v[i];
            }
        }
        
        sommaTotale = sommaPari + sommaDispari;
        return sommaTotale%10;
    }
    
	public static void main(String[] args) {
		//Creiamo un vettore (di interi) chiamando la funzione inserisciCodice:
		int[] codiceBarre = inserisciCodice();
		
		//assegno l'ultima cifra al vettore:
		codiceBarre[12] = getCifraControllo(codiceBarre);
		
		//stampo tutto l'array:
		System.out.println("---Stampo le cifre del codice a barre---");
		for(int i=0;i<codiceBarre.length;i++)
		{
		    System.out.print(codiceBarre[i] + " ");
		}
		
	}
}

