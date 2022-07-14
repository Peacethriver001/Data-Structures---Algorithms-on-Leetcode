import java.util.Arrays;

public class FirstAbsentNumber {
    // you can also use imports, for example:
    //import java.util.Arrays;

    // you can write to stdout for debugging purposes, e.g.
    // System.out.println("this is a debug message");
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int n = A.length;
        int result = 1;       
        if (A[n - 1] < 1){
            return result;
        }
        int number = A[0];
        for (int i = 0; i < n - 1; i++){
            if(A[i] != number){
                result = number;
            }
            number++;
        }

        result = A[n - 1] + 1;
        return result;
    }



    public static void main (String [] args){

    }
}
