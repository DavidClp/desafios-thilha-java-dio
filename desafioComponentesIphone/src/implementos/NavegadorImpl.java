package implementos;

import interfaces.Navegador;

public class NavegadorImpl implements Navegador{
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Direcionado e exibindo a pagina em: " +url);
		System.out.println("");	
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionado nova aba no navegador");
		System.out.println("");	
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando aba atual");	
		System.out.println("");	
	}
}
