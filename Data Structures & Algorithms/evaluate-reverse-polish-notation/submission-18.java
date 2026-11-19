class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String c:tokens){
            if(c.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(c.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(c.equals("/")){
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n2/n1);
            }
            else if(c.equals("-")){
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n2-n1);

            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
        
    }
}
