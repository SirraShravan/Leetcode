class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer>stack=new Stack<>();
       for(String op:operations){
        if(op.equals("+")){
            int first=stack.pop();
            int sec=stack.peek();
            stack.push(first);
            stack.push(first+sec);
        }else if(op.equals("D")){
            int first=stack.peek();
            stack.push(2*first);
        }else if(op.equals("C")){
            stack.pop();
        }else{
            stack.push(Integer.parseInt(op));
        }
       }
   int sum=0;
   while(!stack.isEmpty()){
    sum+=stack.pop();
   }
     return sum;
    }
}