package codechallenges.classificandomatrizes;

import java.util.ArrayList;
import java.util.List;

// Understand and improve algorithms;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5, // 1
                1, // 2
                3, // 3
                4, // 1
                5, // 4
                2}; // 2
        evenToOdd(nums);
    }
    static void evenFirstOddLast(int[] array) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int element : array) {
            if (element % 2 != 0) {
                oddList.add(element);
            } else {
                evenList.add(element);
            }
        }
        List<Integer> result = new ArrayList<>(evenList);
        result.addAll(oddList);

        System.out.println("---- result ----");
        for (Integer element : result) {
            System.out.println(element);
        }
    }
    static void evenToOdd (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                for (int j = (i + 1); j < array.length; j++)
                    if (array[j] % 2 == 0) {
                        int aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                        j = array.length;
                    }
            }
        }
        for (int element : array) {
            System.out.println(element);
        }
    }
}

