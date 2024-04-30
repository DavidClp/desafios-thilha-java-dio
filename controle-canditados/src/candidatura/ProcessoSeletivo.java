package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};	

		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}

	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentanto = true;
		boolean atendeu = false;

		do {
			atendeu = atender();
			continuarTentanto = !atendeu;

			if(continuarTentanto) {
				tentativasRealizadas++;
			} else {
				System.out.println("Contato realizado com sucesso!");
			}
		}while(continuarTentanto && tentativasRealizadas < 3);

		if(atendeu) {			
			System.out.println("Conseguimos contato com "+candidato + " na " + tentativasRealizadas + " tentativa!");
		} else {
			System.out.println("Não conseguimos contato com " +candidato + " número máximo tentativas realizadas!");
		}
		System.out.println("------------------------------");
	}

	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};	

		for(int indice = 0; indice < candidatos.length; indice ++) {
			System.err.println("O candidado de n° " + (indice+1) + " é o " + candidatos[indice]);
		}
	}

	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};	
		double salarioBase = 2000.0;

		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];

			double salarioPrentendido = valorPretendido();

			System.out.println("------------------------");
			System.out.println("O candidato " + candidato + " solicitou este valor de sálario R$ " + salarioPrentendido);
			if(salarioBase >= salarioPrentendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				System.out.println("------------------------");
				candidatosSelecionados++;
			}

			candidatoAtual++;
		} 

	}

	static void analisarCanditado(double salarioPretendido) {
		double salarioBase = 2000;

		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}
		else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");			
		} else {			
			System.out.println("Aguardandoo resultado dos demais candidatos");			
		}
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
}
