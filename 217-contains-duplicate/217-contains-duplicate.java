class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> history = new HashSet<>(nums.length);
      for(int n: nums){
        if(history.contains(n)){
          return true;
        }
          history.add(n);
      }
      return false;
    }
}