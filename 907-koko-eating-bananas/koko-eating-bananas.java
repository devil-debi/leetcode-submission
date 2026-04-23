class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int start = 0;
        int end = 0;
        for(int i : piles){
            end = Math.max(end,i);
        }
        int res = end;
        while(start <= end){
            int mid = (start+end)/2;
            int hours = 0;
            for(int i : piles){
                hours+=Math.ceil((double)i/mid);
            }
            if(hours <= h){
                res = Math.min(res,mid);
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return res;  
    }
}