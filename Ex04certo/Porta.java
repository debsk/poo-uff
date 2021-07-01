package Ex04certo;

public class Porta {
    boolean aberta;

    void abrirPorta(){
        aberta = true;
    }

    void fecharPorta(){
        aberta = false;
    }

    boolean estaAberta(){
        return aberta;
    }
}
