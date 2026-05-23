class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int res=nums[0];

        while(s<=e){
            if(nums[s]<nums[e]){
                res=Math.min(nums[s],res);
                return res;
            }
            int mid=s+(e-s)/2;
            res=Math.min(nums[mid],res);
            if(nums[mid]>=nums[s]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return res;
        
    }
}
