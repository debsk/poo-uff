package Ex08;

public class Celular {
    Bateria bateria;

    Celular (Bateria bateria){
        this.bateria = bateria;
    }

    void enviarMensagem(String mensagem){
        System.out.println("Mensagem: ");
        System.out.println(mensagem);
        
        bateria.nivelDeCargaAtual -= 1;
        imprimirNivelDaBateria();
    }
    void efetuarLigacao(int duracao){
        int custo = duracao/5;
        System.out.println("Duraçao = "+ duracao +" segundos ");
        bateria.nivelDeCargaAtual -= custo;
        imprimirNivelDaBateria();

    }
    void imprimirNivelDaBateria(){
        System.out.println("Nivel atual da bateria: "+ bateria.nivelDeCargaAtual);
    }
    
}
