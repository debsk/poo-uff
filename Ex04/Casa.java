package Ex04;

public class Casa {
    
        int porta1;
        int porta2;
        int porta3;
        String corp1;
        String corp2;
        String corp3;
        boolean aberta1;
        boolean aberta2;
        boolean aberta3;
        int quant;
        String casa;
        String casacor;

        

        boolean esta_aberta1(){
            return aberta1;
        }
        void porta_aberta1(){
            aberta1 = true;
        }
        void porta_fechada1(){
            aberta1 = false;
        }
        boolean esta_aberta2(){
            return aberta2;
        }
        void porta_aberta2(){
            aberta2 = true;
        }
        void porta_fechada2(){
            aberta2 = false;
        }
        boolean esta_aberta3(){
            return aberta3;
        }
        void porta_aberta3(){
            aberta3 = true;
        }
        void porta_fechada3(){
            aberta3 = false;
        }
        void quantas_estao_abertas(){
            if (esta_aberta1())
                quant ++;
            if (esta_aberta2())
                quant ++;
            if (esta_aberta2())
                quant ++;
            System.out.println("Portas abertas = " + quant );
        }

        void pinta_porta1(String nova_cor){
            corp1 = nova_cor;
        }

        void pinta_porta2(String nova_cor){
            corp2 = nova_cor;
        }
        void pinta_porta3(String nova_cor){
            corp3 = nova_cor;
        }

        void pintar_casa(String nova_cor){
            casacor = nova_cor;
        }

}
