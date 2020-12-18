class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && j != i) {
                    int[] indicies = new int[2];
                    indicies[0] = i;
                    indicies[1] = j;
                    return indicies;
                }
            }
        }
        return null;
    }
}

/* 
   After viewing another solution, I now realize that instead of using a nested for-loop which would have a time complexity of O(n^2),
   there are ways to use only a single for-loop yielding O(n); A very efficient solution I saw used a HashMap to map the remainder needed
   for one number to pair with another as well as the index of that number. This solution only requires one for-loop since each interger
   in nums only needs to be compared once.
*/
