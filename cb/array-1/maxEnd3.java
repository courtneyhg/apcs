public int[] maxEnd3(int[] nums) {
	int [] bob = {nums[0], nums[0], nums[0]};
	int [] jeff = {nums[2], nums[2], nums[2]};
	if (nums[0] > nums[2]){
		return bob;
	}
	else {
		return jeff;
	}
}
