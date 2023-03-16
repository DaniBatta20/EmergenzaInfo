public class StackVeicoli {
    //array di oggetti di tipo Veicolo:
    private Veicolo[] veicoli;
    //la top:
    private int top;

    //COSTRUTTORE:
    public StackVeicoli()
    {
        //alloco l'array di veicoli:
        this.veicoli = new Veicolo[1000];
        //setto la top:
        this.top = -1;
    }

    public boolean isEmptyStack()
    {
        if(this.top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isFullStack()
    {
        if(this.top == 1000-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void push(Veicolo veicoloDaInserire)
    {
        //controllo se lo stack è già pieno:
        if(isFullStack() == true)
        {
            System.out.println("Non è possibile inserire un nuovo veicolo...");
        }
        else
        {
            //alzo di uno la top:
            this.top++;
            //inserisco il veicolo nella posizione "top":
            this.veicoli[this.top] = veicoloDaInserire;
        }
    }

    public Veicolo pop()
    {
        //controllo se lo stack è vuoto:
        if(isEmptyStack() == true)
        {
            //System.out.println("Non ci sono veicoli in coda...");
            return null;
        }
        else
        {
            this.top--;
            return this.veicoli[this.top+1];
        }
    }

    public void eliminaPerTarga(String t)
    {
        //ricerco nello stack il veicolo con targa uguale a quella data come argomento:
        int i;
        for(i=0;i<this.veicoli.length;i++)
        {
            //controllo se il veicolo i-esimo ha la targa uguale a quella ricevuta come argomento:
            if(this.veicoli[i].getTarga() == t)
            {
                System.out.println("Elimino veicolo con targa: " + t);
                riordinaStack(i);
                break;
            }
        }
    }

    public void eliminaPerCodice(int c)
    {
        //ricerco nello stack il veicolo con codice uguale a quello dato  come argomento:
        int i;
        for(i=0;i<this.veicoli.length;i++)
        {
            if(this.veicoli[i].getCodice() == c)
            {
                System.out.println("Elimino veicolo con codice: " + c);
                riordinaStack(i);
                break;
            }
        }
    }

    public void ricercaPerTarga(String t)
    {
        for(int i=0;i<this.veicoli.length;i++)
        {
            if(this.veicoli[i].getTarga() == t)
            {
                System.out.println(this.veicoli[i].ToString());
                break;
            }
        }
    }

    public void ricercaPerCodice(int c)
    {
        for(int i=0;i<this.veicoli.length;i++)
        {
            if(this.veicoli[i].getCodice() == c)
            {
                System.out.println(this.veicoli[i].ToString());
                break;
            }
        }
    }

    public void ricercaPerNumeroDiPosti(int np)
    {
        for(int i=0;i<this.veicoli.length;i++)
        {
            if(this.veicoli[i].getNumeroPosti() == np)
            {
                System.out.println(this.veicoli[i].ToString());
            }
        }
    }
    public void riordinaStack(int indiceDiPartenza)
    {
        for(int j=indiceDiPartenza; j<this.top; j++)
        {
            this.veicoli[j] = this.veicoli[j+1];
        }
    }
}
