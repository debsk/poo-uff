package IntroOO;

public class BoloRetangular {
    
    float peso;
    String sabor;
    String cobertura;

    void decorar(){
        System.out.println("Bolo decorado");
    }

    void comer(float pesoComido){
        peso = peso - pesoComido;
    }

}
