import java.util.Map;

public class EnigmaMachine {
    Plugboard plugboard;
    Rotor rotor1 = new Rotor();
    Rotor rotor2 = new Rotor();
    Rotor rotor3 = new Rotor();
    Rotor reflector = new Rotor();

    public EnigmaMachine(Map<Integer, Integer> cables) {
        this.plugboard = new Plugboard(cables);
    }

    public int encode(int input) {
        input = plugboard.encode(input);
        input = rotor1.encode(input);
        input = rotor2.encode(input);
        input = rotor3.encode(input);
        input = reflector.encode(input);
        input = rotor3.encode(input);
        input = rotor2.encode(input);
        input = rotor1.encode(input);
        input = plugboard.encode(input);
        return input;
    }
}
