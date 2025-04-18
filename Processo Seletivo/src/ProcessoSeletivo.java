import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        selecaoCandidatos();
        imprimirSelecao();
       

    }

    static void imprimirSelecao(){
        String [] candidatos = {"João", "Maria", "José", "Larissa"}; 
        System.out.println("Imprimir a lista de candidatos selecionados.");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"João", "Maria", "José", "Ana", "Larissa"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.00;
        while (candidatosSelecionados < 3 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretencao = valorPretendido();
            System.out.println("O candidato " + candidato + " tem a pretensão salarial de: " + salarioPretencao);
            if(salarioBase >= salarioPretencao){
                System.out.println("O candidato " + candidato + " foi selecionado.");
                candidatosSelecionados++;
        }
        candidatosAtual++;
        }
    }
    static double  valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);
    }

    static void analisarPretencaoSalarial(double pretencaoSalarial){
        double salarioBase = 2000.00;
        if (pretencaoSalarial < salarioBase) {
            System.out.println("Ligar para o candidato.");
        } else if (pretencaoSalarial == salarioBase) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando o resultado de outros candidatos.");
        }
    }
}
