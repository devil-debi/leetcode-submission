class Solution {
    public String gcdOfStrings(String str1, String str2) {
       int l1 = str1.length();
        int l2 = str2.length();
        int g = gcd(l1,l2);

        for (int i = 0; i< l1;i++){
            if (str1.charAt(i)!= str2.charAt(i%g)){
                return "";
            }
        }

        for (int j = 0; j< l2;j++){
            if (str2.charAt(j)!= str1.charAt(j%g)){
                return "";
            }
        }

        return str1.substring(0,g);


    }
    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
}