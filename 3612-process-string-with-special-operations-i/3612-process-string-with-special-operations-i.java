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
            result.reverse();
        }else{
            result.append(ch);
        }
       }
       return result.toString();
    }
}