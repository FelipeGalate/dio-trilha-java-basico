import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Para criar sua conta, siga as instruções abaixo:");
            
            System.out.print("Por favor, digite o número da conta!\n");
            int numero = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Por favor, digite o número da Agência!\n");
            String agencia = sc.nextLine();
            
            System.out.println("Por favor, digite o seu nome!\n");
            String nome = sc.nextLine();
            
            System.out.println("Por favor, digite o seu saldo\n");
            Double saldo = sc.nextDouble();
            
            System.out.print("\033[H\033[2J");
            
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", nome, agencia, numero, saldo);
        }
    }
}
