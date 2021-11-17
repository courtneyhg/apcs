public int bigDiff(int[] nums) {
  int max;
  int min;
  for (int i=0; i<nums.length; i++){
    if (Math.max(nums[i+1], nums[i]) == nums[i]){
      max = nums[i];
    }
      else {
        min = nums[i];
      }
    }
    return max-min;
}
