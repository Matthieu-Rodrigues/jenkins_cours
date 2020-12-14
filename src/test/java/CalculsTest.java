import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculsTest {

    @Test
    public void testerMultipliser(){
        Calculs calculs = new Calculs(2,4);

        int valMult = calculs.multiplier();

        assertEquals(valMult, 8);
    }

    @Test
    public void testerAdditionner(){
        Calculs calculs = new Calculs(2,4);

        int valAdd = calculs.additionner();

        assertEquals(valAdd, 6);
    }
}