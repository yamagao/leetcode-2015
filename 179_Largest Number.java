public class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            s[i] = nums[i] + "";
        }
        Comparator<String> comp = new Comparator<String>(){
            public int compare(String st1, String st2){
                String temp1 = st1 + st2;
                String temp2 = st2 + st1;
                return temp1.compareTo(temp2);
            }
        };
        Arrays.sort(s, comp);
        if(s[s.length - 1].charAt(0) == '0'){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        
        for(String str : s){
            sb.insert(0, str);
        }
        return sb.toString();
    }
}