class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] result = new int[n];
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        int commonCount = 0; 

        for (int i = 0; i < n; i++) {
            if (setB.contains(A[i])) {
                commonCount++; 
            }
            setA.add(A[i]);

            if (setA.contains(B[i])) {
                commonCount++; 
            }
            setB.add(B[i]);
            result[i] = commonCount;
        }

        return result;
    }
}