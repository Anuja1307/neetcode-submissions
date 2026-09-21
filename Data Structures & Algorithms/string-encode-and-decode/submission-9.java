class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()){
            return "";
        }
        StringBuilder ans=new StringBuilder();
        ArrayList<Integer> arr=new ArrayList<>();
        for(String str:strs){
            arr.add(str.length());
        }
        for(int n:arr){
            ans.append(n);
            ans.append(',');
        }
        ans.append('#');
        for(String str:strs){
            ans.append(str);
        }
        return ans.toString();

    }

    public List<String> decode(String str) {
        if(str.length()==0){
            return new ArrayList<>();
        }

        ArrayList<String> ans=new ArrayList<>();
        ArrayList<Integer> len=new ArrayList<>();
        int i=0;
        while(str.charAt(i)!='#'){
            StringBuilder num=new StringBuilder();
            while(str.charAt(i)!=','){
                num.append(str.charAt(i));
                i++;
            }
            len.add(Integer.parseInt(num.toString()));
            i++;
        }
        i++;
        for(int j=0;j<len.size();j++){
            ans.add(str.substring(i,i+len.get(j)));
            i+=len.get(j);
        }
        return ans;

    }
}
