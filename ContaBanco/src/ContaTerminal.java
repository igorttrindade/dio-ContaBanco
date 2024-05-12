import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double saldo = 237.48;

        System.out.println("Digite seu número: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite seu agencia: ");
        String agenciaBanco = sc.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBanco + ", conta " + numeroConta +
                " seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }

}