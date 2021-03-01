package exemplos.exemplo01;

/**
 * Funcionario
 */
public class Funcionario {

    private String nome;
    private double salario;


    public Funcionario(){


    }
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;


    }

    public void setNome(String nome){
        this.nome=nome;


    }




    public String getNome(){
        return nome;

    }

    public String toString(){

        return nome + "; " + salario;
    }


    public void aumentarSalario(double porcentagem){

      salario = salario + salario * porcentagem/100;
    }

}