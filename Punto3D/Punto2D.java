public class Punto2D{
    //Attributi --> quali caratteristiche ha la classe?
    private double x;
    private double y;
    
    //Metodi --> che cosa sa fare?
    public Punto2D() //costruttore standard
    {
        this.x = 0;
        this.y = 0;
    }
    
    public Punto2D(double x, double y) //costruttore con parametri
    {
        //this.x --> si riferisce all'attributo della classe
        //x (e basta) si riferisce al parametro passato al costruttore
        this.x = x;
        this.y = y;
    }
    
    //setter:
    public void setX(double x)
    {
        this.x = x;
    }
    
    public void setY(double y)
    {
        this.y = y;
    }
    
    //getter:
    public double getX()
    {
        return this.x;
    }
    
    public double getY()
    {
        return this.y;
    }
    
    //altro metodo:
    public String ToString()
    {
        String risultato = "Le coordinate del punto sono (" + this.x + ";" + this.y + ")";
        return risultato;
    }
    
}
