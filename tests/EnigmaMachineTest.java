import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class EnigmaMachineTest {

    @Test
    void encode() {
        HashMap<Integer, Integer> cables = new HashMap<>();
        EnigmaMachine enigmaMachine = new EnigmaMachine(cables);
        int result = enigmaMachine.encode(1);
        System.out.println(result);
        result = enigmaMachine.encode(result);
        assertEquals(1, result);
    }
}