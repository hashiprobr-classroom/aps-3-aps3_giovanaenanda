import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class LojaTest {
    private Loja l;
    private Usuario u;
    private List<Jogo> jogos;

    @BeforeEach
    void setUp(){
        Usuario u = new Usuario("Manu", "Manuela");
        jogos = new ArrayList<>();
        jogos.add(new Jogo(1,"Monopoly"));
        jogos.add(new Jogo(2,"Damas"));
        jogos.add(new Jogo(3, "Xadrez"));
        l = new Loja(u, jogos);
    }

    @Test
    void constroi(){
        assertEquals(u, l.getDono());
        assertEquals(0, l.numeroAvaliados(u));
    }
    @Test
    void umUsuarioAvaliaUmJogo(){
        jogos.get(0).avalia(u.getApelido(),4);
        assertEquals(1, l.numeroAvaliados(u));
    }
    @Test
    void umUsuarioAvaliaDoisJogos(){
        jogos.get(0).avalia(u.getApelido(),4);
        jogos.get(1).avalia(u.getApelido(),5);
        assertEquals(2, l.numeroAvaliados(u));
    }
    @Test
    void doisUsuariosAvaliamUmJogo(){
        jogos.get(0).avalia(u.getApelido(),4);
        assertEquals(1, l.numeroAvaliados(u));
        Usuario u_novo = new Usuario("JP", "João Pedro");
        jogos.get(0).avalia(u_novo.getApelido(),7);
        assertEquals(1, l.numeroAvaliados(u_novo));
    }
    @Test
    void doisUsuariosAvaliamDoisJogos(){
        jogos.get(0).avalia(u.getApelido(),4);
        Usuario novo_usuario = new Usuario("Nanda", "Maria Fernanda");
        jogos.get(1).avalia(novo_usuario.getApelido(), 8);
        assertEquals(1, l.numeroAvaliados(u));
        assertEquals(1,l.numeroAvaliados(novo_usuario));
    }
}