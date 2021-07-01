package Ex03;

public class Porta {
    boolean aberta;
    String cor;
    double altura;
    double largura;

    boolean porta_aberta(){
        return aberta;
    }

    void abrir_porta(){
        aberta = true;
    }

    void fechar_porta(){
        aberta = false;
    }

    void pintar(String nova_cor){
        cor = nova_cor;
    }

    
    void modifica_dimensoes(double nova_altura, double nova_largura){
        altura  = nova_altura;
        largura = nova_altura;
        
    }
}
