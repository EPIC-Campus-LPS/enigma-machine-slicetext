import java.util.HashMap;
import java.util.Map;

public class Reflector {
    Map<Integer, Integer> spaghetti;

    public Reflector() {
        spaghetti = new HashMap<>();
        for(int i = 0; i < 13; i++) {
            int rand1;
            int rand2;
            do {
                rand1 = (int)(Math.random() * 26);
                rand2 = (int)(Math.random() * 26);
            } while(spaghetti.containsKey(rand1) || spaghetti.containsValue(rand1) || spaghetti.containsKey(rand2) || spaghetti.containsValue(rand2) || rand1 == rand2);
            spaghetti.put(rand1, rand2);
        }
    }

    public Reflector(Map<Integer, Integer> spaghetti) {
        this.spaghetti = spaghetti;
    }

    public int encode(int input) {
        if(spaghetti.containsKey(input)) {
            return spaghetti.get(input);
        } else if(spaghetti.containsValue(input)) {
            for (Map.Entry<Integer, Integer> e : spaghetti.entrySet()) {
                if (e.getValue() == input) {
                    return e.getKey();
                }
            }
        }
        return input;
    }
}
