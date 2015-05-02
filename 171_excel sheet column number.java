public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i = 1; i <= s.length(); i++){
            result += (s.charAt(s.length() - i) - 'A' + 1) * Math.pow(26, i - 1);
        }
        return result;
    }
}