package implementos;

import java.io.FileNotFoundException;
import java.util.List;

import interfaces.ReprodutorMusical;

public class ReprodutorMusicalImpl implements ReprodutorMusical{
	private List<String> musicaList;
	private int index;

	public ReprodutorMusicalImpl(List<String> musicaList) {
		super();
		this.musicaList = musicaList;
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica " + musicaList.get(index));
		System.out.println("");	
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");
		System.out.println("");	
	}

	@Override
	public void selecionarMusica(String musica) throws FileNotFoundException {
		musica = musica.toLowerCase();
		index = musicaList.indexOf(musica);
		
		if(index == -1) {
			throw new FileNotFoundException("Musica não encontrado");
		}
		
		tocar();
	}

	@Override
	public void listarMusicas() {
		System.out.println("===== LISTA DE MUSICAS =====");
		for(int i = 0; i < musicaList.size(); i++) {			
			System.out.println("Musica " + (i+1) + " " + musicaList.get(i));
		}
		System.out.println("");	
	}

}
