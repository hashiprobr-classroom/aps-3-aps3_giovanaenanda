import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {
    private Usuario u;

    @BeforeEach
    void setUp(){
        u = new Usuario("Manu", "Manuela");
    }
    @Test
    void constroi(){
        assertEquals("Manu", u.getApelido());
        assertEquals("Manuela", u.getNome());
    }

    @Test
    void mudaNome(){
        u.setNome("João Pedro");
        assertEquals("João Pedro", u.getNome());
    }
}
