class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        ArrayList<int []> arr=new ArrayList<>();
        Set<Integer> keys=count.keySet();
        for(int num:keys){
            arr.add(new int[]{count.get(num),num});
        }
        arr.sort((a,b)->(b[0]-a[0]));
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=arr.get(i)[1];

        }
        return ans;
        
        
    }
}
