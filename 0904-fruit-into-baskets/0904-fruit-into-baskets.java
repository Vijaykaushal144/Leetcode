class Solution {
    public int totalFruit(int[] fruits) {
        int i = 0, j = 0;
        int ans = 0;   
        Map<Integer, Integer> b = new HashMap<>();
        while (j < fruits.length) {
            b.put(fruits[j], 1 + b.getOrDefault(fruits[j], 0));
            while (b.size() > 2) {
                b.put(fruits[i], b.get(fruits[i]) - 1); 
                if (b.get(fruits[i]) == 0) {    
                    b.remove(fruits[i]);
                }
                i++;
            }
            ans = Math.max(ans, j - i + 1); 
            j++;   
        }

        return ans; 
    }
}