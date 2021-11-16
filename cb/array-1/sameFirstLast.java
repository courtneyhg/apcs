public boolean sameFirstLast(int[] nums) {
	int length = (nums.length - 1);
	if (nums.length >= 1 && nums[0] == nums[length]){
		return true;
	}
	else {
		return false;
	}
}
