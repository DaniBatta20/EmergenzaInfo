package Telefono;
import java.util.*;


public class Cellulare{
    private Batteria b;
    private int NumSms;
    private int MinutiChiamate;

    //costruttori
    public Cellulare() //Vuoto
    {
      this.b = new Batteria();
      this.NumSms = 0;
      this.MinutiChiamate = 0;
    }

    public Cellulare(int CapacitaBatteria) //con parametro
    {
       this.b = new Batteria(CapacitaBatteria);
       this.NumSms = 0;
       this.MinutiChiamate = 0;
    }
    
    public Cellulare(Batteria batt, int NumSms,  int MinutiChiamate) //con parametri
    {
       this.b = new Batteria(batt);
       this.NumSms = NumSms;
       this.MinutiChiamate = MinutiChiamate;
    }

    //getter(s):
    public Batteria getb()
    {
    	return this.b;
    }
   
      public int getNumSms()
      {
    	 return this.NumSms;
      }

    public int getMinutiChiamate()
    {
    	  return this.MinutiChiamate;
    }

//metodi
    public void inviaSMS()
    {
    	if(this.b.getLivCarica()==0) {
			System.out.println("Batteria scarica");
		}
		else 
		{
			this.NumSms++; //incremento numero sms
			this.b.Consuma(1); //consuma di 1 la batteria
			System.out.println("Sms inviato, batteria scesa al " + this.b.getLivCarica() + "%");
		}
    }

    public void Telefona(int durata)
    {
		//Controllo se la batteria è scarica:
    	if(this.b.getLivCarica()==0)
		{
    		System.out.println("Non puoi telefonare, batteria scarica!!");
		}
		else
		{
			//Scarico un po' la batteria del cellulare: togli 5 per ogni minuto
			this.b.Consuma(5 * durata);
			System.out.println("Hai telefonato per " + durata + " minuti");
		}
    }
}
