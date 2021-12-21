package numbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> intList = new ArrayList<>();
        for(int x : input) {
            if (x > 0 & x % 2 == 0)
            intList.add(x);
        }
        intList.sort(Comparator.naturalOrder());
        System.out.println(intList);
    }
}
