class Solution {
    public int removeDuplicates(int[] nums) {
    int previous = 1;
    int next = 1;

    int frequency = 1;
    int lastNumber = nums[0];
    for (; next < nums.length; next++) {
      if (nums[next] == lastNumber) {
        frequency++;
      } else {
        frequency = 1;
        lastNumber = nums[next];
      }
      if (frequency <= 2) {
        nums[previous] = nums[next];
        previous++;
      }
    }
    return previous;
    }
}