func majorityElement(nums []int) int {
    var res int
	var count int

	numMap := make(map[int]int)

	for _, v := range nums {

		numMap[v]++
		if numMap[v] > count {
			count = max(count, numMap[v])
			res = v

		}
	}

	fmt.Println(numMap)
	return res

}