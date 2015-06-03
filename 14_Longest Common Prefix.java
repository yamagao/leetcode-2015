public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++){
            char cur = strs[0].charAt(i);
            for(String s : strs){
                if(s.length() < i + 1 || s.charAt(i) != cur) return res.toString();
            }
            res.append(cur);
        }
        return res.toString();
    }
}