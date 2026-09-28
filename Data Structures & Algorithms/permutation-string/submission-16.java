class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()){
            return false;
        }

        int count1[]=new int[26];

        for(int i=0;i<s1.length();i++){
            count1[s1.charAt(i)-'a']++;
        }

        int count2[]=new int[26];

        int w=s1.length();
        int n=s2.length();

        for(int i=0;i<w;i++){
            count2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(count1,count2)){
            return true;
        }
        for(int i=1;i<=n-w;i++){
            count2[s2.charAt(i-1)-'a']--;
            count2[s2.charAt(i+w-1)-'a']++;
            if(Arrays.equals(count1,count2)){
                return true;
            }
        }
        return false;
    }
}

