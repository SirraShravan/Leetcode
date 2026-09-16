class KthLargest {
    PriorityQueue<Integer>minHeap;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        minHeap=new PriorityQueue<>();
        for(int num:nums){
            if(minHeap.size()<k){
                minHeap.add(num);
            }else if(minHeap.peek()<num){
                minHeap.add(num);
                if(minHeap.size()>k){
                    minHeap.poll();
                }
            }
        }
       
    }
    
    public int add(int val) {
      if(minHeap.size()<k){
        minHeap.add(val);
      }else if(minHeap.peek()<val){
        minHeap.add(val);
        
            minHeap.poll();
        
      }
      return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */