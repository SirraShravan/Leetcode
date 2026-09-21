class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        
        PriorityQueue<Integer>map=new PriorityQueue<>();
        for(int[] row:matrix){
            for(int num:row){
                map.add(num);
            }
        }
        for(int i=0;i<k-1;i++){
            map.poll();
        }
        
        return map.peek();
    }
}