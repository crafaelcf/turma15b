package exercicios.exercicio01;

public class Placar {
    private String nomeTime1,nomeTime2;
    private int placar1,placar2;

    public Placar(){

        //this.nomeTime1="Time da casa";
        //this.nomeTime2="Visitante";
        this("Time da casa","Visitante"); // chama o construtor com parametro nome \/


    }

    public Placar(String nomeTime1,String nomeTime2){

        //this.nomeTime1=nomeTime1;
        //this.nomeTime2=nomeTime2;
        //placar1=0; //quando não atribuir valor nas variaveis tipo int ou double o padrao é zero
        //placar2=0;
        this(nomeTime1,nomeTime2,0,0); // chama o construtor de 4 parametros \/

        
    }
    public Placar(String nomeTime1,String nomeTime2,int placar1, int placar2){

        this.nomeTime1=nomeTime1;
        this.nomeTime2=nomeTime2;
        this.placar1=placar1;
        this.placar2=placar2;

        
    }


    @Override
    public String toString() {

        return nomeTime1+ " "+placar1+ " x "+placar2+" "+nomeTime2;
    }
}
