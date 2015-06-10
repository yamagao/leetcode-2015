public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(A >= G || E >= C || B >= H || F >= D){
            return (C - A) * (D - B) + (G - E) * (H - F);
        }
        else{
            return (C - A) * (D - B) + (G - E) * (H - F) - (Math.min(C, G) - Math.max(E, A)) * (Math.min(D, H) - Math.max(B, F));
        }
    }
}