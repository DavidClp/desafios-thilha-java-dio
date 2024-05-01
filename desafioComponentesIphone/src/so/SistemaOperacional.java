package so;

import implementos.NavegadorImpl;
import implementos.ReprodutorMusicalImpl;
import implementos.TelefoneImpl;
import interfaces.AparelhoTelefonico;
import interfaces.Navegador;
import interfaces.ReprodutorMusical;

public class SistemaOperacional {
	private ReprodutorMusical reprodutorMusical;
	private AparelhoTelefonico telefone;
	private Navegador navegador;

	public SistemaOperacional() {
		reprodutorMusical = new ReprodutorMusicalImpl(Memoria.getMusicas());
		telefone = new TelefoneImpl(Memoria.getListaContatos());
		navegador = new NavegadorImpl();
	}

	public ReprodutorMusical getReprodutorMusical() {
		return reprodutorMusical;
	}

	public AparelhoTelefonico getTelefone() {
		return telefone;
	}

	public Navegador getNavegador() {
		return navegador;
	}
}
