public class canMakeArithmeticProgression {
    class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            int n= arr.length;

            Arrays.sort(arr);

            int d = arr[1] - arr[0];
            for (int i = 2; i < n; i++)
                if (arr[i] - arr[i-1] != d)
                    return false;

            return true;

        }
    }
}
