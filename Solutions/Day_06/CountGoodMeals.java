public class CountGoodMeals {
    public static int countPairs(int[] deliciousness) {
        int count = 0;
        for (int i = 0; i < deliciousness.length-1; i++){
            for (int j = i+1; j < deliciousness.length; j++){
                //(Math.sqrt(deliciousness[i] + deliciousness[j])) % 
                   //((int)(Math.sqrt(deliciousness[i] + deliciousness[j]))) == 0
                if((int)(Math.ceil((Math.log(deliciousness[i] + deliciousness[j]) / Math.log(2))))
                    == (int)(Math.floor(((Math.log(deliciousness[i] + deliciousness[j]) / Math.log(2)))))){
                    count++;

                    // int low = 0;
                    // int high = 0;
                    // int mid = (low + high) >>> 1;
                }
            }
            
        }
        return count;
    }

    public static void main(String [] args){
        int [] deliciousness = new int [] {2160,1936,3,29,27,5,2503,1593,2,0,16,0,3860,28908,6,2,15,49,6246,1946,23,105,7996,
            196,0,2,55,457,5,3,924,7268,16,48,4,0,12,116,2628,1468};

            System.out.println(countPairs(deliciousness));
    } 
}
