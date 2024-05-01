package interfaces;

import java.io.FileNotFoundException;

public interface ReprodutorMusical {
    public void tocar();
    
    public void pausar();
    
    public void selecionarMusica(String musica) throws FileNotFoundException;
    
    public void listarMusicas();
}
