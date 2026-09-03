class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String>list=new ArrayList<>();
        Arrays.sort(folder);
        int n=folder.length;
        String ar=folder[0];
        list.add(folder[0]);
        for(int i=1;i<n;i++){
            String nn=ar+"/";
          if(folder[i].startsWith(nn)){
            continue;
          }else{
            list.add(folder[i]);
            ar=folder[i];
          }
        }
        return list;
    }
}