class Solution {
    public String mergeAlternately(String word1, String word2) {
        //  StringBuilder result = new StringBuilder();
        // int i = 0;
        
        // while (i < word1.length() || i < word2.length()) {
            
        //     if (i < word1.length()) {
        //         result.append(word1.charAt(i));
        //     }
            
        //     if (i < word2.length()) {
        //         result.append(word2.charAt(i));
        //     }
            
        //     i++;
        // }
        //  return result.toString();
        char[] list1 = word1.toCharArray();
        char[] list2 = word2.toCharArray();
        int a = 0;  int b = 0; int i = 0;
        int n1 = word1.length();
        int n2 = word2.length();
        char[] word = new char[n1+n2];
        int turn = 1;

        while(a < n1 && b < n2){
            if(turn == 1){
                word[i] = list1[a];
                a++;
                i++;
                turn = 2;
            }
            else{
                word[i] = list2[b];
                b++;
                i++;
                turn = 1;
            }
        }

        while(turn == 1 && a < n1){
            word[i] = list1[a];
                a++;
                i++;
        }

        while(turn == 2 && b < n2){
            word[i] = list2[b];
                b++;
                i++;
        }

        String result = new String(word);
        return result;
        
       
    }
}