package Ex05;

public class Televisao {
    boolean ligada;
    boolean silenciada;
    int volume = 0;
    int canal  = 0;

    boolean estadoTv(){
        return ligada;
    }
    void ligarTv(){
        ligada = true;
    }

    void desligarTv(){
        ligada = false;

    }

    int mudarCanales(int canaladd){
        
        if ((canaladd >= 0) && (canaladd <= 99))
            canal = canaladd;
        return canal;
    }
    int mudarCanalmais(){
        return canal++;
    }
    int mudarCanalmenos(){
        return canal--;
    }
    boolean silenciarTv(){
        silenciada = true;
        return silenciada;

    }

    boolean dessinlenciarTv(int valor){
        silenciada = false;
        if ((valor > 0) && (valor <= 10))
            volume = valor;
        System.out.println("Volume da tv" + volume);
        return silenciada;
    }

   
}
