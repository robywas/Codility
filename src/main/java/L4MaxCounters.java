import java.util.Arrays;

public class L4MaxCounters {

    //https://app.codility.com/demo/results/trainingW5EMW4-BXG/ - 77%

    public static void main(String[] args) {

        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5; //liczba counterów

        int[] v = Solution.solution(N, A);
    }


    static class Solution {


        //if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
        //if A[K] = N + 1 then operation K is max count


        public static int[] solution(int N, int[] A) {
            int[] counters = new int[N];
/*            for (int c : counters) {
                c = 0;
            }*/
            int max = 0;

            for (int K = 0; K < A.length; K++) {
                if (A[K] < N + 1) {
                    counters[A[K] - 1]++;
                    if (counters[A[K] - 1] > max)
                        max = counters[A[K] - 1];
                } else
                    for (int j=0; j<counters.length;j++)
                        counters[j] = max;
            }
            return counters;
        }

    }


}