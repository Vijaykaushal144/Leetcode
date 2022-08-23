class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        
        List<String> list = new ArrayList<>();
        list = pad("", digits);
        return list;
    }
    
    public List<String> pad(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        int digit = up.charAt(0) - '0';
        
        List<String> ans = new ArrayList<>();
        
        int start = (digit-2)*3;
        int end = (digit-1)*3;
        
        if(digit == 7 || digit == 9){
            end++;
        }
        if(digit == 8  || digit == 9){
            start++;
            end++;
        }
        
        for(int i=start; i<end; i++){
            char ch = (char)('a' + i);
            ans.addAll(pad(p+ch, up.substring(1)));
        }
        
        return ans;
        
    }
}