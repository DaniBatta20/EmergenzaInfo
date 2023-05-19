public class Punto3D extends Punto2D{
    //Nuovo attributo:
    private double z;
    
    //Metodi:
    public Punto3D()
    {
        super();//invoco il costruttore standard di Punto2D
        this.z=0;
    }
    
    public Punto3D(double x, double y, double z)
    {
        super(x, y); //invoco il costruttore con parametri di Punto2D
        this.z = z;
    }
    
    //setter:
    public void setZ(double z)
    {
        this.z = z;
    }
    
    //getter:
    public double getZ()
    {
        return this.z;
    }
    
    //overriding del metodo ToString:
    @Override
    public String ToString()
    {
        String risultato = "Le coordinate del punto sono (" + this.getX() + ";" + this.getY() + ";" + this.z + ")";
        return risultato;
    }
    
    
}
