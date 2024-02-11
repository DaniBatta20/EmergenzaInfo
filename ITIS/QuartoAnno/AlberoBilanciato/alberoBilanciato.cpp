#include <iostream>
#include <ctime>
#include <cstdlib>

using namespace std;

//Definiamo un generico nodo dell'albero
struct Nodo {
    int valore;
    Nodo* figlioSinistro;
    Nodo* figlioDestro;
};

//Definiamo una funzione 'creaAlbero' che
//riceve come argomento il numero di nodi che
//l'albero avrà. Ricorda che è un albero bilanciato,
//pertanto il numero di nodi figli di destra sarà
//uguale al numero di nodi figli di sinistra.
Nodo* creaAlbero(int quantiNodi)
{
    if(quantiNodi<=0)
    {
      //Si entra qua dentro quando per ricorsione
      //avrò un numero di nodi figli = 0, cioè
      //siamo arrivati ai cosiddetti nodi foglia
      return NULL;
    }
    else
    {
        //creo il nuovo nodo a questo livello:
        Nodo* nuovoNodo = new Nodo;
        nuovoNodo->valore=rand()%100;
        
        int quanti_a_sinistra=quantiNodi/2;
        int quanti_a_destra=quantiNodi-quanti_a_sinistra - 1; //il -1 è necessario altrimenti l'albero non sarà bilanciato
        
        nuovoNodo->figlioSinistro=creaAlbero(quanti_a_sinistra); //chiamata ricorsiva
        nuovoNodo->figlioDestro=creaAlbero(quanti_a_destra);     //chiamata ricorsiva
        
        return nuovoNodo;
    }
}

void stampaAlbero(Nodo* radice, int livello) {
    if (radice != NULL) {
        stampaAlbero(radice->figlioDestro, livello + 1);
        
        for (int i = 0; i < livello; i++) {
            cout << "   "; // Spazi per l'indentazione
        }
        cout << radice->valore << endl;

        stampaAlbero(radice->figlioSinistro, livello + 1);
    }
}

void deallocaAlbero(Nodo* radice) {
  //L'idea è questa: se non ho già deallocato tutto l'albero
  //ovvero se radice != NULL, allora procedo ricorsivamente
  //alla deallocazione del sottoalbero di destra e del
  //sottoalbero di sinistra.
    if (radice != NULL) {
        deallocaAlbero(radice->figlioSinistro);
        deallocaAlbero(radice->figlioDestro);
        delete radice;
    }
}

int main() {
    srand(time(nullptr));
    //A noi serve mantenere il riferimento al nodo radice dell'albero:
    Nodo* nodoRadice = creaAlbero(20); //crea un albero bilanciato con un totale di 20 nodi
    stampaAlbero(nodoRadice, 0);
    deallocaAlbero(nodoRadice);
    return 0;
}
