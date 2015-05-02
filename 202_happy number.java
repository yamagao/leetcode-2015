public class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        return isHappy(n, next(n));
    }
    
    public boolean isHappy(int m, int n){
        if(m == n){
            return false;
        }
        if(m == 1 || n == 1){
            return true;
        }
        else{
            int newM = next(m);
            int newN = next(next(n));
            return isHappy(newM, newN);
        }
    }
    
    public int next(int n){
        int answer = 0;
        int t = n;
        while(t > 0){
            answer += Math.pow((t % 10), 2);
            t /= 10;
        }
        return answer;
    }
}