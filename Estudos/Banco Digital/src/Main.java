public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        Banco meuBanco = new Banco("Banco Digital");
        meuBanco.adicionarConta(cc);
        meuBanco.adicionarConta(cp);

        cc.depositar(1000);
        cc.sacar(200);
        cc.transferir(300, cp);

        cc.imprimirExtrato(); 
        cp.imprimirExtrato(); 

        System.out.println("\nExtratos de todas as contas no banco:");
        for (Conta conta : meuBanco.getContas()) {
            conta.imprimirExtrato(); 
        }
    }
}