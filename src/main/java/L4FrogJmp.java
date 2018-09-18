public class L4FrogJmp {
//https://app.codility.com/demo/results/trainingYXUGGK-KMA/?showingAll=1

    public static void main(String[] args) {

        int X = 10;
        int Y = 85;
        int D = 30;

        int value = Solution.solution(X, Y, D);

    }


    static class Solution {

        public static int solution(int X, int Y, int D) {
            if (X <= Y && D > 0) {
                if ((Y - X) % D == 0)
                    return (Y - X) / D;
                else
                    return ((Y - X) / D) + 1;

            }else return 0;
        }


    }
}