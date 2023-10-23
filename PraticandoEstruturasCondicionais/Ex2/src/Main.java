//Criar um algoritmo receba a média de um aluno e mostre a situação do aluno:
//a. Aprovado  média maior ou igual a 5;
//b. Exame  média entre 3 e 5;
//c. Reprovado  média menor do que 3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o código do cargo:");
        double cargo = teclado.nextDouble();

        if(cargo == 1){
            System.out.println("ESCRITUARIO");
        }
        else{
            if(cargo ==2){
                System.out.println("SECRETARIA");
            }
            else{
                if(cargo == 3){
                    System.out.println("CAIXA");
                }
                else{
                    if (cargo == 4){
                        System.out.println("GERENTE");
                    }
                    else{
                        if (cargo ==5){
                            System.out.println("DIRETOR");
                        }
                        else{
                            if(cargo >=5){
                                System.out.println("DIGITE UM NÚMERO VÁLIDO");
                            }
                        }

                    }
                }
            }
        }
    }
}