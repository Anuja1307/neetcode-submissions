class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result=new int[temperatures.length];
        int n=temperatures.length;
        Stack<int[]> stack=new Stack<>();

        for(int i=0;i<n;i++){
            int temp=temperatures[i];
            
            while(!stack.isEmpty()&& stack.peek()[0]<temp){
              
                int day=stack.pop()[1];
                result[day]= i - day; 
            }
            stack.push(new int[]{temp,i});
        }
        return result;
        
    }
}
