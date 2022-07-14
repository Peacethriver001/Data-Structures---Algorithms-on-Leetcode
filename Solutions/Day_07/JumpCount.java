public class JumpCount {
    public static void main (String [] args){
        System.out.println(solution(10, 85, 30));
    }

    public static int solution(int X, int Y, int D) {
        int result = (Y - X) / D;
        int remainder = (Y - X) % D;
        //int res = (int)Math.ceil(result);        
        if (remainder > 0){
            return (result + 1);
        }
        return result;
    }
}
