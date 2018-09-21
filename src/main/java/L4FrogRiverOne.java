import java.util.HashSet;

public class L4FrogRiverOne {

//https://app.codility.com/demo/results/training7DNNJT-XVT/ 100%

    public static void main(String[] args) {

        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int X = 5;

        int value = Solution.solution(X, A);
    }


    static class Solution {

        public static int solution(int X, int[] A) {

            if (X == 0 || A == null)
                throw new IllegalArgumentException("cant be empty");


            HashSet<Integer> mySet = new HashSet<>();
            int i = 0;
            for (i = 0; i < A.length; i++) {
                if (A[i] <= X) {
                    mySet.add(A[i]);
                    if (mySet.size() == X)
                        return i;
                }
            }
            return -1;
        }
    }
}