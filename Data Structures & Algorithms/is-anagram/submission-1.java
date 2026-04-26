class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> s1=new HashMap<>();
        HashMap<Character,Integer> t1=new HashMap<>();

        for(char c:s.toCharArray()){
            if(!s1.containsKey(c)){
                s1.put(c,1);
            }
            else{
                s1.put(c,s1.get(c)+1);
            }
        }
        for(char c:t.toCharArray()){
            if(!t1.containsKey(c)){
                t1.put(c,1);
            }
            else{
                t1.put(c,t1.get(c)+1);
            }
        }
        return s1.equals(t1);
      
        


    }
}
