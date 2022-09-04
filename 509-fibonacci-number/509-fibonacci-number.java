class Solution {
    
    //topdown
    public int fib(int n) {
        if(n == 0)
            return 0;
        
        if(n == 1 | n == 2)
            return 1;
        
        int a = 1;
        int b = 1;
        
        //only uses 2 numbers at once
        for(int i = 3; i<=n; i++){
            int c = a;
            a = b;
            b = c + b;
        }
        
        return b;
    }
}