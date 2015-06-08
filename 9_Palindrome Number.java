public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int hi = 1;
        while(x / hi > 9){
            hi *= 10;
        }
        while(x > 0){
            if(x / hi != x % 10){
                return false;
            }
            x -= x / hi * hi;
            x /= 10;
            hi /= 100;
        }
        return true;
    }
}