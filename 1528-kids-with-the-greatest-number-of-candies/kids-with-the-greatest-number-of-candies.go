func kidsWithCandies(candies []int, extraCandies int) []bool {
  maxCandies := 0
	result := make([]bool, len(candies))
	for _, i := range candies {
		maxCandies = max(maxCandies, i)
	}
	for i, v := range candies {
		if v+extraCandies >= maxCandies {
			result[i] = true
		} else {
			result[i] = false
		}
	}
	return result  
}