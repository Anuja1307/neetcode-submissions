class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0;
        int e=numbers.length-1;
        

        while(s<e){
            if(numbers[s]+numbers[e]==target){
                int a=s+1;
                int b=e+1;
                return new int[]{a,b};
            }
            else if(numbers[s]+numbers[e]>target){
                 e--;

            }
            else{
                s++;
            }
            
            
        }
        return new int[0];
        
    }
}
