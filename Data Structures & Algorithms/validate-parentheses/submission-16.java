class Solution {
    public boolean isValid(String s) {

        if(s.length()<2){
            return false;
        }

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else{
                 if(!stack.isEmpty()){
                    if(stack.peek()=='[' && s.charAt(i)!=']'){
                        return false;
                    }
                    else if(stack.peek()=='{' && s.charAt(i)!='}'){
                        return false;
                    }
                    else if (stack.peek()=='(' && s.charAt(i)!=')'){
                        return false;
                    }
                    
                    stack.pop();
                 }
                else{
                    return false;
                }
                
            }
        }

        if(!stack.isEmpty()){
            return false;
        }
       
        return true;
        


        
    }
}
