//10) Faça um algoritmo (Fluxograma e Pseudocódigo) que receba um número positivo
//e maior que zero, calcule e mostre:
//a) o número digitado ao quadrado;
//b) a raiz quadrada do número digitado;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número");
        double numero = teclado.nextDouble();

        double numeroQuadrado = Math.pow(numero, 2);
        double numeroRaizQuadrada = Math.sqrt(numero);

        System.out.printf("O número digitado ao quadrado é %.0f \n", numeroQuadrado);
        System.out.printf("A raiz quadrada do número digitado é %.0f \n", numeroRaizQuadrada);


    }
}