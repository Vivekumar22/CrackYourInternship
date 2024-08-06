class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        if(n ==1 ) return null;
        if(n == 2){
            if(nums[0] + nums[1] == target)
                return new int[]{0,1};
            else
                return null;
        }

        // Initialize pointer
        int temp1 = 0;
        int temp2 = temp1 + 1;

        while(n > temp1){
            if(temp2 >= n){
                temp1++;
                temp2 = temp1 + 1;
            }
            if(nums[temp1] + nums[temp2] == target)
                return new int[]{temp1,temp2};
            temp2++;
        }
        return null;
    }
}
