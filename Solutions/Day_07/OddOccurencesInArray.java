import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class OddOccurencesInArray{
    public static void main (String [] args){
        //int [] A = {9, 3, 9, 3, 9, 7, 9};
        //int [] A = {4, 10, 5, 4, 2, 10};
        int [] A = {1, 4, 3, 3, 1, 2};

        System.out.println(oddOccurences(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> newList = new ArrayList<Integer>();
        for (int a : A){
            newList.add(a);
        }

        int i = 0;
        int j = 1;        

        while (newList.size() > 1){
            if (newList.get(i) == newList.get(j)){
                newList.remove(newList.get(i));
                newList.remove(newList.get(j));
            }
            else{
                j++;
            }
        }
        return 0;
    }

    public static int oddOccurences(int [] A){
        HashSet<Integer> occurence = new HashSet<>();
        int firstElement = 0;
        for(int i = 0; i < A.length; i++){
            if (occurence.contains(A[i])){
                occurence.remove(A[i]);
            }
            else{
                occurence.add(A[i]);
            }
        }
        
        // if(occurence.isEmpty() || occurence.size() > 1){
        //     return 0;
        // }

        System.out.println(occurence);
        for (int a : occurence){            
            firstElement = a;
        }

        return firstElement;
    }
}