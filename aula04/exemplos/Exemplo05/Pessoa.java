package exemplos.Exemplo05;

public class Pessoa {
    //atributo variável
    String nome;
    double salario;

    //método ação

    //método contrutor
    Pessoa(String n, double s){

        nome =n;
        salario =s;
        


    }


    void apresentar(){

        System.out.println("Olá! Eu sou " + nome + " e ganho "+salario);
    }
    
}
