import java.util.List;

public class Loja {
    private Usuario dono;
    private List<Jogo> jogos;

    public Loja(Usuario dono,List<Jogo> jogos){
        this.dono = dono;
        this.jogos = jogos;
    }

    public Usuario getDono(){
        return dono;
    }

    public Integer numeroAvaliados(Usuario usuario){
        int contador = 0;

        for (Jogo j: jogos){
            if (j.avaliado(usuario.getApelido())){
                contador ++;
            }
        }
        return contador;
    }
}
