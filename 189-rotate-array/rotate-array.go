func rotate(nums []int, k int)  {
   k = k % len(nums)
	reverseArray(nums, 0, len(nums)-1)
	reverseArray(nums, 0, k-1)
	reverseArray(nums, k, len(nums)-1) 
}

func reverseArray(nums []int, l, r int) []int {

	for l < r {
		nums[l], nums[r] = nums[r], nums[l]

		l++
		r--
	}
	return nums
}