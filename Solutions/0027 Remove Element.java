class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        
        int len = 0;
        int end = nums.length;
        
        for (int i = 0; i < end; i++) {
            if (nums[i] != val) {
                len++;
            } else if (i < end-1) {
                int temp = nums[i];
                nums[i] = nums[end-1];
                nums[end-1] = temp;
                end--;
                i--;
            } else {
                return len;
            }
        }
        return len;
    }
}

/*
  This problem was deceptively difficult. For quite a while, I was trying to shift elements forward each time the for-loop found the value, but once I decided
  it would be better just to swap the value with the integer at the end of the array and then go over that index again, everything went more smoothly!
  Other solutions I saw online after I completed the problem more or less did what I did with some solutions being more compact. Overall, I am quite satisfied
  since -- according to LeetCode -- my runtime was faster than 100% of other solutions (I believe it only says that since it was 0 ms and LeetCode doesn't compare
  further than that) and I used less memory than 90.60% of other solutions.
*/
