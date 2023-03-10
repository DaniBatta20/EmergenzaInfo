public class Stack {
    //attributi:
    private int[] contenitore;
    private int top;

    //metodi:
    //costruttore:
    public Stack(int DIM)
    {
        this.contenitore = new int[DIM];
        this.top = -1;
    }

    //metodo isEmptyStack:
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

    //metodo isFullStack:
    public boolean isFullStack()
    {
        if(this.top == this.contenitore.length-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //metodo push:
    public void push(int elementoDaInserire)
    {
        //controllo se lo stack è pieno:
        if(this.isFullStack() == true)
        {
            System.out.println("La pila è piena, non puoi inserire nuovi elementi!");
        }
        else
        {
            //tiro su di uno la top:
            top++;
            //inserisco l'elemento:
            this.contenitore[top] = elementoDaInserire;
        }
    }

    //metodo pop:
    public void pop()
    {
        //controllo se lo stack è vuoto:
        if(this.isEmptyStack() == true)
        {
            System.out.println("Lo stack è vuoto, non posso restituire elementi");
        }
        else
        {
            //Stampare l'elemento:
            System.out.println("Pop: "+this.contenitore[top]);
            //tiro giù di uno la top:
            top--;
        }
    }
}
