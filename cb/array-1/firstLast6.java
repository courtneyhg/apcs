public boolean firstLast6(int [] nums) {
	int length = (nums.length - 1);
	if (nums[0] == 6 || nums[length] == 6){
		return true;
	}
	else {
		return false;
	}
}
