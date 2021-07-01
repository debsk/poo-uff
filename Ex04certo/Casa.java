package Ex04certo;

public class Casa {
    String cor;
    Porta[] portas = new Porta[100];
    int numPortas = 0;
    
    void addPorta(Porta porta){
        portas [numPortas] = porta;
        numPortas++;
    }

    int quantasPortasAbertas(){
        int quant = 0;
        for(int i = 0; i < numPortas; i++ ){
            if(portas[i].estaAberta())
                quant++;
        }
        return quant;
    }

    void pintaCasa(String novacor){
        cor = novacor;
    }
}
