import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }


    public Conta buscarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null; 
    }
}