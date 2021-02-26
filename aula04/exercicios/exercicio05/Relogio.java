package exercicios.exercicio05;

public class Relogio {
    int hora,minuto,segundo;

    //construtor

    Relogio(int hora,int minuto,int segundo){
        
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
        
    }

    public void setHora(int hora) {
        if (hora>=0 && hora<=24) {
            this.hora = hora; 
        }else{


            this.hora=999999;
            System.out.println("Hora precisa estar entre 0 e 24");
        }
        
    }

    public void setMinuto(int minuto) {

        if (minuto >= 0 && minuto <=59) {
            this.minuto = minuto;
        }else{

            this.minuto = 999999;
            System.out.println("Minuto precisa estar entre 0 e 59");

        }
        
    }

    public void setSegundo(int segundo) {

        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;    
        }else{
            this.segundo = 999999;
            System.out.println("segundo precisa estar entre 0 e 59");

        }
        
    }
   
    //método exebir
    void getHora(){

        System.out.println(+hora+":"+minuto+":"+segundo);


    }

    
}
