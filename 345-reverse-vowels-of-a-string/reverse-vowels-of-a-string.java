class Solution {
    private boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public String reverseVowels(String s) {
                char[] s_array = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end){

            if (!isVowel(s_array[start])){
                start++;
                continue;
            }

            if (!isVowel(s_array[end])){
                end--;
                continue;
            }

            char temp = s_array[start];
            s_array[start] = s_array[end];
            s_array[end] = temp;

            start++;
            end--;
        }

        return new String(s_array);
    }
}