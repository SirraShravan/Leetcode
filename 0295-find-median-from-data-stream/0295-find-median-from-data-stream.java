class MedianFinder {
PriorityQueue<Integer>maxheap=new PriorityQueue<>(Collections.reverseOrder());
PriorityQueue<Integer>minheap=new PriorityQueue<>();
    public MedianFinder() {
    }
    
    public void addNum(int num) {
       maxheap.offer(num);
       minheap.offer(maxheap.poll());
       if(maxheap.size()<minheap.size()){
        maxheap.offer(minheap.poll());
       }
    }
    
    public double findMedian() {
       if(maxheap.size()==minheap.size()){
        return((double)minheap.peek()+maxheap.peek())/2.0;
       }
       return (double)maxheap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */