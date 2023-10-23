//Criar um algoritmo receba a média de um aluno e mostre a situação do aluno:
//a. Aprovado  média maior ou igual a 5;
//b. Exame  média entre 3 e 5;
//c. Reprovado  média menor do que 3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a média do aluno");
        double mediaAluno = teclado.nextDouble();

        if(mediaAluno >= 5){
            System.out.println("APROVADO");
        }
        else if(mediaAluno >= 3 && mediaAluno <5){
            System.out.println("EXAME");
        }
        else{
            System.out.println("REPROVADO");
        }
    }
}