import java.util.Map;

public class Plugboard {
    Map<Integer, Integer> cables;

    public Plugboard(Map<Integer, Integer> cables) {
        this.cables = cables;
    }

    public int encode(int input) {
        if(cables.containsKey(input)) {
            return cables.get(input);
        } else if(cables.containsValue(input)) {
            for (Map.Entry<Integer, Integer> e : cables.entrySet()) {
                if (e.getValue() == input) {
                    return e.getKey();
                }
            }
        }
        return input;
    }
}
