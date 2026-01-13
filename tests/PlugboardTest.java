import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PlugboardTest {

    @Test
    public void encode() {
        HashMap<Integer, Integer> cables = new HashMap<>();
        cables.put(1, 2);
        cables.put(5, 7);
        Plugboard plugboard = new Plugboard(cables);
        assertEquals(2, plugboard.encode(1));
        assertEquals(1, plugboard.encode(2));
        assertEquals(3, plugboard.encode(3));
        assertEquals(4, plugboard.encode(4));
        assertEquals(5, plugboard.encode(7));
        assertEquals(7, plugboard.encode(5));
        assertEquals(6, plugboard.encode(6));
    }

}