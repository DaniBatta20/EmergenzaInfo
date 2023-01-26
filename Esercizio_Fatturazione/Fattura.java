package Fatturazione;

import java.time.LocalDate;

public class Fattura {
	private Cliente destinatario;
    private LocalDate data;
    private int numero;
    private String descrizione;
    private double qta;	//quantitC 
    private double prezzoUnitario;	//prezzo senza IVA

    private static int numeroCorrente;
    private static int perciva;

    public Fattura (Cliente dest)
    {
	data = LocalDate.now ();
	destinatario = dest;
    }

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

    private double calcolaImponibile ()
    {
	double risultato = (this.qta * this.prezzoUnitario);
	return risultato;
    }

    private double calcolaImposta ()
    {
	double baseImponibile = this.calcolaImponibile ();	//cifra su cui calcolare l'iva
	double imposta = (baseImponibile * this.perciva) / 100;	//calcolo imposta
	return imposta;
    }

    public double totaleFattura ()
    {
	//totale fattura = base_imponibile + iva;
	double base_imponibile = this.calcolaImponibile ();
	double iva = this.calcolaImposta ();

	double tot_fattura = base_imponibile + iva;
	return tot_fattura;
    }

    public void stampaFattura ()
    {
	System.out.println ("------------------------");
	System.out.println ("Cliente: " + destinatario.getNome ());
	System.out.println ("Data: " + this.data);
	System.out.println ("Numero: " + this.numeroCorrente);
	System.out.println ("Descrizione: " + this.descrizione);
	System.out.println ("Quantita: " + this.qta);
	System.out.println ("Prezzo unitario: " + this.prezzoUnitario);
	System.out.println ("Base imponibile: " + this.calcolaImponibile ());
	System.out.println ("Iva: " + this.calcolaImposta ());
	System.out.println ("Totale Fattura: " + this.totaleFattura ());
	System.out.println ("------------------------");
    }
  }

