import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogoTest {
    private static final double DELTA = 0.01;

    private Jogo j;

    @BeforeEach
    void setUp(){
        j = new Jogo(1, "João");
    }

    @Test
    void constroi(){
        assertEquals(1, j.getId());
        assertEquals("João", j.getNome());
        assertEquals(0.0, j.media(), DELTA);
    }

    @Test
    void avaliaUmaVez(){
        Jogo j = new Jogo(2, "Maria");
        
    }
}
