package iphone;

import java.io.FileNotFoundException;

import interfaces.AparelhoTelefonico;
import interfaces.Navegador;
import interfaces.ReprodutorMusical;
import so.SistemaOperacional;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador  {
	private SistemaOperacional sistemaOperacional;

	public Iphone() {
		sistemaOperacional = new SistemaOperacional();
	}

	// Implementação dos métodos da interface reprodutor musical
	@Override
	public void tocar() {
		sistemaOperacional.getReprodutorMusical().tocar();
	}

	@Override
	public void pausar() {
		sistemaOperacional.getReprodutorMusical().pausar();
	}

	@Override
	public void selecionarMusica(String musica) throws FileNotFoundException {
		sistemaOperacional.getReprodutorMusical().selecionarMusica(musica);
	}
	
	@Override
	public void listarMusicas() {
		sistemaOperacional.getReprodutorMusical().listarMusicas();
	}

	// Implementação dos métodos da interface Telefone
	@Override
	public void ligar(String numero) {
		sistemaOperacional.getTelefone().ligar(numero);
	}

	@Override
	public void atender() {
		sistemaOperacional.getTelefone().atender();
	}

	@Override
	public void iniciarCorreioDeVoz() {
		sistemaOperacional.getTelefone().iniciarCorreioDeVoz();
	}
	
	@Override
	public void listarNumeros() {
		sistemaOperacional.getTelefone().listarNumeros();
	}

	// Implementação dos métodos da interface Navegador
	@Override
	public void exibirPagina(String url) {
		sistemaOperacional.getNavegador().exibirPagina(url);
	}

	@Override
	public void adicionarNovaAba() {
		sistemaOperacional.getNavegador().adicionarNovaAba();
	}

	@Override
	public void atualizarPagina() {
		sistemaOperacional.getNavegador().atualizarPagina();
	}



}
