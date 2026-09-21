class Solution {
    public int nthUglyNumber(int n) {
       PriorityQueue<Long>pq=new PriorityQueue<>();
       HashSet<Long>set=new HashSet<>();
       pq.add(1L);
       set.add(1L);
       long curr=1;
       for(int i=0;i<n;i++){
         curr=pq.poll();
        if(set.add(curr*2)){
            pq.add(curr*2);
        }
        if(set.add(curr*3)){
            pq.add(curr*3);
        }
        if(set.add(curr*5)){
            pq.add(curr*5);
        }
       }
       return (int)curr;
    }
}