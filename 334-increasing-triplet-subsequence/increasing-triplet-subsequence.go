func increasingTriplet(nums []int) bool {
    
    i, j := math.MaxInt32, math.MaxInt32

	for _, num := range nums {
		if num <= i {
			i = num
            continue
		} else if num <= j {
			j = num
            continue
		} else {
			return true
		}

	}
	return false
}