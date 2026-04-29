class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        int longest=0;
        int streak=0;
        int i=0;
        HashSet<Integer> n=new HashSet<>();
        for(int nu:nums){
            n.add(nu);
        }
        Iterator<Integer> num=n.iterator();
        int arr[]=new int[n.size()];
        int j=0;
        while(num.hasNext()){
            arr[j]=num.next();
            j++;
        }
      
        Arrays.sort(arr);
        int curr=arr[i];
        while(i<arr.length){
            if(arr[i]!=curr){
                curr=arr[i];
                streak=0;
            
            }
            while(i<arr.length && curr==arr[i]){
                curr++;
                streak++;
                longest=Math.max(longest,streak);
                i++;
            }
        }
        return longest;
        
    }
}
