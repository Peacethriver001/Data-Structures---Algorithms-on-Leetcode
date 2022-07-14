// import java.util.Collections;
// import java.util.HashMap;
import java.util.HashSet;

public class FirstUnique {
    public static int firstUniqueElement(int [] A){
        // HashMap<Integer, Integer> findFirstUnique = new HashMap<>();
        // for (int i = 0; i < A.length; i++){
        //     if(findFirstUnique.containsValue(A[i])){
        //         findFirstUnique.remove(i);
        //     }
        //     findFirstUnique.put(i, A[i]);
        // }
        
        // // if (findFirstUnique.size() == 1){
        // //     return findFirstUnique.get(0);
        // // }
        // // else if (findFirstUnique.size() > 1){
            
        // // }
        // if(!findFirstUnique.isEmpty()){
        //     int firstElement = Collections.min(findFirstUnique.keySet());
        //     return findFirstUnique.get(firstElement);
        // }
        // return -1;

        int firstElement = 0;
        HashSet<Integer> findFirstUnique = new HashSet<>();
        for (int i = 0; i < A.length; i++){
            if(findFirstUnique.contains(A[i])){
                findFirstUnique.remove(A[i]);
            }
            else{
                findFirstUnique.add(A[i]);
            }            
        }
        
        System.out.println(findFirstUnique);
        if(!findFirstUnique.isEmpty()){
            for (int a : findFirstUnique){
                firstElement = a;
            }
            return firstElement;
        }
        return -1;
    }

    public static void main (String [] args){
        int [] A = {4, 10, 5, 4, 2, 10};
        System.out.println(firstUniqueElement(A));
    }
}
