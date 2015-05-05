public class Solution {
    public int countPrimes(int n) {
        if(n < 3){
            return 0;
        }
        int count = n - 2;
        int[] array = new int[n];
        for(int i = 2; i <= Math.sqrt(n - 1); i++){
            for(int j = 2; j < (n - 1) / i + 1; j++){
                if(array[i * j] == 0){
                    array[i * j] = 1;
                    count--;
                }
            }
        }
        return count;
    }
}