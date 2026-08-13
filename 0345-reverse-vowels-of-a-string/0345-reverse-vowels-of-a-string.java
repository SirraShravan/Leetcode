class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
       char[] ch=s.toCharArray();
       int i=0,j=n-1;
        while(i<j){
            while(i<j&&!isVowel(ch[i])){
                i++;
            }
            while(i<j&&!isVowel(ch[j])){
                j--;
            }
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch);
    }
    private boolean isVowel(char cha){
        return (cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u'||cha=='A'||cha=='E'||cha=='I'||cha=='O'||cha=='U');
    }
}