class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int n=height.length;
        int j=n-1,i=0;
       while(i<n&&j>=i){
       
        maxArea=Math.max(maxArea,(j-i)*Math.min(height[i],height[j]));
          if(height[i]<height[j]){
            i++;
        }else{
            j--;
        }
       }
     return maxArea;
       }
    
}