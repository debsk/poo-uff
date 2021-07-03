package Ex06;

class Baralho {
    Carta[] cartas = new Carta[52];
    int numC = 0;

    void adicionarCarta (Carta carta){
        cartas[numC] = carta;
        numC++;
    }
    
    void imprimirBaralho (){
        System.out.println("Naipe - Cartas : ");
        for (int i = 0; i < 52; i++){
            System.out.println( " -> " + cartas[i].valor);
            System.out.println( " -> " +cartas[i].naipe);
        }
    }
}
