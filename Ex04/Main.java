package Ex04;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();


        casa.pinta_porta1("amarelo");
        casa.pinta_porta2("Rosa");
        casa.pinta_porta3("roxo");

        casa.porta_fechada1();
        casa.porta_aberta2();
        casa.porta_aberta3();

        casa.quantas_estao_abertas();

    }
}
