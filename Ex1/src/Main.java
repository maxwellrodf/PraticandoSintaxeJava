import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner teclado = new Scanner(System.in);

            System.out.println("Digite o nome: ");
            nome = teclado.nextLine();

            System.out.println("Digite a idade: ");
            idade = teclado.nextInt();

        System.out.println("Meu nome é: " + nome + " e tenho " + idade + " anos ");
    }
}
