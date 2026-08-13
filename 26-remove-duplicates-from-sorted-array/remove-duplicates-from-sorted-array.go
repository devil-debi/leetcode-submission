func removeDuplicates(nums []int) int {
    start, end := 1, 1

	for end < len(nums) {

		if nums[end] != nums[end-1] {

			nums[start] = nums[end]
			start++

		}
		end++
	}
	return start
}