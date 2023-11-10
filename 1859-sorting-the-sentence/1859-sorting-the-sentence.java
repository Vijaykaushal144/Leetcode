class Solution {
 public String sortSentence(String s) {
        String[] a = s.split(" ");
        String[] res = new String[a.length];
        for (String word : a) {
            // Get 0th-based index from the word
            int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            // Store the original word without a numeric value
            res[index] = word.substring(0, word.length() - 1);
        }
        
        return String.join(" ", res);
    }
}