/******************************************************************************

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int n;
		int a=0, b=1, temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci n: ");
		n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
		    System.out.print(a + " ");
		    temp = a + b;
		    a = b;
		    b = temp;
		}
		
	}
}
