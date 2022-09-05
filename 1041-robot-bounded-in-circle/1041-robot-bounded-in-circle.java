class Solution {
    public boolean isRobotBounded(String instructions) {
        
        //direction based on X and Y axis
        int leftDir = 0;
        int topDir = 1;
        
        //position on X and Y axis
        int positionX = 0;
        int positionY = 0;
        
        for(int i = 0; i< 4; i++){
        for(char c : instructions.toCharArray()){
            
            switch(c){
                case 'G':
                    positionX+= leftDir;
                    positionY+= topDir;
                    break;
                case 'L':
                    if(leftDir==0&topDir==1){
                        leftDir = -1;
                        topDir = 0;
                    }
                    else if(leftDir==1&topDir==0){
                        leftDir = 0;
                        topDir = 1;
                    }
                    else if(leftDir==0&topDir==-1){
                        leftDir = 1;
                        topDir = 0;
                    }
                    else{
                        leftDir = 0;
                        topDir = -1;
                    }
                    break;
                case 'R':
                    if(leftDir==0&topDir==1){
                        leftDir = 1;
                        topDir = 0;
                    }
                    else if(leftDir==1&topDir==0){
                        leftDir = 0;
                        topDir = -1;
                    }
                    else if(leftDir==0&topDir==-1){
                        leftDir = -1;
                        topDir = 0;
                    }
                    else{
                        leftDir = 0;
                        topDir = 1;
                    }
                    break;
            }
            System.out.println(leftDir + " " + topDir);
        }
            
        }
        System.out.println(positionX + " " + positionY);
    return positionX == 0 & positionY == 0;
    }
}