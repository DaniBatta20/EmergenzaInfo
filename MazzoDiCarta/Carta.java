public class Carta {
    //attributi:
    private int seme; //denari(0), spade(1), coppe(2), bastoni(3)
    private int valore; //da 1 a 10

    //metodi: costruttore:
    public Carta(int s, int v)
    {
        this.seme = s;
        this.valore = v;
    }

    public int getSeme()
    {
        return this.seme;
    }

    public String getNomeSeme()
    {
        String nomeSeme="";
        switch(this.seme)
        {
            case 0:
                nomeSeme = "Denari";
                break;
            case 1:
                nomeSeme = "Spade";
                break;
            case 2:
                nomeSeme = "Coppe";
                break;
            case 3:
                nomeSeme = "Bastoni";
                break;
            default:
                nomeSeme = "Sconosciuto";
                break;
        }
        return nomeSeme;
    }
    public int getValore()
    {
        return this.valore;
    }

    public String getNomeCarta()
    {
        String nomeCarta="";
        switch(this.valore)
        {
            case 1:
                nomeCarta = "Asso";
                break;
            case 2:
                nomeCarta = "Due";
                break;
            case 3:
                nomeCarta = "Tre";
                break;
            case 4:
                nomeCarta = "Quattro";
                break;
            case 5:
                nomeCarta = "Cinque";
                break;
            case 6:
                nomeCarta = "Sei";
                break;
            case 7:
                nomeCarta = "Sette";
                break;
            case 8:
                nomeCarta = "Fante";
                break;
            case 9:
                nomeCarta = "Cavallo";
                break;
            case 10:
                nomeCarta = "Re";
                break;
            default:
                nomeCarta="Sconosciuto";
                break;
        }
        return nomeCarta;
    }

    public String ToString()
    {
        //(NomeValore) di (NomeSeme)
        String risultato = this.getNomeCarta() + " di " + this.getNomeSeme();
        return risultato;
    }
}
