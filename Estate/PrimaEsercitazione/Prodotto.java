//Dichiarazione della classe Prodotto:
public class Prodotto
{
    //Attributi: (tutti privati per via dell'information hiding)
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int giacenza;
    
    //Metodi:
    public Prodotto() //costruttore di default
    {
        this.codice = 0;
        this.nome = "Paguro";
        this.descrizione = "Hakuna Matata";
        this.prezzo = 89.00;
        this.giacenza = 89;
    }

    public Prodotto(int c, String n, String d, double p, int g) //costruttore con parametri
    {
        this.codice = c;
        this.nome = n;
        this.descrizione = d;
        this.prezzo = p;
        this.giacenza = g;
    }

    public Prodotto(Prodotto prod) //costruttore di copia
    {
        this.codice = prod.codice;
        this.nome = prod.nome;
        this.descrizione = prod.descrizione;
        this.prezzo = prod.prezzo;
        this.giacenza = prod.giacenza;
    }
    
    //Metodi accessori: setter e getter
    public int getCodice()
    {
        return this.codice;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getDescrizione()
    {
        return this.descrizione;
    }
    
    public double getPrezzo()
    {
        return this.prezzo;
    }
    
    public int getGiacenza()
    {
        return this.giacenza;
    }
    
    public void setCodice(int c)
    {
        this.codice = c;
    }
    
    public void setNome(String n)
    {
        this.nome = n;
    }
    
    public void setDescrizione(String d)
    {
        this.descrizione = d;
    }
    
    public void setPrezzo(double p)
    {
        this.prezzo = p;
    }
    
    public void setGiacenza(int g)
    {
        this.giacenza = g;
    }
    
}
