public class Divide {
    public int divide(int dividend, int divisor){
        int count = 0;        
        for(int i=1; i<dividend; i++){
            count++;            
        }
        return count;
    }
}
