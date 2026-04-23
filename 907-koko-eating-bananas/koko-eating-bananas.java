// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//       int start = 0;
//         int end = 0;
//         for(int i : piles){
//             end = Math.max(end,i);
//         }
//         int res = end;
//         while(start <= end){
//             int mid = (start+end)/2;
//             int hours = 0;
//             for(int i : piles){
//                 hours+=Math.ceil((double)i/mid);
//             }
//             if(hours <= h){
//                 res = Math.min(res,mid);
//                 end = mid -1;
//             }else{
//                 start = mid+1;
//             }
//         }
//         return res;  
//     }
// }
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canFinish(piles, mid, h)) {
                right = mid;        
            } else {
                left = mid + 1;     
            }
        }

        return left;
    }

    private boolean canFinish(int[] piles, int k, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;  
        }
        return hours <= h;
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}