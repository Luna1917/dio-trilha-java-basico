// O import permite trazer novos métodos para utilização dentro da classe
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Para receber entrada do usuário é necessário primeiro criar um novo Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        /*
         * Com o novo Scanner podemos receber input do usuário por meio do terminal.
         * Enquanto variáveis String podem utilizar apenas "scanner.next()", outros tipos de variáveis devem ser especificados após o next, como pode ser visto abaixo.
         */
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

        // Todas variáveis tendo sido preenchidas pelo usuário, podemos imprimir essas informações, entre muitas outras coisas.
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroAgencia + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}