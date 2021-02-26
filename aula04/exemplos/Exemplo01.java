package exemplos;

public class Exemplo01 {
    
        public static void main(String[] args) {

            System.out.println("Programa de cadastro v 1.1.2");
            
            linha2(30); //chamada de método
            System.out.println("Bom dia");
            linha2(30);
            linha3(30, '*');
            linha3(30, '#');
        
        
        }


        static void linha(){ // void - não tem retorno

            System.out.println("---------------------------");

        }

        static void linha2(int tamanho){

            for (int i = 0; i < tamanho; i++) {
                System.out.print("-"); 
            
            }
            
            System.out.println();
        }

        static void linha3(int tamanho, char tipo){

            for (int i = 0; i < tamanho; i++) {
                System.out.print(tipo); 
            
            }
            
            System.out.println();
        }


}
