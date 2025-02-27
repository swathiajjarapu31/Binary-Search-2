
//TC:O(n)
//SC:O(n)
//solved in leetcode:YES
class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[low]<=nums[high])
            {
                return nums[low];
            }



            if((mid==0||nums[mid]<nums[mid-1]) && ((mid==nums.length-1 || nums[mid]<nums[mid+1])))
            {
                return nums[mid];
            }
            // left sorted or not, always go to unsorted part to check the elements
            if(nums[low]<=nums[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
}