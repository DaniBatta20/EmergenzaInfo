import java.util.Random;

public class MazzoDiCarte {
    //ATTRIBUTI:
    private int NUMERO_CARTE = 40;
    private Carta[] mazzo; //qui carta indica il tipo di dato contenuto nell'array
    //mazzo è un array di oggetti di tipo "Carta"
    public MazzoDiCarte()
    {
        this.mazzo = new Carta[NUMERO_CARTE]; //creo un array con 40 carte

        int k=0; //indice per riempire il mazzo;
        //butto le carte dentro al mazzo:
        for(int seme=0;seme<=3;seme++) //fisso il seme
        {
            for(int valoreCarta=1;valoreCarta<=10;valoreCarta++) //fisso il valore
            {
                //Creare una nuova carta: (con il costruttore)
                Carta cartaDaInserire = new Carta(seme, valoreCarta);
                this.mazzo[k] = cartaDaInserire;
                k++;
            }
        }
    }

    public void mostraMazzo()
    {
        //deve stamparmi tutte le carte del mazzo:
        for(int i=0;i<this.mazzo.length;i++)
        {
            //this.mazzo[i] è un oggetto di tipo Carta
            System.out.println(this.mazzo[i].ToString());
        }
    }

    public Carta prendiCarta()
    {
        //restituire una carta a caso:
        Random rand = new Random();
        int randomNumber = rand.nextInt(40); //numero a caso tra 0 e 39
        Carta cartaDaRestituire = this.mazzo[randomNumber];

        return cartaDaRestituire;
    }

    public void mischiaMazzo()
    {
        //scambio una carta con la sua vicina per 100 volte:
        Random rand = new Random();
        int randomNumber;

        for(int i=0;i<500;i++)
        {
            randomNumber = rand.nextInt(39); //voglio un numero tra 0 e 38
            Carta tmp = this.mazzo[randomNumber];
            this.mazzo[randomNumber] = this.mazzo[randomNumber+1];
            this.mazzo[randomNumber+1] = tmp;
        }
    }
}
