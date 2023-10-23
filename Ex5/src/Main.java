import java.util.Scanner;

//Criar um algoritmo (Fluxograma e Pseudocódigo) que receba o salário de um
//funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o
//novo salário

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o salario do funcionario");
        double salario = teclado.nextDouble();
        System.out.println("Digite o percentual de aumento");
        double percentualAumento = teclado.nextDouble();

        double valorAumento = salario * (percentualAumento/100);
        double novoSalario = salario + valorAumento;

        System.out.printf("O valor do aumento é de R$ %.2f", valorAumento);
        System.out.printf("O valor do novo salário é de R$ %.2f", novoSalario);


    }
}