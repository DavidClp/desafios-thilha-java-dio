package implementos;

import java.util.List;

import interfaces.AparelhoTelefonico;

public class TelefoneImpl implements AparelhoTelefonico{
	private List<String> contatoList;
	private int index;	 


	public TelefoneImpl(List<String> listaContatos) {
		super();
		this.contatoList = listaContatos;
	}	
	
	@Override
	public void ligar(String numero) {
		System.out.println("ligando para o numero " + contatoList.get(index));	
		System.out.println("");	
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligacao...");
		System.out.println("");	
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando Correio de Voz...");	
		System.out.println("");	
	}

	@Override
	public void listarNumeros() {
		System.out.println("===== LISTA TELEFONICA =====");
		for(int i = 0; i < contatoList.size(); i++) {			
			System.out.println("N° " + (i+1) + " " + contatoList.get(i));
		}
		System.out.println("");	
	}
}
