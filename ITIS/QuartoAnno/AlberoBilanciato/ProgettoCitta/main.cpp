#include <iostream>
#include <fstream>
#include <vector>
#include <string>
#include <sstream>

using namespace std;

// Definizione della struttura per rappresentare una città
struct City {
    string name;
    vector<pair<string, int>> connections;  // Coppia (città collegata, peso)
};

// Funzione per inizializzare il grafo da file di testo
void initializeGraph(vector<City>& graph, const string& citiesFile, const string& connectionsFile) {
    // Lettura delle città da file
    ifstream citiesInput(citiesFile);
    string city;

    while (getline(citiesInput, city, ',')) {
        cout << city << endl;
    }

    citiesInput.close();

    /*
    // Lettura dei collegamenti e pesi da file
    ifstream connectionsInput(connectionsFile);
    string city1, city2;
    int weight;
    while (connectionsInput >> city1 >> city2 >> weight) {
        // Trova le città nel grafo
        auto it1 = find_if(graph.begin(), graph.end(), [city1](const City& c) { return c.name == city1; });
        auto it2 = find_if(graph.begin(), graph.end(), [city2](const City& c) { return c.name == city2; });

        // Aggiungi il collegamento con il peso
        if (it1 != graph.end() && it2 != graph.end()) {
            it1->connections.push_back(make_pair(city2, weight));
            it2->connections.push_back(make_pair(city1, weight));
        }
    }
    connectionsInput.close();
    */
}

// Funzione per stampare il grafo
void printGraph(const vector<City>& graph) {
    for (const auto& city : graph) {
        cout << "Città: " << city.name << endl;
        cout << "Collegamenti:" << endl;
        for (const auto& connection : city.connections) {
            cout << "  " << connection.first << " (Peso: " << connection.second << ")" << endl;
        }
        cout << endl;
    }
}

int main() {
    vector<City> graph;

    // Inizializza il grafo dai file di testo
    initializeGraph(graph, "citta.txt", "collegamenti.txt");

    // Stampa il grafo
    printGraph(graph);

    return 0;
}
