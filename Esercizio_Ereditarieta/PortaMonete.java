public class PortaMonete {
    //Attributi:
    private int N_MONETE_CINQUANTA_CENT;
    private int N_MONETE_UN_EURO;
    private int N_MONETE_DUE_EURO;

    //Costruttori:

    public PortaMonete() //primo costruttore
    {
        this.N_MONETE_CINQUANTA_CENT=0;
        this.N_MONETE_UN_EURO=0;
        this.N_MONETE_DUE_EURO=0;
    }

    public PortaMonete(int n1, int n2, int n3) //secondo costruttore
    {
        this.N_MONETE_CINQUANTA_CENT = n1;
        this.N_MONETE_UN_EURO = n2;
        this.N_MONETE_DUE_EURO = n3;
    }

    public void inserisci (double valore)
    {
        if(valore == 0.50)
        {
            this.N_MONETE_CINQUANTA_CENT++;
        }
        else if(valore == 1)
        {
            this.N_MONETE_UN_EURO++;
        }
        else if(valore == 2)
        {
            this.N_MONETE_DUE_EURO++;
        }
    }

    public void inserisci (double valore, int quantita)
    {
        if(valore == 0.50)
        {
            this.N_MONETE_CINQUANTA_CENT = this.N_MONETE_CINQUANTA_CENT + quantita;
        }
        else if(valore == 1)
        {
            this.N_MONETE_UN_EURO = this.N_MONETE_UN_EURO + quantita;
        }
        else if(valore == 2)
        {
            this.N_MONETE_CINQUANTA_CENT = this.N_MONETE_DUE_EURO + quantita;
        }
    }

    public double denaro()
    {
        double risultato = (N_MONETE_CINQUANTA_CENT * 0.50) + (N_MONETE_UN_EURO * 1) + (N_MONETE_DUE_EURO*2);
        return risultato;
    }

    public void denaroPerTipo()
    {
        System.out.println("Numero monete da 50 cent: " + this.N_MONETE_CINQUANTA_CENT);
        System.out.println("Numero monete da 1 euro: " + this.N_MONETE_UN_EURO);
        System.out.println("Numero monete da 2 euro: " + this.N_MONETE_DUE_EURO);
    }





}
