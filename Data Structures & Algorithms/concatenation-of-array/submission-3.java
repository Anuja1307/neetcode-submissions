class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[nums.length*2];
        if(nums.length>=1 && nums.length<=1000){
            
        for (int i=0;i<nums.length;i++){
            if(nums[i]<=1000){
                ans[i]=nums[i];
                ans[n+i]=nums[i];
            }
            else{

            }
        }
        }
        else{
            for (int i=0;i<1000;i++){
               if(nums[i]<=1000){
                    ans[i]=nums[i];
                    ans[n+i]=nums[i];

                }

            }
        }
        return ans;
        }
        
    }
