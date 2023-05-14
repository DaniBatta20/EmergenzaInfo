public class Portafoglio extends PortaMonete{
    //attributi:
    private int N_BANCONOTE_CINQUE_EURO;
    private int N_BANCONOTE_DIECI_EURO;
    private int N_BANCONOTE_VENTI_EURO;

    //costruttori:
    public Portafoglio() //primo costruttore
    {
        //chiamare il costruttore della classe padre
        super();
        this.N_BANCONOTE_CINQUE_EURO = 0;
        this.N_BANCONOTE_DIECI_EURO = 0;
        this.N_BANCONOTE_VENTI_EURO = 0;
    }

    public Portafoglio(int n1, int n2, int n3, int n4, int n5, int n6)
    {
        //chiamare il costruttore della classe padre:
        super(n1, n2, n3);
        this.N_BANCONOTE_CINQUE_EURO = n4;
        this.N_BANCONOTE_DIECI_EURO = n5;
        this.N_BANCONOTE_VENTI_EURO = n6;
    }

    @Override
    public void inserisci(double valore) {
        super.inserisci(valore);
        if(valore == 5)
        {
            this.N_BANCONOTE_CINQUE_EURO++;
        }
        else if(valore == 10)
        {
            this.N_BANCONOTE_DIECI_EURO++;
        }
        else if(valore == 20)
        {
            this.N_BANCONOTE_VENTI_EURO++;
        }
    }

    @Override
    public void inserisci(double valore, int quantita) {
        super.inserisci(valore, quantita);
        if(valore == 5)
        {
            this.N_BANCONOTE_CINQUE_EURO = this.N_BANCONOTE_CINQUE_EURO + quantita;
        }
        else if(valore == 10)
        {
            this.N_BANCONOTE_DIECI_EURO = this.N_BANCONOTE_DIECI_EURO + quantita;
        }
        else if(valore == 20)
        {
            this.N_BANCONOTE_VENTI_EURO = this.N_BANCONOTE_VENTI_EURO + quantita;
        }
    }

    public int banconote()
    {
        int risultato = (this.N_BANCONOTE_CINQUE_EURO * 5) + (this.N_BANCONOTE_DIECI_EURO*10) + (this.N_BANCONOTE_VENTI_EURO*20);
        return risultato;
    }

    public double denaroTotale()
    {
        double risultato = this.banconote() + this.denaro();
        return risultato;
    }


}
