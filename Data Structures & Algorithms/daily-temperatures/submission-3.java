class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result=new int[temperatures.length];
        int n=temperatures.length;
        Stack<int[]> stack=new Stack<>();

        for(int i=n-1;i>=0;i--){
            int curr=temperatures[i];
            while(!stack.isEmpty() && (stack.peek()[0] <= curr)){
                stack.pop();
            }
            if(!stack.isEmpty()){
                int ind=stack.peek()[1];
                result[i]=ind-i;
            }
            else{
                result[i]=0;
            }
            stack.push(new int[]{temperatures[i],i});
        }
        return result;
        
    }
}
