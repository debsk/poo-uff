package exercicio3.exercicio5;
class Main {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        
        televisao.ligar();
        
        televisao.mudarCanalEspecifico(12);
        
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.aumentarVolume();

        televisao.mudarProximoCanal();
        televisao.mudarProximoCanal();
        televisao.mudarProximoCanal();
        
        televisao.desligar();
        televisao.ligar();

        televisao.silenciar();
        televisao.mudarCanalAnterior();
        televisao.mudarCanalAnterior();

        televisao.imprimirEstado();


    }
}
