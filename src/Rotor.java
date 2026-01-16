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

    public int encode(int input) {
        input += rotation;
        input %= 26;
        return spaghetti[input] + rotation;
    }

    public int decode(int input) {
        input -= rotation;
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
