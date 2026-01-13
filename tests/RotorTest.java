import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotorTest {
    @Test
    public void encode() {
        Rotor rotor = new Rotor();

        for(int i = 0; i < rotor.spaghetti.length; i++) {
            assertEquals(rotor.spaghetti[i], rotor.encode(i));
        }
    }

    @Test
    public void rotate() {
        Rotor rotor = new Rotor();

        int oldCode = rotor.encode(1);
        rotor.rotate();
        int newCode = rotor.encode(0);
        assertEquals(oldCode, newCode);
    }

}