import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class LonelyInteger {
    public static void main (String[]args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 2, 1);
        System.out.println(lonelyInteger(list));

        // int i = 10;
        // while (i <= 4000)
        // {            
        //     System.out.println(i);
        //     i *= 3;
        // }
    }

    public static int lonelyInteger(List<Integer> arr){
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < arr.size(); i++){
            if(hash.contains(arr.get(i))){
                hash.remove(arr.get(i));
            }else {
                hash.add(arr.get(i));
            }
            
        }

        List<Integer> result = new ArrayList<>(hash);

        return result.get(0);
    }

    public static void loop (){

    }
}
