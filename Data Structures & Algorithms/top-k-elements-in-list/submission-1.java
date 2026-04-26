class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<=nums.length;i++){
            arr.add(new ArrayList<>());
        }

        Set<Integer> keys=map.keySet();
        for(int num:keys){
            int ind=map.get(num);
            ArrayList<Integer> temp = arr.get(ind-1);
            temp.add(num);
        }
        int[] ans=new int[k];
        int index=0;
        for(int i=arr.size()-1;i>=0 && index<k ;i--){
            for(int num:arr.get(i)){
                ans[index++]=num;
                if(index==k){
                    return ans;
                }


            }

        }
        return ans;
        
    }
}
