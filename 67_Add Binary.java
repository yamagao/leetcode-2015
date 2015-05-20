public class Solution {
    public String addBinary(String a, String b) {
        if(a.length() == 0){
            return b;
        }
        if(b.length() == 0){
            return a;
        }
        int al = a.length();
        int bl = b.length();
        char[] result = new char[Math.max(al, bl) + 1];
        int sum = 0;
        int carry = 0;
        char first = '0';
        char second = '0';
        for(int i = 0; i < result.length; i++){
            first = al - 1 - i > -1 ? a.charAt(al - 1 - i) : '0';
            second = bl - 1 -i > -1 ? b.charAt(bl - 1 - i) : '0';
            sum = first + second - '0' - '0' + carry;
            if(sum == 3){
                result[result.length - 1 - i] = '1';
                carry = 1;
            }
            if(sum == 2){
                result[result.length - 1 - i] = '0';
                carry = 1;
            }
            if(sum == 1){
                result[result.length - 1 - i] = '1';
                carry = 0;
            }
            if(sum == 0){
                result[result.length - 1 - i] = '0';
                carry = 0;
            }
        }
        String res = new String(result);
        if(result[0] == '0'){
            return res.substring(1);
        }
        return res;
    }
}