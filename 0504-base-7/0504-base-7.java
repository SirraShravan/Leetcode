class Solution {
    public String convertToBase7(int num) {
        StringBuffer s=new StringBuffer();
        int n1=0;
        boolean sign=false;
        if(num<0){
            sign=true;
        }
        int a=Math.abs(num);
        if(a==0){
            return "0";
        }
        while(a>0){
            int n=a-(a/7)*7;
              s.append(n);   
                     a/=7;
     }
     if(sign){
        s.append('-');
     }
     return s.reverse().toString();
    }
}