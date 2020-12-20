class Solution {
    public int romanToInt(String s) {
        int x = 0;
        char[] roman = s.toCharArray();
        
        HashMap<Character, Integer> values = new HashMap<Character, Integer>();
        values.put('M', 1000);
        values.put('D', 500);
        values.put('C', 100);
        values.put('L', 50);
        values.put('X', 10);
        values.put('V', 5);
        values.put('I', 1);
        
        for (int i = 0; i < roman.length; i++) {
            if (i == roman.length - 1) {
                x += values.get(roman[i]);
            } else if (values.get(roman[i]) < values.get(roman[i+1])) {
                x += values.get(roman[i+1]) - values.get(roman[i]);
                i++;
            } else {
                x += values.get(roman[i]);
            }
        }
        
        return x;
    }
}

/*
   Two things I've noticed about my solution compared to others: 
   1) Using a HashMap uses a lot more memory than a bunch of else if statements, but I feel like it is more compact so I'm not sure about the tradeoff.
   2) Most solutions online first thing return 0 if the string is null or empty. This is something I should start doing because it would be much more 
   efficient if given a null value.
   Additionally, I did not have to do s.toCharArray(), I could'be just used s.charAt() throughout possibly saving some memory. Despite that, my code is
   nearly identical to some solutions I see online which is quite pleasing because that means I came to the same conclusion as other people who also put
   thought into the problem!
*/
