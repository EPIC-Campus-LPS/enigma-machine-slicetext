import java.util.Map;

public class EnigmaMachine {
    Plugboard plugboard;
    Rotor rotor1 = new Rotor();
    Rotor rotor2 = new Rotor();
    Rotor rotor3 = new Rotor();
    Reflector reflector = new Reflector();

    private int firstRotations = 0;

    public EnigmaMachine(Map<Integer, Integer> cables) {
        this.plugboard = new Plugboard(cables);
    }

    public int encode(int input) {
        input = plugboard.encode(input);
        input = rotor1.encode(input);
        input = rotor2.encode(input);
        input = rotor3.encode(input);
        input = reflector.encode(input);
        input = rotor3.decode(input);
        input = rotor2.decode(input);
        input = rotor1.decode(input);
        input = plugboard.encode(input);
        rotor1.rotate();
        firstRotations++;
        if(firstRotations % 26 == 0) {
            rotor2.rotate();
        }
        if(firstRotations % (26 * 26) == 0) {
            rotor3.rotate();
        }
        return input;
    }

    public void resetRotation() {
        rotor1.rotation = 0;
        rotor2.rotation = 0;
        rotor3.rotation = 0;
    }
}
