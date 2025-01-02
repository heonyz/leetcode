class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int res = 0, can = capacity;
        for (int i=0; i< plants.length; ++i) {
            if (can < plants[i]){
                res += i * 2;
                can = capacity;
            }
            can -= plants[i];
        }
        return res + plants.length;
    }
}