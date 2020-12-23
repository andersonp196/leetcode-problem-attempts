class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        
        for (int i = 0; i < haystack.length(); i++) {
            int count = 0;
            for (int j = 0; j < needle.length(); j++) {
                if (i+j < haystack.length() && j < needle.length() && haystack.charAt(i+j) == needle.charAt(j)) {
                    count++;
                    if (count == needle.length()) {
                        return i;
                    }
                } else {
                    count = 0;
                    break;
                }
            }
        }
        
        return -1;
    }
}

/*
  While my solution did decently with memory usage, it was quite subpar speed-wise. Looking into this, I learned that I was using the "Naive" pattern matching approach
  which yields O(nm) whereas other algorithms such as the Knuth-Morris-Pratt (KMP) Algorithm has a worst case time complexity of O(n+m). I learned about the algoithm
  from this post: http://jakeboxer.com/blog/2009/12/13/the-knuth-morris-pratt-algorithm-in-my-own-words/ and it was a little hard to understand (and I still don't
  completely understand it), but I see where the logic is headed and I commend Knuth, Morris, and Pratt for their hard work.
*/
