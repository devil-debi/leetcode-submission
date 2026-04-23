class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        Stack<Character> stack = new Stack<>();

        for (int i =0; i< num.length();i++){
            stack.push(num.charAt(i));
        }

        for (int i =0; i< num.length();i++){
            if (stack.pop() != num.charAt(i)){
                return false;
            }
        }
        return true;
    }
}