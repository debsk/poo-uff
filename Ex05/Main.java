package Ex05;

public class Main {
    public static void main (String[] args){
        Televisao tv = new Televisao();

        tv.ligarTv();
        tv.mudarCanales(45);
        tv.mudarCanalmais();
        tv.mudarCanalmais();
        tv.mudarCanalmais();
        tv.mudarCanalmenos();

        tv.silenciarTv();

        tv.dessinlenciarTv(7);
        tv.desligarTv();
        
        if (tv.estadoTv())
            System.out.println("LIGADA");
        else
            System.out.println("DESLIGADA");

    }
}
