import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o saldo da aplicação");
        double saldo = teclado.nextDouble();

        double novoSaldo = saldo + (saldo * 15/100);

        System.out.printf("O novo saldo é de R$ %.2f", novoSaldo); //printf converte double, int para String.
    }
}