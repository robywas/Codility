import java.util.Arrays;

public class L4PermCheck {

    //https://app.codility.com/demo/results/trainingWRA84T-DYM/?showingAll=1 - 66%
    //https://app.codility.com/demo/results/trainingJ77TQ5-RNU/?showingAll=1 - 83%
    //https://app.codility.com/demo/results/trainingAKVYB2-GHN/ - 100%

    public static void main(String[] args) {

        int[] A = {4, 1, 3, 2 };

        int value = Solution.solution(A);
    }


    static class Solution {

        public static int solution(int[] A) {

            int[] myArr = new int[A.length];

            if (A[0]!=1)
                return 0;
            Arrays.sort(A);

            for (int i = 1; i < A.length; i++)
                if (A[i] > A.length || A[i] - A[i-1] != 1)
                    return 0;
            return 1;
        }
    }
}