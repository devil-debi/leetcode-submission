class Solution {
    public String mergeAlternately(String word1, String word2) {
       int len = word1.length() > word2.length() ? word1.length() : word2.length();
       String result = "";
        //Queue<Character> characterQueue = new ArrayDeque<>();
        for (int i  = 0; i< len ;i++){
            if (i < word1.length()){
               // characterQueue.offer(word1.charAt(i));
               result+=word1.charAt(i);
            }
            if (i < word2.length()){
                //characterQueue.offer(word2.charAt(i));
                result+=word2.charAt(i);
            }
        }
        
        // for (Character c: characterQueue){
        //     System.out.println(c);
        //     result+=c;
        // }
    return result; 
    }
}