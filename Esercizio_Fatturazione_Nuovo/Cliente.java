package Fatturazione;

public class Cliente {
	//------------------------------------------
	//attributi:
	private String nome;
    private String partitaIVA;
    private double saldo; //somma che il cliente ci deve dare
    private static int numeroClienti = 1;
  //------------------------------------------
    //metodi:
    
    //1)Costruttori:
    //a) stesso nome della classe
    //b) public (sempre)
    //c) NON hanno il tipo restituito!!
    
    public Cliente(String nome, String partitaIVA)
    {
	       this.nome = nome;
	       this.partitaIVA = partitaIVA;
	       this.saldo = 0;
	       this.numeroClienti++;
    }

    public Cliente (String nome, String partitaIVA, double saldo)
    {
	        this (nome, partitaIVA); //chiamo il costruttore sopra
	        //this.nome = nome;
	        //this.partitaIVA = partitaIVA;
	        this.saldo = saldo;
	        this.numeroClienti++;
    }
    
  	//2)Setter:
    //a) private o public a seconda delle preferenze;
    //b) sono TUTTI void;
    //c) hanno un parametro passato come argomento.

    //IN QUESTO ESEMPIO NON CI SONO I SETTER!
    
    //3)Getter:
    //a) sono public
    //b) hanno il tipo della variabile da restituire
    //c) NON hanno un parametro come argomento
    
    public String getNome()
    {
    	return this.nome;
    }
    
    public String getPartitaIVA()
    {
    	return this.partitaIVA;
    }
    
    public double getSaldo()
    {
    	return this.saldo;
    }
    
    //4)Altri metodi:
    public void addebbita(double importo)
    {
    	this.saldo = saldo + importo;
    }

    public void paga(double importo)
    {
    	this.saldo = saldo - importo;
    }

    public void stampaSituazione()
    {
    	System.out.println ("-----------------------------");
    	System.out.println ("Cliente: " + this.nome);
    	System.out.println ("PartitaIVA: " + this.partitaIVA);
    	System.out.println ("Saldo: " + this.saldo);
    	System.out.println ("-----------------------------");
    }
	
}
