import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class CalculsTest {

    private Calculs c1 = null;
    private Calculs c2 = null;
    private Calculs c3 = null;

    @BeforeEach
    public void setup() throws Exception
    {
        c1 = new Calculs(1,2);
        c2 = new Calculs(10,200);
        c3 = new Calculs(100,200);
    }


    @Test
    void testMultiplier() {
        if (c1.multiplier() != 2)
        {
            fail("Méthode multiplier incorrecte");
        }

        assertEquals(c1.multiplier(), 2);
    }

    @Test
    void testAdditionner() {
        if (c1.additionner() != 3)
        {
            fail("Méthode additionner incorrecte");
        }

        assertEquals(c1.additionner(), 3);
    }

    @Test
    void testSoustraire() {
        if (c1.soustraire() != -1)
        {
            fail("Methode soustraire incorrecte");
        }

        assertEquals(c1.soustraire(), -1);
    }
}
