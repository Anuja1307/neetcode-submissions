class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character,Integer> countS=new HashMap<>();
        HashMap<Character,Integer> countT=new HashMap<>();

        for(int i=0;i<t.length();i++){
            countT.put(t.charAt(i),countT.getOrDefault(t.charAt(i),0)+1);
        }

        int need=countT.size();
        int have=0;
        int res[]={-1,-1};
        int resLen=Integer.MAX_VALUE;

        int l=0;
        for(int r=0;r<s.length();r++){
            countS.put(s.charAt(r),countS.getOrDefault(s.charAt(r),0)+1);
            if(countT.containsKey(s.charAt(r)) && countS.get(s.charAt(r))==countT.get(s.charAt(r))){
                have++;
            }
            while(need==have){
                if((r-l+1)<resLen){
                    res[0]=l;
                    res[1]=r;
                    resLen=r-l+1;
                }
                
                char left =s.charAt(l);
                countS.put(s.charAt(l),countS.get(s.charAt(l))-1);
                if(countT.containsKey(left) && countS.get(left)<countT.get(left)){
                    have--;
                }
                l++;

            }
        

        }

        return resLen==Integer.MAX_VALUE?"":s.substring(res[0],res[1]+1);



        
    }
}

