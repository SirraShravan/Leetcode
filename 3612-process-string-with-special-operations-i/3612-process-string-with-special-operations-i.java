class Solution {
    public String processStr(String s) {
        int n=s.length();
       StringBuilder str=new StringBuilder(s);
       StringBuilder result=new StringBuilder("");
       for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch=='*'){
            if(result.length()>0){
                result.deleteCharAt(result.length()-1);
            }
        }else if(ch=='#'){
            result.append(result);
        }else if(ch=='%'){
            int k=result.length();
            int left=0,right=k-1;
            while(left<=right){
                char temp=result.charAt(left);
                result.setCharAt(left,result.charAt(right));
                result.setCharAt(right,temp);
                left++;
                right--;
            }
        }else{
            result.append(ch);
        }
       }
       return result.toString();
    }
}