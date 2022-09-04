class Solution {
    public String longestCommonPrefix(String[] strs) {
        Boolean noBreak = true;
        String prefix = "";
                                                      
        for(int i = 0; i< strs[0].length(); i++){
            
            noBreak = true;
            char c = strs[0].charAt(i);
            
            for(String s : strs){
            
            if(s.length()-1 < i){
                noBreak = false;
                break;
            }
            
            if(! (s.charAt(i) == c))
                return prefix;
            }
            
            if(noBreak)
            prefix += c;
        }
        
        return prefix;
    }
}