public class countKDifference {
    class Solution {
        public int countKDifference(int[] nums, int k) {
            int ans=0;
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(nums[i]-nums[j]==k)
                        ans=ans+1;
                }
            }
            return ans;

        }
    }
}
