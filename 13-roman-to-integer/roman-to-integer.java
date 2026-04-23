class Solution {
    public int romanToInt(String s) {
       Map<Character,Integer> romanToIntegerMap = new HashMap<>();

        romanToIntegerMap.put('I',1);
        romanToIntegerMap.put('V',5);
        romanToIntegerMap.put('X',10);
        romanToIntegerMap.put('L',50);
        romanToIntegerMap.put('C',100);
        romanToIntegerMap.put('D',500);
        romanToIntegerMap.put('M',1000);
        
        int res = 0;
        int i = 0;
        while(i<s.length()-1){
            char curr = s.charAt(i);
            char next = s.charAt(i+1);
            if(romanToIntegerMap.get(curr) < romanToIntegerMap.get(next)){
                res+=(romanToIntegerMap.get(next) - romanToIntegerMap.get(curr));
                i+=2;
            }else{
                res+=romanToIntegerMap.get(curr);
                i+=1;
            }
            
        }
        if (i == s.length() - 1) {
            res += romanToIntegerMap.get(s.charAt(i));
        }
        return res; 
    }
}