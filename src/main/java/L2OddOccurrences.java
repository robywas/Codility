import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class L2OddOccurrences {


    public static void main(String[] args) {


        int[] A = {9, 3, 9, 3, 9, 7, 9};
        Solution solution = new Solution();
        solution.solution(A);
    }

    static class Solution {


        public int solution(int[] A) {


            Arrays.sort(A);
            List<Integer> list = IntStream.of(A).boxed().collect(Collectors.toList());
            List<Integer> tmp;

            int f = A[0];
            int last = list.lastIndexOf(f);

            while (f!= last){

                last = list.lastIndexOf(f);



            }


            return A[0];
        }
    }
}
