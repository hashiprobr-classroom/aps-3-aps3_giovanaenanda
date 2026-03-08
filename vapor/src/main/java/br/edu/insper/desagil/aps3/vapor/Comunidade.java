import java.util.ArrayList;
import java.util.List;

public abstract class Comunidade {
    private List<Usuario> membros;

    public Comunidade(List<Usuario> membros){
        this.membros = membros;
    }

    public void adicionaMembro(Usuario usuario){
        membros.add(usuario);
    }

    public List<String> apelidosMembros(){
        List<String> membros = new ArrayList<>();
        return membros;
    }

}
