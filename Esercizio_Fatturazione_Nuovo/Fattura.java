package Fatturazione;

import java.time.LocalDate;

public class Fattura {
	
	//attributi:
	private Cliente destinatario;
    private LocalDate data;
    private int numero; //numero della fattura!!!!!!!! 50/2023 , non cambia una volta creato
    private String descrizione;
    private double qta;	//quantità di prodotti venduta
    private double prezzoUnitario;	//prezzo di un singolo prodotto (senza IVA)

    private static int numeroCorrente=1;
    private static int perciva=22; //si può mettere anche 10 oppure 4

    //Costruttori:
    public Fattura(Cliente dest)
    {
    	data = LocalDate.now(); //data di oggi in automatico
    	destinatario = dest;
    	numero = this.numeroCorrente;
    }

    //Setter:
    public void setDescrizione (String descr)
    {
    	this.descrizione = descr;
    }

    public void setQuantita (double qta)
    {
    	this.qta = qta;
    }

    public void setPrezzoUnitario (double prezzo)
    {
    	this.prezzoUnitario = prezzo;
    }

    //Getter:
    //fateli in autonomia per destinatario, descrizione, prezzoUnitario e qta.
    
    public int getNumeroCorrente()
    {
    	return this.numeroCorrente;
    }
    
    //Altri metodi:
    private double calcolaImponibile()
    {
    	//Calcolo la base imponibile, cioè l'importo su cui va calcolata l'iva.
    	//BASE IMPONIBILE = QUANTITA x PREZZO UNITARIO
    	
    	double risultato = (this.qta * this.prezzoUnitario);
    	return risultato;
    }

    private double calcolaImposta()
    {
    	//Calcolo l'iva sulla base imponibile:
    	double baseImponibile = this.calcolaImponibile ();	//cifra su cui calcolare l'iva
    	double imposta = (baseImponibile * this.perciva) / 100;	//calcolo imposta
    	return imposta;
    }

    public double totaleFattura ()
    {
    	//totale fattura = base_imponibile + iva;
    	double base_imponibile = this.calcolaImponibile();
    	double iva = this.calcolaImposta();

    	double tot_fattura = base_imponibile + iva;
    	return tot_fattura;
    }

    public void stampaFattura()
    {
		System.out.println ("------------------------");
		System.out.println ("Cliente: " + this.destinatario.getNome());
		System.out.println ("Data: " + this.data);
		System.out.println ("Numero: " + this.numero);
		System.out.println ("Descrizione: " + this.descrizione);
		System.out.println ("Quantita: " + this.qta);
		System.out.println ("Prezzo unitario: " + this.prezzoUnitario);
		System.out.println ("Base imponibile: " + this.calcolaImponibile() );
		System.out.println ("Iva: " + this.calcolaImposta() );
		System.out.println ("Totale Fattura: " + this.totaleFattura() );
		System.out.println ("------------------------");
    }
    
    public void emetti()
    {
    	this.numeroCorrente++;
    	System.out.println("Emessa fattura numero " + this.numero + " verso " + this.destinatario.getNome());
    }
  }

