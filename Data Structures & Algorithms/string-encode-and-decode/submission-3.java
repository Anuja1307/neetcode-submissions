class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        StringBuilder ans=new StringBuilder();

        for(String s:strs){
            ans.append(s.length());
            ans.append('#');
            ans.append(s);
        }
        return ans.toString();



    }

    public List<String> decode(String str) {
        ArrayList<String> ans=new ArrayList<>();
        if(str.length()==0){
            return ans;
        }
        
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            StringBuilder num=new StringBuilder();
            while(i<j){
                num.append(str.charAt(i));
                i++;
            }
            int len=Integer.parseInt(num.toString());
            i++;
            ans.add(str.substring(i,i+len));
            i+=len;
        }
        return ans;

    }
}
