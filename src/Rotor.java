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
        for(int i = 0; i < spaghetti.length; i++) {
            int rand;
            do {
                rand = (int)(Math.random() * 27);
            } while(spaghettiContains(rand));

            spaghetti[i] = rand;
        }
    }

    public int encode(int input) {
        input += rotation;
        input %= 26;
        return spaghetti[input];
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
