import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite os 3 primeiros número da Agência !");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, digite os 3 últimos número da Agência !");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome completo !");
        String Nome = scanner.next();

        System.out.println("Por favor, digite o seu saldo !");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá" + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");

        scanner.close();
    }
}
