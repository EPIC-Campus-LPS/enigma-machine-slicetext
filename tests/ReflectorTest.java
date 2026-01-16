import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReflectorTest {

    @Test
    void encode() {
        Reflector r = new Reflector();
        for(int i = 0; i < 26; i++) {
            int result = r.encode(r.encode(i));

            assertEquals(i, result);
        }
    }
}