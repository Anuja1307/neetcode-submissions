class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq=new ArrayDeque<>();
        int ans[]=new int[nums.length-k+1];
        int ind=0;
        
        for(int r=0;r<nums.length;r++){
            if(!dq.isEmpty()){
                int front=dq.peekFirst();
                if(front<=r-k){
                    dq.pollFirst();
                }
            }
            while(!dq.isEmpty() && nums[r]>=nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(r);

            if(r>=k-1 && ind<ans.length){
                int temp=dq.peekFirst();
                ans[ind]=nums[temp];
                ind++;
            }

        }
        return ans;
        
    }
}
