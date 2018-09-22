import java.util.HashSet;

public class L4MissingInteger {

//https://app.codility.com/demo/results/trainingWEPQEH-YP8/ - 100%

    public static void main(String[] args) {

//        int[] A = {1, 3, 6, 4, 1, 2};
        int[] A = {1, 2,3};
//        int[] A = {-1, -3};

        int v = Solution.solution(A);
    }


    static class Solution {


        public static int solution(int[] A) {
            HashSet<Integer> set = new HashSet<>();
            int counter = 1;
            for (int i = 0; i < A.length; i++) {
                if (A[i] > 0)
                    set.add(A[i]);
            }
            while (true) {
                if (!set.contains(counter))
                    return counter;
                    counter++;
            }
        }
    }

}


