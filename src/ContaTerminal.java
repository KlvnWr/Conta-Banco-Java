import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem-vindo ao SantanBank");
        System.out.println("Qual seria o número da conta ?");
        int conta = scanner.nextInt();

        System.out.println("E a agencia ? (xxx-x)");
        String agencia = scanner.next();

        System.out.println("Seu nome completo");
        scanner.nextLine();
        String nomeCompleto = scanner.nextLine();

        System.out.println("E por ultimo, qual seria o saldo inicial depositado ?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
