import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ComunidadeTest {
    private Comunidade c;
    private Usuario u;
    private List<Usuario> membros;

    @BeforeEach
    void setUp(){
        u = new Usuario("Manu", "Manuela");

        membros = new ArrayList<>();
        membros.add(u);
        c = new Comunidade(membros){};
    }

    @Test
    void constroi(){
        assertEquals(List.of("Manu"), c.apelidosMembros());
    }
    @Test
    void adicionaMembro(){
        Usuario u1 = new Usuario("JP", "João Pedro");
        membros.add(u1);
        assertEquals(List.of("Manu", "JP"), c.apelidosMembros());
    }
    @Test
    void adicionaDoisMembros(){
        Usuario u2 = new Usuario("Nanda", "Maria Fernanda");
        Usuario u3 = new Usuario("Gigi", "Giovana");
        membros.add(u2);
        membros.add(u3);
        assertEquals(List.of("Manu", "Nanda", "Gigi"), c.apelidosMembros());
    }
}
