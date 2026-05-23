class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(nums[m]>nums[e]){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        int pivot=e;
        int ans;
        ans=binarySearch(nums,target,0,pivot-1);
        if(ans==(-1)){
            return binarySearch(nums,target,pivot,nums.length-1);
        }
        return ans;
        
        
    }

    public int binarySearch(int nums[],int target,int l,int r){
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]>target){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return -1;
    }
    
}
