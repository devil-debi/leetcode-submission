class Solution {
    public boolean isPalindrome(int x) {

        // if (x < 0){return false;}
        // String num = Integer.toString(x);
        // Stack<Character> stack = new Stack<>();

        // for (int i =0; i< num.length();i++){
        //     stack.push(num.charAt(i));
        // }

        // for (int i =0; i< num.length();i++){
        //     if (stack.pop() != num.charAt(i)){
        //         return false;
        //     }
        // }
        // return true;
    if (x < 0) return false;

    int div = 1;

    while (x / div >= 10) {
        div *= 10;
    }

    while (x != 0) {
        if (x / div != x % 10) return false;

        x = (x % div) / 10;
        div /= 100;
    }

    return true;
    }
}