import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2, 4};

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        System.out.println(mp);
    }
}