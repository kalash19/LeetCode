public class findPeakElement {
    class Solution {
        public int findPeakElement(int[] nums) {
            int n=nums.length;
            int index=0;
            for(int i=1;i<n;i++)
            {
                if(nums[i]>nums[index])
                    index=i;
            }
            return index;

        }
    }
}
