import java.util.ArrayList;
import java.util.List;

public class IsPalindrome2 {
    //Main Method to test the isPalindrome method.
    public static void main (String [] args){
        String s = "A man, a plan, a canal: Panama";
        //race a car
        System.out.println(isPalindrome(s));
    }

    //Returns a boolean after checking if the string is a palindrome or not
    public static boolean isPalindrome(String s){
        //Checks if the parsed string is empty or less than 2
        //Returns true
        if (s.isEmpty() || s.length() < 2){
            return true;
        }

        //Creates a array list of character type
        List<Character> newList = new ArrayList<Character>();
        
        for (int i = 0; i < s.length(); i++){
            //Checks if each character is alphanumeric
            if (Character.isLetterOrDigit(s.charAt(i))){
                //Converts an uppercase character to lowercase
                char a = Character.toLowerCase(s.charAt(i));
                //System.out.println(a);
                //Adds the lowercase character to the list
                newList.add(a);       
            }
        }

        //Creates two variables x & y to hold each character in the list
        int x = 0, y = newList.size()-1;
        while (x < y){
            //Check if the characters are identical, if true, check the next until end of list
            if (newList.get(x) == newList.get(y)){
                x++; y--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
