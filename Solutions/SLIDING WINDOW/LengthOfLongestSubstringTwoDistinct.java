//import java.util.HashMap;

public class LengthOfLongestSubstringTwoDistinct {
    // public int lengthOfLongestSubstringTwoDistinct (String s){
    //     int d = 0, begin = 0, counter = 0, end = 0;
    //     HashMap<Integer, Integer> map = new HashMap<>(128, 0);
    //     while (end < s.length()){
    //         if(map.get(s.charAt(end++))++ == 0)
    //     }
    //     return d;
    // }

    public static int[] DailyTemperatures(int[] temperatures) {
        int counter = 1;
        int tempLength = temperatures.length;
        int [] answer = new int[tempLength];
        for(int i = 0; i < tempLength-1; i++){
            int a = i+1;
            if (temperatures[a] > temperatures[i]){
                answer[i] = counter;
            }
            else {
                // if(a >= tempLength-1){
                //     answer[tempLength-1] = 0;      
                //     break;
                // }
                while(temperatures[a] <= temperatures[i]){
                    a++;
                    counter++;
                    if(a == tempLength-1 && temperatures[a] <= temperatures[i]){
                        counter = 0;
                        break;
                    }
                }
                answer[i] = counter;
            }
            counter = 1;
        }
        return answer;
    }

    public static void main(String [] args){
        int [] A = {77,77,77,77,77,41,77,41,41,77};
        //[55,38,53,81,61,93,97,32,43,78]
        //89,62,70,58,47,47,46,76,100,70
        //[89,62,70,58,47,47,46,76,100,70]
        //[77,77,77,77,77,41,77,41,41,77]
        System.out.println(DailyTemperatures(A));
    }
}
