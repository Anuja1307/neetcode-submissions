class Solution {
    public int trap(int[] height) {
        
        int n=height.length;
        int[] prefix=new int[height.length];
        prefix[0]=0;
        int maxLe=0;
        int ans=0;

        for(int i=1;i<n;i++){
            if(maxLe<height[i-1]){
                maxLe=height[i-1];
            }
            prefix[i]=maxLe;
        }

        int[] suffix =new int[height.length];
        int maxRi=0;
        suffix[n-1]=0;
        for(int i=n-2;i>=0;i--){
            if(height[i+1]>maxRi){
                maxRi=height[i+1];
            }
            suffix[i]=maxRi;
        }

        for(int i=0;i<n;i++){
            int boundary=Math.min(prefix[i],suffix[i]);
            int actualHeight=boundary-height[i];
            if(actualHeight>=0){
                ans+=actualHeight;
            }

        }
        return ans;
        
    }
}
