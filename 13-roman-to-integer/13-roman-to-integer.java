class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i = 0; i<s.length();i++){
            
            //gets numeric value associated to roman numerals, for current character and then next one
            int value = 0;
            switch(s.charAt(i)){
               case 'I':
                   value = 1;
                   break;
               case 'V':
                   value = 5;
                   break;
               case 'X':
                   value =10;
                   break;
               case 'L':
                   value =50;
                   break;
               case 'C':
                   value =100;
                   break;
               case 'D':
                   value =500;
                   break;
               case 'M':
                   value =1000;
                   break;
            }
            
            if(i == s.length()-1){
                sum+=value;
                continue;
            }
            
            int value2 = 0;        
            switch(s.charAt(i+1)){
               case 'I':
                   value2 = 1;
                   break;
               case 'V':
                   value2 = 5;
                   break;
               case 'X':
                   value2 =10;
                   break;
               case 'L':
                   value2 =50;
                   break;
               case 'C':
                   value2 =100;
                   break;
               case 'D':
                   value2 =500;
                   break;
               case 'M':
                   value2 =1000;
                   break;
            }
                    
                    if(value < value2){
                        sum -= value;
                    }
                    else{
                        sum += value;
                    }
                   
           }
            
            return sum;
        }
            

    }

