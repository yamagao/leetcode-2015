public class Solution {
    public String convert(String s, int numRows) {
        if(numRows >= s.length() || numRows == 1) return s;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < numRows; i++){
            int j = i;
            while(j < s.length()){
                res.append(s.charAt(j));
                if(i > 0 && i < numRows - 1 && j + (numRows - i - 1) * 2 < s.length()){
                    res.append(s.charAt(j + (numRows - i - 1) * 2));
                }
                j += (numRows - 1) * 2;
            }
        }
        return res.toString();
    }
}