class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer>maxheap=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>minheap=new PriorityQueue<>();
        HashMap<Integer,Integer>delayed=new HashMap<>();
        int n=nums.length;
        int windowIndex=0;
        double[] res=new double[n-k+1];
        for(int j=0;j<k;j++){
             maxheap.offer(nums[j]);
            minheap.offer(maxheap.poll());
            if(maxheap.size()<minheap.size()){
                maxheap.offer(minheap.poll());
            }

        }
       
       res[windowIndex]=(k%2==0)?((double)minheap.peek()+maxheap.peek())/2:(double)maxheap.peek();
        for(int right=k;right<n;right++){
                int inc=nums[right];
                int out=nums[windowIndex];
                delayed.put(out,delayed.getOrDefault(out,0)+1);
                int balance=0;
                if(inc<=maxheap.peek()){
                    maxheap.offer(inc);
                    balance++;
                }else{
                    minheap.offer(inc);
                    balance--;
                }
                if(out<=maxheap.peek()){
                    balance--;
                }else{
                    balance++;
                }
                if(balance>0){
                    minheap.offer(maxheap.poll());
                }
                if(balance<0){
                    maxheap.offer(minheap.poll());
                }
                while(!maxheap.isEmpty()&&delayed.getOrDefault(maxheap.peek(),0)>0){
                    int element=maxheap.poll();
                    delayed.put(element,
                    delayed.get(element)-1);
                }
                while(!minheap.isEmpty()&&delayed.getOrDefault(minheap.peek(),0)>0){
                    int element=minheap.poll();
                    delayed.put(element,
                    delayed.get(element)-1);
                }
                
            windowIndex++;
              
                
                   res[windowIndex]=(k%2==0)?((double)minheap.peek()+maxheap.peek())/2:(double)maxheap.peek();

             
        
           
            


        }
        return res;

    }
}