public class Solution {
    public boolean isValid(String s) {
        Stack<Character> par = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(cur == '(' || cur == '{' || cur == '['){
                par.push(cur);
                continue;
            }
            if(par.empty() && (cur == ')' || cur == '}' || cur == ']')) return false;
            if(cur == ')' && par.pop() != '(' || cur == '}' && par.pop() != '{' || cur == ']' && par.pop() != '[') return false;
        }
        if(!par.empty()) return false;
        return true;
    }
}