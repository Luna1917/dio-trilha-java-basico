import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número de sua Agência!");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor, digite sua Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu primeiro nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu último sobrenome!");
        String sobrenome = scanner.next();       
        
         System.out.println("Por favor, digite sua Agência!");
        double saldo = scanner.nextDouble();       


        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroAgencia + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}
