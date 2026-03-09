import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
        j.avalia("João", 3);
        assertTrue(j.avaliado("João"));
        assertFalse(j.avaliado("Maria"));
        assertEquals(3.0, j.media(), DELTA);
    }
    @Test
    void avaliaDuasVezes(){
        j.avalia("João", 3);
        j.avalia("Maria", 4);

        assertTrue(j.avaliado("João"));
        assertTrue(j.avaliado("Maria"));
        assertEquals(3.5, j.media(), DELTA);
    }
    @Test
    void avaliaTresVezes(){
        j.avalia("João", 3);
        j.avalia("Maria", 4);
        j.avalia("João", 5);
        assertEquals(4.5, j.media(),DELTA);
    }
}
