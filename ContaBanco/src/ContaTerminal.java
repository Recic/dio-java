import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner read = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = read.next();

        System.out.println("Por favor, digite o número de sua conta: ");
        numero = read.nextInt();

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = read.next();

        System.out.println("Por favor, Digite o saldo: ");
        saldo = read.nextDouble();
        
        System.out.println("Ola " + nomeCliente + ", Obrigado por criar uma conta em nosso banc, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
