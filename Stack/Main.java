public class Main {
    public static void main(String[] args) {
        //Mi creo un nuovo Stack:
        Stack miaPila = new Stack(5);

        //inserisco un numero a piacere:
        miaPila.push(10);
        miaPila.push(20);
        miaPila.push(30);

        //faccio due pop:
        miaPila.pop();
        miaPila.pop();
        miaPila.pop();
        miaPila.pop();
    }
}
