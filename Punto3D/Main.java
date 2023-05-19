import java.util.Scanner;

public class Main
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Creo un punto p1 col costruttore standard:
		Punto2D p1 = new Punto2D();
		//Cambio a piacere le coordinate di p1:
		p1.setX(7);
		
		double numeroInserito;
		System.out.print("Inserisci la coordinata y: ");
		numeroInserito = sc.nextDouble();
		p1.setY(numeroInserito);
		
		//Come si chiamano i getter:
		System.out.println("La coordinata y inserita è " + p1.getY());
		
		//Chiamare il ToString su p1:
		System.out.println(p1.ToString());
		
		
		//Creo un punto3D p2 col costruttore con parametri:
		Punto3D p2 = new Punto3D(1, 2, 3);
		//Modifico la x e la z di p2 mettendole a 0:
		p2.setX(0);
		p2.setZ(0);
		
		//Usa il ToString su p2:
		System.out.println(p2.ToString());
	}
}
