import java.util.Arrays;

public class Rotor {
    int[] spaghetti;
    int rotation = 0;

    public Rotor(int[] spaghetti) {
        if(spaghetti.length != 26) {
            throw new IllegalArgumentException("The spaghetti does not contain all 26 wires");
        }
        this.spaghetti = spaghetti;
    }

    public Rotor() {
        spaghetti = new int[26];
        for(int i = 0; i < spaghetti.length - 1; i++) {
            int rand;
            do {
                rand = (int)(Math.random() * 26);
            } while(spaghettiContains(rand));

            spaghetti[i] = rand;
        }
    }

    public int encode(int input, boolean reflector) {
        input += rotation;
        input %= 26;
        if(!reflector) {
            return spaghetti[input] + rotation;
        } else {
            return spaghetti[input];
        }
    }

    public int decode(int input, boolean reflector) {
        if(!reflector) {
            input -= rotation;
        }
        if(input < 0) {
            input = input + 26;
        }
        for(int i = 0; i < spaghetti.length; i++) {
            if (spaghetti[i] == input) {
                return (i - rotation >= 0)? i - rotation : (i - rotation) + 26;
            }
        }
        throw new IllegalArgumentException();
    }

    public void rotate() {
        rotation += 1;
        rotation %= 26;
    }

    private boolean spaghettiContains(int input) {
        for(int i : spaghetti) {
            if(i == input) {
                return true;
            }
        }
        return false;
    }
}
