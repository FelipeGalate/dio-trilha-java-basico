package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        
        String [] candidatos = {"Felipe", "Julia", "Thayna", "Thaiane", "Larissa"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }


        }


    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe", "Julia", "Thayna", "Thaiane", "Larissa"};

        int candidatosSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionado < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato + " Solicitou este valor des salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
                candidatosSelecionado++;
            }
            candidatoAtual++;
        }
        

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    //Método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");

            
        } while (continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("Conseguimos contato com "+ candidato + " Na " + tentativasRealizadas);
        else
            System.out.println("não conseguimos contato com "+ candidato+ " numero máximos de tentativas "+ tentativasRealizadas);
    }


    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Julia", "Thayna", "Thaiane", "Larissa"};
        /*for(int i = 0; i < candidatos.length; i++ ){
            System.out.println("o candidato número: " + (i+1) + "é o candidato: "+ candidatos[i]); */

        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi "+ candidato);
        }
        }
    }

    //Antigo método
    /*static void analisarCandidato(double salarioPretendido){

        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para Candidato");
        }
        else if( salarioBase == salarioPretendido){
            System.out.println("Ligar para candidato com contra proposta");
        }
        else{
            System.out.println("Aguardando os resultados dos demais candidatos");
        }
    }*/

    

