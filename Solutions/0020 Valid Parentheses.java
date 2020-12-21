class Solution {
    public boolean isValid(String s) {
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);  
        }
        
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ')' || c[i] == ']' || c[i] == '}') {
                for (int j = i-1; j >= 0; j--) {
                    if (c[j] != ' ') {
                        if (c[j] == '(' && c[i] != ')' || c[j] == '[' && c[i] != ']' || c[j] == '{' && c[i] != '}') {
                            return false;
                        } else if (c[j] == ')' || c[j] == ']' || c[j] == '}') {
                            return false;
                        } else {
                            c[i] = ' ';
                            c[j] = ' ';
                            break;
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') {
                return false;
            } 
        }
        
        return true;
    }
}

/* 
   After reviewing another person's solution online I now realize that using a stack would be a much better way of going about solving this problem.
   Using a stack would mean I wouldn't have to implement a system of determining if indices have already been removed or not.
   Additionally, I see there are other ways of going about creating more efficient if statements.
   Lastly, I now know that Java has a built in method to convert a String to an array of characters which will serve me well in the future: char[] arr = s.toCharArray();
*/
