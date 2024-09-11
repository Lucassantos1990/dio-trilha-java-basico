import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Por favor Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println(" Por favor Digite o Saldo à ser Depositado: ");
        String saldo = scanner.next();

        //Aqui o usuário recebe o numero da conta e agencia
        int numero = 1021;

        String agencia = "067-8";


        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta " + numero + " e seu saldo " + saldo + ", já está disponível para saque.");
    }
}
