class Solution {
    public int searchInsert(int[] nums, int target) {        
        int before = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target && nums[i] < target) {
                before = i;
            } else {
                return i;
            }
        }
        return before + 1;
    }
}

/*
  This problem was actually quite straighforward while thinking it through myself; it may have taken the least time of any I have attempted.
  The only problem is that I used linear search when I should've realized to use binary search. An updated solution is below which should be more efficient!
*/

class Solution {
    public int searchInsert(int[] nums, int target) {  
        if (target > nums[nums.length-1]) {
            return nums.length;
        } else if (target < nums[0]) {
            return 0;
        }
        
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low)/2;
            
            if (target > nums[mid]) { 
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }
}
