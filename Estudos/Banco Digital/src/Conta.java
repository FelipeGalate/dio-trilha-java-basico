
public abstract class Conta {
    private static final int AGENCIA_PADRAO = 1; // Para simplificar, agência padrão
    private static int SEQUENCIAL = 1; // Para gerar números de conta únicos

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0.0; 
        this.cliente = cliente;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso. Novo saldo: R$" + String.format("%.2f", saldo));
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso. Novo saldo: R$" + String.format("%.2f", saldo));
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor); 
            contaDestino.depositar(valor); 
            System.out.println("Transferência de R$" + String.format("%.2f", valor) + " para a conta " + contaDestino.getNumero() + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }


    public abstract void imprimirExtrato();
}