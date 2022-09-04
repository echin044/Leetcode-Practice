class Solution {

    public int fib(int n) {
        if(n == 0)
            return 0;
        
        int a = 1;
        int b = 1;
        
        for(int i = 3; i<=n; i++){
            int c = a;
            a = b;
            b = c + b;
        }
        
        return b;
    }
}