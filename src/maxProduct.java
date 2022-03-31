public class maxProduct {
    class Solution {
        public int maxProduct(int[] nums) {
            int n=nums.length;
            int product=(nums[0]-1)*(nums[1]-1);
            // System.out.print(product);
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if( product<(nums[i]-1)*(nums[j]-1))
                    {
                        product=(nums[i]-1)*(nums[j]-1);
                    }

                    //System.out.println(product);
                }
            }
            return product;

        }
    }
}
