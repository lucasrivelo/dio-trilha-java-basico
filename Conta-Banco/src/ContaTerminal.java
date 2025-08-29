import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String Cliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta !");
        numero = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Por favor, digite o seu nome completo !");
        Cliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu Saldo !");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("\nOlá " + Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}