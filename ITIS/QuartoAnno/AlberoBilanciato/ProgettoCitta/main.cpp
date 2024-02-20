#include <iostream>
#include <time.h>
#include <string>
#include <vector>
#include <fstream>
#include <sstream>

using namespace std;

//Buona pratica di programmazione: definisci i nomi dei file come delle costanti!
//Qualora dovessi cambiare, in futuro, il nome del file dovrai farlo solo una volta
//in questo punto. Non ci sarà bisogno di mettere mano alle varie parti del codice
//alla ricerca dei nomi di file da modificare.
#define NOME_FILE_CITTA "Citta.txt"
#define NOME_FILE_COLLEGAMENTI "collegamenti.txt"


//Definiamo le struct che caratterizzeranno il nostro progetto:

//Collegamento: rappresenta un arco "pesato" tra due nodi
struct collegamento{
	int distanza;
	string partenza;
	string arrivo;
};

//Nodo: rappresenta una città del problema
struct nodo{
	string luogo;
	vector<collegamento> cittaVicine;
	
};


//Funzione che legge i collegamenti e da un file di testo
void leggicollegamenti(vector<nodo>& nodi){
	
	string line;
	ifstream fin(NOME_FILE_COLLEGAMENTI);
	
	//controllo se ci sono stati errori nell'apertura del file
	if (!fin.is_open()) {
        cerr << "Impossibile aprire il file." << endl;
        return;
    }
	
	//Variabili che mi serviranno per generare i collegamenti:
	collegamento arco;
	string partenzaLetta;
    string destinazioneLetta;
    int distanzaLetta;
    
	for(int i = 0; i < nodi.size(); i++){
	    //Chiudo e riapro il file;
	    fin.close();
	    fin.open(NOME_FILE_COLLEGAMENTI);
	    
	    //Cerco nel file di testo tutti i collegamenti che hanno come partenza una certa città
		while(getline(fin, line)){
			stringstream ss(line);
		    getline(ss,partenzaLetta,',');      //leggi città di destinazione;
		    getline(ss,destinazioneLetta,',');  //leggi città destinazione
			ss >> distanzaLetta;                //leggi distanza e salvala nella variabile intera
			
			if(partenzaLetta == nodi[i].luogo){
				arco.partenza = partenzaLetta;
				arco.arrivo = destinazioneLetta;
				arco.distanza = distanzaLetta;
				nodi[i].cittaVicine.push_back(arco);    //aggiungo il collegamento in vector
			}
		}
	}
	
    fin.close(); //importantissimo! I file vanno sempre chiusi per evitare brutte sorprese...
}


//Funzione che inizializza i nomi dei nodi del grafo e richiama la funzione che legge i collegamenti da un altro file
void leggiNodi(vector<nodo>& nodi){
	string line;	//riga
	ifstream fin(NOME_FILE_CITTA);
	
	nodo tmp;		//variabile temporanea che cambia ogni volta
	while(getline(fin, line, ',')){ 		//finchè leggo nomi di città vado avanti
		
		stringstream ss(line); 		//oggetto che ha al suo interno un "puntatore" incorporato che si ricorda l'ultima posizione
		getline(ss, tmp.luogo, ',');		//cosi facendo mettera in "luogo" tutto cio che c'è prima della virgola		
		nodi.push_back(tmp);
	}
	leggicollegamenti(nodi);
}

//Stampo l'intero grafo:
void stampaGrafo(vector<nodo> &nodi)
{
    for(int i=0;i<nodi.size(); i++)
    {
        cout<<"-----\nInformazioni sulla città "<<nodi[i].luogo<<"\n------\n";
        for(int j=0; j<nodi[j].cittaVicine.size(); j++)
        {
            cout<<"Da "<<nodi[i].luogo<<" a "<<nodi[i].cittaVicine[j].arrivo<<" distanza di "<<nodi[i].cittaVicine[j].distanza<<endl;
        }
    }
}

int main() {
	int scelta;
	vector<nodo> nodi;
	
	cout<<"Ciao: benvenuto!\n";
	cout<<"Premi 0 per uscire"<<endl;
	cout<<"Premi 1 per non fare niente"<<endl;
	cout<<"Premi 2 per riempire il grafo"<<endl;
	cout<<"Premi 3 per stampare il grafo"<<endl;
	
	do{
    	cout<<"Fai una scelta: ";
    	cin>>scelta;
    	
    	
    	switch(scelta){
    	    
    	    case 0:
    	        cout<<"Grazie, arrivederci!";
    	        break;
    		
    		case 1:
    			
    			cout<<"Non stai facendo niente. Bravo!"<<endl;
    			break;
    		
    		case 2:
    		    //Per sicurezza, se il grafo ha in memoria dei dati lo svuoto e lo ri-riempio:
    			if(nodi.size() > 0)
    			{
    			    nodi.clear(); //svuoto la vector!
    			}
    			
    			leggiNodi(nodi);
    			break;
    			
    		case 3:
    			stampaGrafo(nodi);
    			
    			break;	
    			
    		default:
    		    cout<<"Scelta errata amico mio, ritenta!";
    		    break;
    	}
	}while(scelta>=0 && scelta<=3);
	
	return 0;
}
