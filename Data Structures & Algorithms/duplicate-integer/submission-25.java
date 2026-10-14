class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        boolean flag=false;
        for(int num:nums){
            if(!s.contains(num)){
                s.add(num);
            }
            else{
            flag=true;
            break;
            }
        }
        if(flag){
            return true;
        }
        return false;
        
        
    }
}