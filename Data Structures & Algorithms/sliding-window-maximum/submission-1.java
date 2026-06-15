class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if(nums.length==0){
            return new int[0];
        }

        int n=nums.length;
        int[] res=new int[n-k+1];
        
        for(int i=0;i<=n-k;i++){
            int mxe=nums[i];
            for(int j=i;j<i+k;j++){
                if(nums[j]>mxe){
                    mxe=nums[j];
                }
            }
            res[i]=mxe;
        }
        return res;
        
    }
}
