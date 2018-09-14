public class L2CyclicRotation {


    public static void main(String[] args) {


        int[] A = {1, 2, 3, 4};
        int K = 4;

        int[] newArr = Solution.solution(A, K);

        System.out.println(newArr.toString());
    }


    static class Solution {


        public static int[] solution(int[] A, int K) {
            int[] holder = new int[A.length];
            int count = 0;
            if (K > 0) {
                while (count < K) {
                    count++;
                    System.arraycopy(A, 0, holder, 1, A.length - 1);
                    holder[0] = A[A.length - 1];
                    System.arraycopy(holder, 0, A, 0, A.length);
                }
            }
            return A;
        }
    }


}
