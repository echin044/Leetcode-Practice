class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int min = 20001;
        int max = -1;
        // [ 5, 2, 6, 1]
        // Finding and storing max and min in the array
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        // min: 1 max:6
        min--;

        // count is an array initialized
        int[] count = new int[max-min+1];

        Integer[] result = new Integer[nums.length];

        // Traversing over the array from last element
        for (int i = nums.length-1; i >=0; i--) {
            // 1 considered

            int k = nums[i]-min-1;
            // value of c is initialized
            int c = 0;

            do {
                // c is incremented
                c = c + count[k];
                k = k - (-k&k);
            }
            while (k > 0);
                result[i] = c;

            k = nums[i]-min;
            
            while (k < count.length) {
                count[k]++;
                k += (-k&k);
            }
        }

        return Arrays.asList(result);
    }
}