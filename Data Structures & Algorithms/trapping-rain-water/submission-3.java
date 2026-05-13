class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }

        int n=height.length;
        int l=0;
        int r=n-1;
        int leftMax=height[l];
        int rightMax=height[r];
        int ans=0;

        while(l<r){
            if(leftMax<rightMax){
                l++;
                if(leftMax-height[l]>=0){
                   ans+=(leftMax-height[l]);
                }
                leftMax=Math.max(leftMax,height[l]);
            
            }
            else{
                r--;
                if(rightMax-height[r]>=0){
                   ans+=(rightMax-height[r]);
                }
                rightMax=Math.max(rightMax,height[r]);
              
            }
        }
        return ans;
        
    }
}
