class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

    int maxZero,start,end;
    start = end = -1;
    maxZero = (flowerbed.length == 1 && flowerbed[0] == 0) ? 1 : 0;

    for (int i = 0 ; i<flowerbed.length ;i++){

        if (flowerbed[i] == 0 && start == -1){
            start = i;  
        }
        if (flowerbed[i] == 1 && end  == -1 && start > -1){
            end = i;
        }
        if (start  >-1 && end  > -1){
            int diff = end - start;
            maxZero += (start == 0) ? (diff)/2 : ((diff) > 4 ? (diff)/3 +1 : (diff)/3);
            start = end = -1; 
        }
      
    }

    if(start > -1 && end == -1){
      end = flowerbed.length;
      maxZero +=  (start > 0) ? (end - start)/2 : (end + 1) /2;
    }
    return maxZero >= n ;
    
    }
}