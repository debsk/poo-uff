package Ex01;
import java.util.Scanner;

public class Contato {
    
    String nome;
    String telefone;
    
    void status(){
        System.out.println("Contato adicionado!");
        System.out.println(this.nome);
        System.out.println(this.telefone);

    }
    void add(){
        Scanner ler = new Scanner(System.in);
        nome        = ler.nextLine();
        telefone    = ler.nextLine();
    }

}
