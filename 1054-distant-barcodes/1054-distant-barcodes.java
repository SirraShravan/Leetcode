class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:barcodes){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(
            (a,b)->map.get(b)-map.get(a)
        );
        pq.addAll(map.keySet());
        int i=0;
        while(pq.size()>=2){
           int n1=pq.poll();
           int n2=pq.poll();
           barcodes[i++]=n1;
           barcodes[i++]=n2;
           map.put(n1,map.get(n1)-1);
           map.put(n2,map.get(n2)-1);
           if(map.get(n1)>0){
            pq.offer(n1);
           }
           if(map.get(n2)>0){
            pq.offer(n2);
           }
        }
        if(!pq.isEmpty()){
            barcodes[i]=pq.poll();
        }
        return barcodes;
    }
}