import java.util.*;

public class RandomValuesDemo {
    public static void main(String args[]) {
        HashMap<Integer, Double> hashMap = new HashMap<>();

        Integer[] keys = { 17, 23, 89, 42, 38, 5, 120, 225, 467, 840 };
        Double[] values = { 2.5, 67.84, 178.90, 324.783, 671.2, 76.4, 29.45, 56.42, 982.517, 45.31 };

        RandomValues<Integer, Double> map = new RandomValues<>(keys, values);

        for (int i = 0; i < 10; i++) {
            hashMap.put(map.keys[i], map.values[i]);
        }

        for (Map.Entry<Integer, Double> m : hashMap.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}