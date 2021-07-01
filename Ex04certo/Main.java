package Ex04certo;

public class Main {
    public static void main(String[] args) {
        Casa casa    = new Casa();
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();
        
        casa.pintaCasa("Rosa");
        casa.addPorta(porta1);
        porta1.abrirPorta();
        casa.addPorta(porta2);
        porta2.abrirPorta();
        casa.addPorta(porta3);
        porta3.fecharPorta();

        System.out.println(casa.quantasPortasAbertas());

    }
}
