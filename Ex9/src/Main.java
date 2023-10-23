// Faça um algoritmo (Fluxograma e Pseudocódigo) e o programa em linguagem C
//que receba o número de horas trabalhadas e o valor do salário mínimo. Calcule e
//mostre o salário a receber seguindo as regras abaixo:
//a. o valor da hora trabalhada vale a metade do salário mínimo;
//b. o salário bruto equivale ao número de horas trabalhadas multiplicado pelo
//valor da hora trabalhada;
//c. o imposto equivale a 3% do salário bruto;
//d. o salário a receber equivale ao salário bruto menos o imposto.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o numero de horas trabalhas");
        double horasTrabalhadas = teclado.nextDouble();
        System.out.println("Digite o salario minimo");
        double salarioMinimo = teclado.nextDouble();

        double valorHoraTrabalhada = salarioMinimo/2;
        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        double imposto = salarioBruto * 3/100;
        double salarioReceber = salarioBruto - imposto;

        System.out.printf("O valor da hora trabalhada é de R$ %.2f \n", valorHoraTrabalhada);
        System.out.printf("O salário bruto é de R$ %.2f \n", salarioBruto);
        System.out.printf("O valor do imposto é de R$ %.2f \n", imposto);
        System.out.printf("O salário a receber é de R$ %.2f \n", salarioReceber);
    }
}