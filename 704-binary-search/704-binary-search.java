class Solution {
  
    public int search(int[] nums, int target) {
      int left = 0;
      int right = nums.length -1;
      do{
        int middle = right - left/2;
        int value = nums[middle];
        if(value == target) return middle; 
        if(value > target){
          right = middle - 1;
        }else{
          left = middle + 1;
        }
      }while(left <= right );
      return -1;
    }
  
}