package testes;

import java.io.FileNotFoundException;

import iphone.Iphone;

public class main {
	public static void main(String[] args) throws FileNotFoundException {
		Iphone iPhone = new Iphone();
		
		//Reprodutor
		iPhone.selecionarMusica("nosso quadro");
		iPhone.pausar();
		iPhone.listarMusicas();
		
		//Telefone
		iPhone.atender();
		iPhone.ligar("5569932764885");
		iPhone.iniciarCorreioDeVoz();
		iPhone.listarNumeros();
		
		//Navegador
		iPhone.exibirPagina("www.globo.com");
		iPhone.atualizarPagina();
		iPhone.adicionarNovaAba();

	}
}
