class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s="123456789";
       int d1=String.valueOf(low).length();
       int d2=String.valueOf(high).length();
       List<Integer>list=new ArrayList<>();
       for(int len=d1;len<=d2;len++){
      for(int i=0;i+len<=9;i++){
        int num=Integer.parseInt(s.substring(i,i+len));
        if(num>=low&&num<=high){
            list.add(num);
        }
      }
       }
       return list;
    }
}