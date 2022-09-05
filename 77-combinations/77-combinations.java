class Solution {
     List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        permute(n, 0,k,al);
        return result;
    }
    public void permute(int n, int index,int k,ArrayList<Integer> curr){
        //when combination is at k numbers, add it to list of lists
        if(curr.size() == k){
            result.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i = index ; i < n; i ++){
            curr.add(i+1);
            permute(n, i+1,k,curr);
            curr.remove(curr.size()-1);
        }
    }
}
