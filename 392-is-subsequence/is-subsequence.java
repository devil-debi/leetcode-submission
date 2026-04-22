class Solution {
    public boolean isSubsequence(String s, String t) {
       if(s.equals(t) || s.isEmpty()) {
            return true;
        }
        if(t.isEmpty()){
            return false;
        }
        
        int first = 0;
        int second = 0;
        int i = 0;
        while (first < s.length() && second < t.length() ){
            if (s.charAt(first) == (t.charAt(second))){
                first++;
                
            }
            second++;
        }


        return first == s.length(); 
    }
}