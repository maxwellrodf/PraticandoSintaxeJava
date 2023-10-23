//Criar um algoritmo que leia a idade de uma pessoa e informar a sua classe
//eleitoral:
//a. Não-eleitor (abaixo de 16 anos)
//b. Eleitor obrigatório (entre 18 e 65 anos)
//c. Eleitor facultativo (entre 16 e 18 e maior de 65 anos)


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa: ");
        double idade = teclado.nextDouble();

        if(idade < 16){
            System.out.println("NÃO ELEITOR");
        }
        else if(idade >= 16 && idade <18 || idade > 65){
            System.out.println("ELEITOR FACULTATIVO");
        }
        else{
            System.out.println("ELEITOR OBRIGATÓRIO");
        }
    }
}