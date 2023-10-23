import java.util.Scanner;

//Faça um algoritmo (Fluxograma e Pseudocódigo) que receba o ano de nascimento
//de uma pessoa e o ano atual, calcule e mostre:
//a) A idade dessa pessoa;
//b) Quantos anos essa pessoa terá em 2030;

public class Main {
    public static void main(String[] args) {
        double ano2030 = 2030;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento");
        double anoNascimento = teclado.nextInt();
        System.out.println("Digite o ano atual");
        double anoAtual = teclado.nextInt();

        double idadePessoa = anoAtual - anoNascimento;
        double idadePessoa2030 = ano2030 - anoNascimento;

        System.out.printf("A idade atual da pessoa é %.0f anos \n" , idadePessoa);
        System.out.printf("A idade da pessoa em 2030 será de %.0f anos \n", idadePessoa2030);





    }
}