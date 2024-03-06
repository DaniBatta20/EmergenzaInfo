/******************************************************************************
Scrivi un programma che prenda un numero intero positivo n come input e calcoli 
la successione di Collatz per quel numero. La successione di Collatz per un numero n 
è definita come segue: se n è pari, dividilo per 2; se n è dispari, 
moltiplicalo per 3 e aggiungi 1.  Continua questo processo fino a quando n diventa 1.
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci n: ");
		n = sc.nextInt();
		
		while(n!=1)
		{
		    System.out.print(n + " ");
		    if((n%2)==0)
		    {
		        n = n/2;
		    } else {
		        n = n*3 + 1;
		    }
		}
		System.out.print(n);
		sc.close();
		
	}
}
