func removeDuplicates(nums []int) int {
    l := 0

	for _, r := range nums {
		if l < 2 || r != nums[l-2] {

			nums[l] = r
			l++
		}
	}
	return l
}