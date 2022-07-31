class Solution {
    public String intToRoman(int num) {
        
        //uses a string which will have roman numerals added on to it iteratively
        String s = "";
        
        if(num >= 1000){
            for(int i = 0; i<num/1000; i++){
                s+="M";
            }
            num = num % 1000;
        }
        
        if(num >= 900){
            s+="CM";
            num-=900;
        }
        
        if(num >= 500){
            for(int i = 0; i<num/500; i++){
                s+="D";
            }
            num = num % 500;
        }
        
         if(num >= 400){
            s+="CD";
            num-=400;
        }
        
        if(num >= 100){
            for(int i = 0; i<num/100; i++){
                s+="C";
            }
            num = num % 100;
        }
        
         if(num >= 90){
            s+="XC";
            num-=90;
        }
        
        if(num >= 50){
            for(int i = 0; i<num/50; i++){
                s+="L";
            }
            num = num % 50;
        }
        
         if(num >= 40){
            s+="XL";
            num-=40;
        }
        
        if(num >= 10){
            for(int i = 0; i<num/10; i++){
                s+="X";
            }
            num = num % 10;
        }
        
         if(num >= 9){
            s+="IX";
            num-=9;
        }
        
        if(num >= 5){
            for(int i = 0; i<num/5; i++){
                s+="V";
            }
            num = num % 5;
        }
        
         if(num >= 4){
            s+="IV";
            num-=4;
        }
        
        if(num >= 1){
            for(int i = 0; i<num/1; i++){
                s+="I";
            }
            num = num % 1;
        }
        return s;
    }
    
    
}