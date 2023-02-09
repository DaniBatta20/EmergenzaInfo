package Telefono;
import java.util.*;

public class Batteria
{
	//attributi:
	private int CapacitaCarica;
    private int LivCarica;
   

    //costruttori
    public Batteria()//vuoto
    {
      this.CapacitaCarica = 100;
      this.LivCarica = 100;
    }
    
    public Batteria(int cc) //con parametro/i
    {
      this.CapacitaCarica = cc;
      this.LivCarica = cc;
    }
    
    public Batteria(Batteria b)//costruttore di copia
    {
    	this.CapacitaCarica = b.CapacitaCarica;
    	this.LivCarica = b.LivCarica;
    }

    //getter(s)
    public int getCapacitaCarica()
    {
    	return this.CapacitaCarica;
    }
   
    public int getLivCarica()
	{
    	return this.LivCarica;
	}
      
    //altri metodi
    public void Consuma(int consuma) //consuma --> quanto vuoi togliere alla batteria
    {
      if(this.LivCarica>0 || this.LivCarica-consuma>0)
    	  this.LivCarica = this.LivCarica - consuma;
      else
    	  System.out.print("scarico");
    }

    
    public void Ricarica(int c) //c --> quanto ricarichi la batteria
    {
    	if(this.LivCarica == this.CapacitaCarica) //se la batteria è già full
    	{
    		System.out.println("Batteria già al 100%");
    	}
    	else if(this.LivCarica + c >= this.CapacitaCarica)
    	{
    		//setto la batteria al 100
    		this.LivCarica = this.CapacitaCarica;
    		System.out.println("Batteria ricaricata completamente!");
    	}
    	
    	
    }

    public String ToString()
    {
    	return ("batteria carica al " +this.LivCarica+ "%"+"\n"+"Capacità massima:"+this.CapacitaCarica);

    }
}
