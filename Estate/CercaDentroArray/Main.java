/******************************************************************************

Scrivere un metodo Java che riceve un vettore di interi v e un intero k e 
verifica se k è presente esattamente una volta in v.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    
    public static boolean controllo(int v[], int k)
    {
        for(int i=0;i<v.length;i++)
        {
            if(v[i] == k)
            {
                return true;
            }
        }
        return false;
    }
    
    
	public static void main(String[] args) {
	    //Dichiaro un array di interi:
		int[] a = new int[7];
		
		//Ora riempio l'array con dei numeri:
		int numeroInserito;
		for(int i = 0; i<a.length; i++)
		{
		    System.out.print("Inserisci un numero intero: ");
		    numeroInserito = sc.nextInt();
		    a[i] = numeroInserito;
		}
		
		//chiamare la funzione controllo passandole l'array:
		if(controllo(a, 5) == true) // se la funzione controllo ha restituito true
		{
		    System.out.println("Il numero è stato trovato almeno una volta!");
		}
		else
		{
		    System.out.println("Il numero non è stato trovato nemmeno una volta!");
		}
	}
}

