/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day_01;

import java.util.HashSet;

/**
 *
 * @author Peace E. BAKARE
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> hash = new HashSet<>();
        int max = 0;
        int i = 0;
        int j = 0;
        
        while (j < s.length()){
            if (!hash.contains(s.charAt(j))){
                hash.add(s.charAt(j));
                max = Math.max(hash.size(), max);
                j++;
            }else {
                hash.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
