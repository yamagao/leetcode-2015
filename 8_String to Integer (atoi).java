public class Solution {
    public int myAtoi(String str) {
        int result = 0;
        int minus = 0;
        int space = 0;
        if(str.length() == 0){
            return 0;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ' && space == 0){
                space = 1;
            }
            if(str.charAt(i) == ' ' && space == 0){
                continue;
            }
            if(str.charAt(i) == '-' && minus == 0){
                minus = -1;
                continue;
            }
            if(str.charAt(i) == '+' && minus == 0){
                minus = 1;
                continue;
            }
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                if(Integer.MAX_VALUE / 10 < result || Integer.MAX_VALUE / 10 == result && Integer.MAX_VALUE % 10 < str.charAt(i) - '0'){
                    if(minus == -1){
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }
                result = result * 10 + str.charAt(i) - '0';
            }
            else{
                if(minus == -1){
                    return 0 - result;
                }
                return result;
            }
        }
        if(minus == -1){
            return 0 - result;
        }
        return result;
    }
}