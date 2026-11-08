class Solution {
    public int minimumFlips(int n) {
    String binary = Integer.toBinaryString(n);
    int count=0;
    int i=0,j=binary.length()-1;
    while(i<=j){
        if(binary.charAt(i)!=binary.charAt(j)){
           count+=2;
        }
        i++;
        j--;
    }
    return count;
    }
}