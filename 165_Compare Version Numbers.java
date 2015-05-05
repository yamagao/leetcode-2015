public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] array1 = version1.split("\\.");
        String[] array2 = version2.split("\\.");
        
        for(int i = 0; i < Math.max(array1.length, array2.length); i++){
            int var1 = i < array1.length? Integer.parseInt(array1[i]) : 0;
            int var2 = i < array2.length? Integer.parseInt(array2[i]) : 0;
            if(var1 > var2){
                return 1;
            }
            if(var1 < var2){
                return -1;
            }
        }
        return 0;
    }
}