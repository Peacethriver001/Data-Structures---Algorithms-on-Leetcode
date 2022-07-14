//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstUnique_UsingMap {
    public static void main (String[]args){
        int [] A = {4, 10, 5, 4, 2, 10};
        System.out.println(firstUnique(A));
    }

    public static int firstUnique (int [] A){
        if (A.length == 1){
            return A[0];
        }

        int firstNumber = -1;
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : A){
            Integer j = map.get(i);
            if (j == null){
                j = 1;
            }
            else {
                j++;
            }
            map.put(i, j);
        }

        for (Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue().intValue() == 1){
                firstNumber = entry.getKey();
                break;
            }
        }
        return firstNumber;
    }
}
