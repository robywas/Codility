import java.util.Scanner;

public class L1Iterations {


    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Solution solution = new Solution();
        while (true) {
            int result = solution.solution(in.nextInt());
            System.out.println(result);
        }
    }

    static class Solution {


        public int solution(int N) {
            int gap = 0;
            int tmp = 0;
            String binStr = Integer.toBinaryString(N);
            for (int i = binStr.indexOf("1"); i < binStr.lastIndexOf("1"); i++)
                if (binStr.charAt(i) == '0') {
                    tmp++;
                    if (tmp > gap)
                        gap = tmp;
                } else {
                    tmp = 0;
                }
            return gap;
        }
    }
}
