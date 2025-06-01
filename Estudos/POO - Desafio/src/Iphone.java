
import internet.navegadorInternet;
import java.util.Scanner;
import musical.reprodutorMusical;
import telefonia.aparelhoTelefonico;

public class Iphone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet{
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        Scanner sc = new Scanner(System.in);

        String musica = sc.nextLine();

        iphone.selecionarMusica(musica);
        iphone.tocar();
        iphone.pausar();

        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        String url = sc.nextLine();

        iphone.exibirPagina(url);

        iphone.ligar("123456789");
        iphone.iniciarCorreioVoz();
        iphone.atender();
        
        sc.close();
        
        
    }

    public void exibirPagina(String url) {
        System.out.println("abrindo página "+ url);
    }

  
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada");
    }

  
    public void atualizarPagina() {
        System.out.println("Página atualizad");
    }

   
    public void ligar(String numero) {
       System.out.println("Ligando para: "+ numero);
    }

   
    public void atender() {
        System.out.println("Ligação atendida");
    }

   
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    
    public void pausar() {
        System.out.println("Pausando música");
    }

    
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: "+ musica);
    }

    
   
}
