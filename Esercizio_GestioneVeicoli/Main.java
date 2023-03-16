import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        //Creo un po' di veicoli e li metto in coda:
        StackVeicoli pilaVeicoli = new StackVeicoli();

        Veicolo veicoloCreato;
        String targaInserita;
        String marcaInserita;
        String modelloInserito;
        int numeroPostiInserito;
        for(int i=0;i<5;i++)
        {
            System.out.println("Inserisci targa: ");
            targaInserita = sc.next();
            System.out.println("Inserisci marca: ");
            marcaInserita = sc.next();
            System.out.println("Inserisci modello: ");
            modelloInserito = sc.next();
            System.out.println("Inserisci numero posti: ");
            numeroPostiInserito = sc.nextInt();

            //creo veicolo con parametri inseriti dall'utente
            veicoloCreato = new Veicolo(targaInserita, marcaInserita, modelloInserito, numeroPostiInserito);

            //pusho il veicolo nello stack:
            pilaVeicoli.push(veicoloCreato);
        }

        int scelta = -1;
        String stringaRicerca = "";
        int numeroRicerca;
        do
        {
            do{
                System.out.println("1) Ricerca veicoli per targa");
                System.out.println("2) Ricerca veicoli per codice");
                System.out.println("3) Elimina veicoli per targa");
                System.out.println("4) Elimina veicoli per codice");
                System.out.println("5) Ricerca veicoli per numero di posti");
                System.out.println("6) Esci dal menù");
                System.out.println("Inserisci la scelta: ");
                scelta = sc.nextInt();
            }while(scelta<1 || scelta >6);
            
            switch(scelta)
            {
                case 1:
                    System.out.println("Inserisci una targa: ");
                    stringaRicerca = sc.next();
                    pilaVeicoli.ricercaPerTarga(stringaRicerca);
                    break;
                case 2:
                    System.out.println("Inserisci un codice: ");
                    numeroRicerca = sc.nextInt();
                    pilaVeicoli.ricercaPerCodice(numeroRicerca);
                    break;
                case 3:
                    System.out.println("Inserisci una targa: ");
                    stringaRicerca = sc.next();
                    pilaVeicoli.eliminaPerTarga(stringaRicerca);
                    break;
                case 4:
                    System.out.println("Inserisci un codice: ");
                    numeroRicerca = sc.nextInt();
                    pilaVeicoli.eliminaPerCodice(numeroRicerca);
                    break;
                case 5:
                    System.out.println("Inserisci un numero di posti: ");
                    numeroRicerca = sc.nextInt();
                    pilaVeicoli.ricercaPerNumeroDiPosti(numeroRicerca);
                    break;
                case 6:
                    System.out.println("Arrivederci!");
                    break;
            }
        }while(scelta != 6);



    }
}
