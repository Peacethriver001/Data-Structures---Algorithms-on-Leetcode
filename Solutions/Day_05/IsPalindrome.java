public class IsPalindrome {
    public static void main (String [] args){
        String s = "A man, a plan, a canal: Panama";
        //String s = "race a car";
        // String s = "   ";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        int lengthOfS = s.length();
        if (s.isEmpty() || lengthOfS < 2){
            return true;
        }
        int i = 0, j = lengthOfS - 1;
        // if (i != j){
        //     return false;
        // }
        while (i < j){
            while(!Character.isLetterOrDigit(s.charAt(i)) && i < j){
                i++;
            }
            while(!Character.isLetterOrDigit(s.charAt(j)) && i < j){
                j--;
            }

            //Debugging lines - Egahi!
            // System.out.print("i = " + i + "j = " + j);
            // System.out.println("i = " + Character.toLowerCase(s.charAt(i)) + ", j = " + Character.toLowerCase(s.charAt(j)));
            
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++; j--;
        }

        return true;
    }
    // public boolean isAlphanumeric(char c){
    //     return c.char
    // }

    // int l = s.length();
    //     if (s.isEmpty() || l < 2){
    //         return true;
    //     }
    //     int i = 0, j = l-1;
        
        
    //     while (i < j){            
    //         while(!Character.isLetterOrDigit(s.charAt(i)) && i < j){
    //             i++;
    //         }
    //         while(!Character.isLetterOrDigit(s.charAt(j)) && i < j){
    //             j--;
    //         }
            
    //         if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
    //             return false;
    //         }
    //         i++; j--;
    //     }
    //     return true;
}
