/**
 * Find_Duplicate_Numbers
 */
public class Find_Duplicate_Numbers {

    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<>();
        int duplicate = -1;

        for (int x : arr) {
            mp.put(x, 1 + mp.getOrDefault(x, 0));
        }

        for (int i = 1; i < arr.length; i++) {  
            if (mp.containsKey(i)) {
                if (mp.get(i) >= 2) {
                    duplicate = i;
                }
            }
        }

        return duplicate;
    }
}
    }
}