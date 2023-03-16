public class Veicolo {
    //ATTRIBUTI:
    private int codice;
    private String targa;
    private String marca;
    private String modello;
    private int numeroPosti;

    //per tenere traccia di quanti veicoli ci sono:
    private static int N_VEICOLI = 1;

    //METODI:
    public Veicolo(String targa, String marca, String modello, int numeroPosti) {
        this.codice = N_VEICOLI;
        N_VEICOLI++;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.numeroPosti = numeroPosti;
    }

    //SETTER: (se  ci pensi non hanno senso)
    //---NO SETTER PER IL CODICE---
    //---NO SETTER PER LA MARCA---
    //---NO SETTER PER IL MODELLO---
    //---NO SETTER PER IL NUMERO DI POSTI---
    public void setTarga(String t)
    {
        this.targa = t;
    }

    //GETTER:
    public int getCodice() {
        return codice;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public static int getnVeicoli() {
        return N_VEICOLI;
    }

    public String ToString()
    {
        String risultato = "Codice: "+this.codice+"\n"+
                "Targa: "+this.targa+"\n"+"Marca: "+this.marca+"\n"+
                "Modello: "+this.modello + "\n" + "Numero posti: "+this.numeroPosti;

        return risultato;
    }
}
