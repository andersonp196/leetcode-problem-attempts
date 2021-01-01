class Solution {
    public int lengthOfLastWord(String s) {
        if (s.equals(" ")) {
            return 0;
        }
        
        String[] arr = s.split(" ");
        
        if (arr.length == 0) {
            return 0;
        }
        
        return arr[arr.length-1].length();
    }
}

/*
  Looking online, more efficient answers simply use a loop to look at each character in the string and start counting if it's not a space (then reset if it is). 
  This is a better approach, but I believe my answer is usable so my attempt was better than nothing!
*/
