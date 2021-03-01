package exercicios.exercicio02;



public abstract class Pessoa {

    private String nome, telefone;


    Pessoa(){


    }


    Pessoa(String nome,String telefone){

        this.nome= nome;
        this.telefone = telefone;
    }


    @Override
    public String toString() {

        if (telefone.length()<9) {

        return "numero invalido";
            
        }else{

        return "nome: "+nome +" telefone: "+telefone;
        }
    }


    public String getNome(){

        return nome;
    }

    
}
