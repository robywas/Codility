public class L3TapeEquilibrium {
//https://app.codility.com/demo/results/trainingDDJM6C-84X/?showingAll=1
// https://app.codility.com/demo/results/trainingUCYZG8-BSB/?showingAll=1

    public static void main(String[] args) {

        int[] A = {3, 1, 2, 4, 3};

        int value = Solution.solution(A);
    }


    static class Solution {

        public static int solution(int[] A) {
            int sum = 0;
            for (int i : A)
                sum +=i;

            int sumL = A[0];
            int sumR = sum - sumL;
            int diff = difference(sumL, sumR);
            int smallestDiff = diff;

            for (int i = 1; i < A.length - 1; i++) {
                sumL = sumL + A[i];
                sumR = sumR - A[i];
                diff = difference(sumL, sumR);
                if (diff < smallestDiff) {
                    smallestDiff = diff;
                }

            }
            return smallestDiff;

        }

        private static int difference(int a, int b) {
            return Math.max(a, b) - Math.min(a, b);

        }


    }
}