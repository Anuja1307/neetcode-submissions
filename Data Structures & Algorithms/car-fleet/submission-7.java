class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int pair[][]=new int[speed.length][2];
        for(int i=0;i<speed.length;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }
        Arrays.sort(pair,(a,b)->a[0]-b[0]);
        Stack<int[]> stack=new Stack<>();
        for(int i=pair.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                int d1=target-stack.peek()[0];
                double t1=(double) d1/stack.peek()[1];
                int d2=target-pair[i][0];
                double t2=(double) d2/pair[i][1];
                if(t2<=t1){
                    continue;
                }
                else{
                    stack.push(pair[i]);
                }
            }
            else{
                stack.push(pair[i]);
            }

        }
        return stack.size();
        
    }
}
