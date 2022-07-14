import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MiniMax {
    public static void main (String[]args){
        List<Integer> array = Arrays.asList(1, 3, 5, 7, 9);
        miniMax(array);
        miniMax2(array);
    }

    public static void miniMax (List<Integer> arr){
        //Solution 1

        //Sort the array
        Collections.sort(arr);

        int n = arr.size();
        long min_sum = 0;
        long max_sum = 0;
        for (int i = 0; i <= 3; i++){
            min_sum += arr.get(i);
        }
        
        for (int i = n - 1; i > 0; i--){
            max_sum += arr.get(i);
        }
        
        System.out.println(min_sum + " " + max_sum);
    }

    public static void miniMax2 (List<Integer> arr){
         //Solution 2
         int min = arr.get(0);
         int max = 0;
         long sum = 0;
         for (int i = 0; i < arr.size(); i++){
             if (arr.get(i) > max){
                 max = arr.get(i);
             }
             
             if (arr.get(i) < min){
                 min = arr.get(i);
             }
             sum += arr.get(i);
         }
         long max_sum = sum - min;
         long min_sum = sum - max;
         
         System.out.println(min_sum + " " + max_sum);
    } 
}
