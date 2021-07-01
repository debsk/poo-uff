package Ex02;

public class Pessoa {
    String nome;
    int idade;

    void fazer_aniversario(){
        idade ++;
    }

    void show_idade(){
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos");
    }
}
