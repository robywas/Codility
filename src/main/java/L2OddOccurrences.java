import org.apache.commons.lang3.ArrayUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;


public class L2OddOccurrences {

    //static Random random = new Random();
    private static int notAllowedValue;


    public static void main(String[] args) {

        int arraySize = 10;
        int maxValue = 10;
        notAllowedValue = maxValue / 2;

        int[] r = doubleArray(createArrayWithIntsExcludingValues(arraySize, maxValue));

//        System.out.println("Dodano wartość: " + notAllowedValue);


        int value = Solution.solution(r);
        System.out.println("Dodano wartość: " + notAllowedValue + "; wyszukana wartość: " + value);


    }

    private static int[] doubleArray(int[] arr) {
        int[] notAllowedNumbers = new int[1];
        notAllowedNumbers[0] = notAllowedValue;
        int[] newNumbers = ArrayUtils.addAll(arr, arr);
        return newNumbers = ArrayUtils.addAll(newNumbers, notAllowedNumbers);
    }

    private static int[] createArrayWithIntsExcludingValues(int size, int maxValue) {
        int[] numbers = new int[size];
        int i = 0;
        int x = 0;

        while (i < size) {
            x = ThreadLocalRandom.current().nextInt(1, maxValue + 1);
            if (isAllowed(x)) {
                numbers[i] = x;
                i++;
            }
        }
        return numbers;
    }

    private static boolean isAllowed(int x) {
        return x != notAllowedValue;
    }


    static class Solution {

        public static int solution(int[] A) {



            Map<Integer, Integer> map = new HashMap<Integer, Integer>();

            for (int i = 0; i < A.length; i++) {
                if (map.get(A[i]) != null) {
                    int v = map.get(A[i]);
                    map.put(A[i], v + 1);
                }
                else
                    map.put(A[i], 1);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 != 0)
                    return entry.getKey();
            }
            return 0;

        }

    }
}