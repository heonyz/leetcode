class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ans[] = new int[A.length];
        int freq[] = new int[A.length + 1];

        for(int i=0; i<A.length; i++){
            freq[A[i]]++;
            freq[B[i]]++;
            int j = 0;
            int c = 0;
            while(j < freq.length){
                if(freq[j] >= 2){
                    c++;
                    ans[i] = c;
                }
                else{
                    ans[i] = c;
                }
                j++;
            }
            
        }
        return ans;
    }
}