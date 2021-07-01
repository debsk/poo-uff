package Ex03;

public class Main {
    public static void main(String[] args) {
        Porta porta = new Porta(); // tipo | nome do objeto = new |chama a classe|;
        
        porta.modifica_dimensoes(2.02, 3.03);
        porta.abrir_porta();
        porta.fechar_porta();
        porta.pintar("Amarelo");
        porta.pintar("Laranja");
        
        if (porta.porta_aberta())
            System.out.println("A porta está aberta");
        else
            System.out.println("A porta está fechada");
    }
}
