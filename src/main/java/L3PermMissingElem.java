import java.util.Arrays;


public class L3PermMissingElem {

//https://app.codility.com/demo/results/training3QTJ35-NPC/?showingAll=1
// https://app.codility.com/demo/results/trainingFJMZFK-S5U/?showingAll=1


    public static void main(String[] args) {

        int[] r = {2, 3, 1, 5};

        int value = Solution.solution(r);

    }


    static class Solution {

        public static int solution(int[] A) {

            if (A == null || A.length == 0)
                return 1;

            int[] t = new int[A.length + 2];
            Arrays.fill(t, 0);

            for (int i = 0; i < A.length; i++)
                t[A[i]] = A[i];

            for (int j = 1; j < t.length; j++)
                if (t[j] == 0)
                    return j;


            return 0;

        }

    }
}