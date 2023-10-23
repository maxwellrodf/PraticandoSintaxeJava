//Criar um algoritmo que mostre o menu de opções a seguir, receba a opção do
//usuário e os dados necessários para executar cada operação.
// Menu de opções:
//1- Somar dois números.
//2- Multiplicar dois números
//3- Subtrair dois números
//4- Dividir dois números


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("MENU DE OPCOES");
        System.out.println("1 - Somar 2 números");
        System.out.println("2 - Multiplicar 2 números");
        System.out.println("3 - Subtrair 2 números");
        System.out.println("4 - Dividir 2 números");
        double opcao = teclado.nextDouble();

        if(opcao >0 && opcao <5){
            if(opcao == 1){
                System.out.println("Digite N1");
                double N1 = teclado.nextDouble();
                System.out.println("Digite N2");
                double N2 = teclado.nextDouble();

                double soma = N1 + N2;
                System.out.printf("SOMA: %.2f \n", soma);
            }
            else if (opcao == 2){
                System.out.println("Digite N1");
                double N1 = teclado.nextDouble();
                System.out.println("Digite N2");
                double N2 = teclado.nextDouble();

                double multiplicacao = N1 * N2;
                System.out.printf("MULT: %.2f \n", multiplicacao);
            }
            else if (opcao == 3){
                System.out.println("Digite N1");
                double N1 = teclado.nextDouble();
                System.out.println("Digite N2");
                double N2 = teclado.nextDouble();

                double subtracao = N1 - N2;

                System.out.printf("SUB: %.2f \n", subtracao);
            }
            else
            {
                System.out.println("Digite N1");
                double N1 = teclado.nextDouble();
                System.out.println("Digite N2");
                double N2 = teclado.nextDouble();


                if(N2 <=0){
                    System.out.println("NÃO É POSSÍVEL REALIZAR A DIVISÃO POR ZERO");
                }
                else{
                    double divisao = N1 / N2;
                    System.out.printf("DIV: %.2f \n", divisao);
                }
            }


        }
        else{
            System.out.println("DIGITE UMA OPÇÃO VÁLIDA");
        }




    }




}