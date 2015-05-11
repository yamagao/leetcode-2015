public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        HashSet<Integer> cur = new HashSet<>();
        HashSet<Integer> rep = new HashSet<>();
        for(int i = 10; i <= s.length(); i++){
            String sub = s.substring(i - 10, i);
            int n = convert(sub);
            if(!rep.contains(n)){
                if(!cur.contains(n)){
                    cur.add(n);
                }
                else{
                    rep.add(n);
                    res.add(sub);
                }
            }
        }
        return res;
    }
    
    int convert(String s){
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                res += 1;
            }
            if(s.charAt(i) == 'G'){
                res += 2;
            }
            if(s.charAt(i) == 'C'){
                res += 3;
            }
            res *= 4;
        }
        return res;
    }
}