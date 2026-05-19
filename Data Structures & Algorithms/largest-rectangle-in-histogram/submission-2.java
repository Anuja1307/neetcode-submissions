class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<int[]> stack=new Stack<>();
        int n=heights.length;
        
        int maxArea=0;

        for(int i=0;i<n;i++){
        
        int ind=i;
        while(!stack.isEmpty() && stack.peek()[1]>heights[i]){
            int[] temp=stack.pop();
            int area=(i-temp[0])*temp[1];
            maxArea=Math.max(maxArea,area);
            ind=temp[0];// as temp element height is taller we can extend
            //our element to left hence ind is set to temp[0]
        }
        stack.push(new int[]{ind,heights[i]});

        }
        while(!stack.isEmpty()){
            int[] temp=stack.pop();
            int area=temp[1]*(n-temp[0]);
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;

        
    }
}
