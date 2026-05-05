class Solution {
    public boolean isValid(String s) {

        HashMap<Character,Character> map=new HashMap<>();
        Stack<Character> stack=new Stack<>();

        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(stack.isEmpty() || stack.peek()!=map.get(s.charAt(i))){
                    return false;
                }
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }

        }
        return stack.isEmpty();
        
    }
}
