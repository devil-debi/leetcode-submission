func canPlaceFlowers(flowerbed []int, n int) bool {
    if n == 0 {
		return true
	}
	if len(flowerbed) == 1 && flowerbed[0] == 0 {
		n--
		return n == 0
	}
	if len(flowerbed) == 1 && flowerbed[0] == 1 {
		return false
	}
	start, end := 0, 1

	for end < len(flowerbed) {

		if flowerbed[start] == 0 && flowerbed[end] == 0 {
			flowerbed[start] = 1
			n--
		} else if flowerbed[start] == 0 && flowerbed[end] == 1 {
			start++
			end++
		}
		start += 2
		end += 2
	}
	if start < len(flowerbed) && flowerbed[start] == 0 && flowerbed[start-1] == 0 {
		n--
	}
	return n <= 0
}