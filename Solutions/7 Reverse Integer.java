class Solution {
    public int reverse(int x) {
        int num = 0;  
        
        while (x != 0) {
            int temp = (num * 10) + (x % 10);
            
            if ((temp - x%10)/10 != num) { // this is just solving for num in the equation above since if the temp number
                return 0;                  // goes out of bounds, then it will be stored differently and undoing the 
            } else {                       // operation will yield something not equal to num. This just check out of bounds
                num = temp;                 
                x /= 10;
            }
        }
        return num;
    }
}

/*
   The hard part for this one was the if statement on line 8. I was having real trouble handling an out-of-bounds exception since the integer must be 
   reversed to even see it occur. I had to find this clever method online of handling out of bounds in this way to solve the 4/1032 test cases I was
   failing. I'm glad to understand this little trick and add it to my arsenal! I wish I could've figured it out completely on my own by sitting here
   and thinking very hard, but I think, in the end, saving myself some time and looking up the trick was the right call since I now understand the 
   logic and can use it in the future.
*/
