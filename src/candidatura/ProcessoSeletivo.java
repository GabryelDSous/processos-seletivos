package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		for(String candidato : candidatos) {
			entrandoEmContato( candidato);
		}
	}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizada = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando = !atendeu) {
				tentativasRealizada++;
			} else {
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}
		} while(continuarTentando && tentativasRealizada < 3);
		
		if(atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizada + " TENTATIVAS");
		} else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MAXIMO DE TENTATIVAS " + tentativasRealizada);
		}
	}
	
	// método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionado() {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de n° " + (indice + 1) + " é " + candidatos[indice]);
		}
		
		System.out.println("Forma abreviada de interação for each");
		for(String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		
		int candidatosSelecionados = 0;
		double salarioBase = 2000.0;
		int candidatosAtual = 0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}