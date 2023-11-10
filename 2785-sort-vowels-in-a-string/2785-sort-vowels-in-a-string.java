class Solution {
    public String sortVowels(String s) {
        char[] arr = s.toCharArray();
        int cntVowels = 0;

        for (char ch : arr)
            if (isVowel(ch))
                cntVowels++;

        char[] vowels = new char[cntVowels];
        int k = 0;

        for (char c : arr)
            if (isVowel(c))
                vowels[k++] = c;

        Arrays.sort(vowels);
        k = 0;

        for (int i = 0; i < arr.length; i++)
            if (isVowel(arr[i])) 
                arr[i] = vowels[k++];

        return String.valueOf(arr);
    }

    public boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}