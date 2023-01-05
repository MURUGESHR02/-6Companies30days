class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("/")||tokens[i].equals("*")){
                int op1=(int)stack.pop();
                int op2=(int)stack.pop();
                switch(tokens[i]){
                    case "+":
                    stack.push(op1+op2);
                    break;
                    case "-":
                    stack.push(op2-op1);
                    break;
                    case "*":
                    stack.push(op1*op2);
                    break;
                    case "/":
                    stack.push(op2/op1);
                    break;
                }
            }
            else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return (int)stack.pop();
    }
}
