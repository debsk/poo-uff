package Ex02;

public class Main {
    public static void main(String[] args){
        Pessoa debora = new Pessoa();
        debora.nome   = "Débora Barbosa";
        debora.idade  = 23;
        
        debora.show_idade();

        debora.fazer_aniversario();
        debora.fazer_aniversario();
        debora.fazer_aniversario();

        debora.show_idade();
    }
}
