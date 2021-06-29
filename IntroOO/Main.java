package IntroOO;

public class Main {
    
    public static void  main (String[] args){

        BoloRetangular boloChocolate = new BoloRetangular(); // construtor da classe
        
        imprimir(boloChocolate);

        boloChocolate.peso      = 3;
        boloChocolate.sabor     = "Chocolate";
        boloChocolate.cobertura = "Morango";
        
        imprimir(boloChocolate);
        
        boloChocolate.comer(1);

        imprimir(boloChocolate);

        boloChocolate.decorar();
    }

    static void imprimir(BoloRetangular bolo){

        System.out.println("Peso: "+ boloChocolate.peso);
        System.out.println("Sabor: "+ boloChocolate.sabor);
        System.out.println("Cobertura: "+ boloChocolate.cobertura);

    }
}
