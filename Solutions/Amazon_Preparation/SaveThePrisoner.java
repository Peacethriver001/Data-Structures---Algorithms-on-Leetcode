public class SaveThePrisoner {
    public static void main(String [] args){
        System.out.println(saveThePrisoner(3, 7, 3));
    }

    public static int saveThePrisoner(int n, int m, int s){
        int left = s - 1, right = n;
        for (int i = 1; i <= m; i++){
            left++;
            if(left == right && i == m){
                return left;
            }
            if(left == right){
                left = 0;
            }
        }
        return left;
    }
}
