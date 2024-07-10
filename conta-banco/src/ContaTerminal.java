import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome ");
        String nome  = scanner.next();
        String sobrenome = scanner.next ();

        System.out.println("Digite seu agencia");
        String agencia = scanner.next();

        System.out.println("Digite sua conta");
        int conta = scanner.nextInt();

        System.out.println("Digite sua saldo");
        double saldo = scanner.nextDouble();
    
        System.out.println(" Ola , " + nome  +  sobrenome  +  " obrigado por criar uma conta em nosso banco");
        System.out.println(" sua agência é : " + agencia );
        System.out.println(" conta : " + conta  );
        System.out.println( + saldo + " já está disponível para saque");
    

        
    }
}
