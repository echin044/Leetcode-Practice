class Solution {
     List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        permute(n, 0,k,al);
        return result;
    }
    public void permute(int n, int index,int k,ArrayList<Integer> current){
        //when combination is at k numbers, add it to list of lists
        if(current.size() == k){
            result.add(new ArrayList<>(current));
            return;
        }
        
        //
        for(int i = index ; i < n; i ++){
            current.add(i+1);
            permute(n, i+1,k,current);
            current.remove(current.size()-1);
        }
    }
}
