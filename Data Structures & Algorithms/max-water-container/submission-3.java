class Solution {
    public int maxArea(int[] heights) {

        int s=0;
        int e=heights.length-1;
        int res=0;

        while(s<e){
            int area=(e-s)* Math.min(heights[s],heights[e]);
            res=Math.max(area,res);
            if(heights[s]>heights[e]){
                e--;
            }
           else{
            s++;
           }
        }
        return res;
        
    }
}
