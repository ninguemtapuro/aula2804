import java.util.Scanner;

public class CalculadoraSimples{

    public static void main(String[] args) {
        
        //Declaração de variaveis
        int n1, n2, total, op;

        //Criação e instancia do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        do{

            System.out.println("\n\t\t\t -- Calculadora Simples -- \n");

            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Sair");

            System.out.print("Opção: ");
            op = entrada.nextInt();

            //Miguel
            if(op == 1){
                System.out.println("\n\t\t\t -- Soma -- \n");
                
                //Entrada
                System.out.println("Digite o primeiro número: ");
                n1 = entrada.nextInt();
                System.out.println("Digite o segundo número: ");
                n2 = entrada.nextInt();

                //Processamento
                total = n1 + n2;

                //Saida
                System.out.println("O resultado da soma é:" + total);
            } else if(op == 2){
               
                //Rai
                
                    
                    //Entrada
                    System.out.println("\n\t\t\t -- Subtração --\n");
                    System.out.println("Digite o primeiro número: ");
                    n1 = entrada.nextInt();
                    System.out.println("Digite o segundo número: ");
                    n2 = entrada.nextInt();
    
                    //Processamento
                    total = n1 - n2;
    
                    //Saida
                    System.out.println("O resultado da subtração é:" + total);
                } else if(op == 2){


                System.out.println("\n\t\t\t -- Subtração --\n");
            }else if(op == 3){
                System.out.println("Forte abraço!");
            }else{
                System.out.println("Opção" + op + " incorreta!");
            }

        }while(op!=3);



    }
}
