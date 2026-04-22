class Solution {
    public int singleNumber(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for (int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> element: map.entrySet()){
            if (element.getValue() == 1){
                return element.getKey();
            }
        }
        return -1;
    }
}