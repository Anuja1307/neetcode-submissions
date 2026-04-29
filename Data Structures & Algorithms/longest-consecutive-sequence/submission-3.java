class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        int longest=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            int length=0;
           if(!set.contains(num-1)){
                length=1;
                while(set.contains(num+length)){
                    length++;
                    
                }
                longest=Math.max(longest,length);
                
            }

        }
        return longest;
        
    }
}
