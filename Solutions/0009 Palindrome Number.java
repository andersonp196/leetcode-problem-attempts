class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
        
        if (s.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }
}

/*
   After viewing another solution online, I do agree that converting to a string and reversing is not the *best* way to solve this problem.
   A much more efficient concept is what one submission called "extracting digits" meaning using the fact that our number system is base 10,
   one can use the modulus operator to get the rightmost digit of the given integer by doing x % 10. The process for this problem is to save
   the original number as an integer and create a new number integer and then use a while loop to multiply the new number by 10, take the
   rightmost digit from x to add it to the new numerber, and divide x by 10 until x is less than 0. Finally, check to see if the originial 
   number is equal to the new number. Trying to understand this solution has enlightened me that this new concept using modulus might prove to
   be quite useful for numberout problems.
*/
