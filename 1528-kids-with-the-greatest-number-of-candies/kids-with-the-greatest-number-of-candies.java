class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
              List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        for (int i : candies){
            maxCandies = Math.max(maxCandies,i);
        }
        for (int i : candies){
            if( i+extraCandies >= maxCandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }


        return result;
    }
}