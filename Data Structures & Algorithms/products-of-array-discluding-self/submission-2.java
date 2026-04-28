class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[]=new int[nums.length];
        prefix[0]=1;
        if(nums.length>=2 && nums.length<=1000){
             for(int i=1;i<nums.length;i++){
                   prefix[i]=prefix[i-1]*nums[i-1];
                
        }
        int suffix[]=new int[nums.length];
        suffix[nums.length-1]=1;
        int n=nums.length;
        for (int i=1;i<nums.length;i++){
                suffix[n-i-1]=suffix[n-i]*nums[n-i];
            }
        
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=prefix[i]*suffix[i];
        }
        return ans;
        }
        return new int[0];


        }
       
}     
    

