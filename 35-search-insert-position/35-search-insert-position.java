class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if(target > nums[nums.length-1])
            return nums.length;
        
        if(target < nums[0])
            return 0;
        
        int start = 0;
        int end = nums.length - 1;
        for(int i = 0; i< nums.length; i++){
            
            System.out.println(start + " : " + end);
            
            if(end == start + 1){
                if(nums[start] < target){
                    return end;
                }
                
                return start;
            }
            
            
            if(nums[(start + end)/2] == target){
                System.out.println("found");
                return (start + end)/2;
            }
            if(nums[(start + end)/2] > target){
                end = (start + end)/2;
                System.out.println("bigger");
            }
            if(nums[(start + end)/2] < target){
                 start = (start + end)/2;
                System.out.println("smaller");
            }
        }
        return -1;
    }
}
