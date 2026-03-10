import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ComunidadeDeJogoTest {
    private Comunidade c;
    private Usuario u;
    private Jogo j;
    private List<Usuario> membros;

    @BeforeEach
    void setUp(){
        u = new Usuario("Manu", "Manuela");

        membros = new ArrayList<>();
        membros.add(u);
        j = new Jogo(1,"Monopoly");
        c = new ComunidadeDeJogo(membros,j);
    }
    @Test
    void adicionaDoisInvalidos(){
        Usuario u1 = new Usuario("JP","João Pedro");
        Usuario u2 = new Usuario("Gabi", "Gabriela");
        c.adicionaMembro(u1);
        c.adicionaMembro(u2);

        assertEquals(List.of("Manu"), c.apelidosMembros());
    }
    @Test
    void adicionaUmInvalidoUmVazio(){
        Usuario u3 = new Usuario("Gabi", "Gabriela");
        Usuario u4 = new Usuario("Nanda", "Maria Fernanda");
        j.avalia(u4.getApelido(),5);
        c.adicionaMembro(u3);
        c.adicionaMembro(u4);
        assertEquals(List.of("Manu","Nanda"), c.apelidosMembros());
    }
    @Test
    void adicionaDoisValidos(){
        Usuario u3 = new Usuario("Gabi", "Gabriela");
        Usuario u4 = new Usuario("Nanda", "Maria Fernanda");
        j.avalia(u3.getApelido(),4);
        j.avalia(u4.getApelido(),5);
        
        c.adicionaMembro(u3);
        c.adicionaMembro(u4);

        assertEquals(List.of("Manu","Gabi","Nanda"),c.apelidosMembros());
    }
}
