package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        
        int numeroInt;
        double numeroDouble;
        
        numeroInt =12;
        numeroDouble = 10.7;
        
        System.out.println(numeroDouble);
        System.out.println(numeroInt);
        // para retirar as casas decimais (int) força o numero inteiro, sem arredondar
        numeroInt = (int)numeroDouble; 
        
        numeroDouble = 15.0 / 7;
        System.out.println(numeroDouble);

        numeroDouble = (double) 12/7;
        System.out.println(numeroDouble);




    }
    
}
