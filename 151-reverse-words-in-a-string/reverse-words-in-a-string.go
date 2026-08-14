func reverseWords(s string) string {
    // strArray := strings.Fields(s)

	// slices.Reverse(strArray)

	// return strings.Join(strArray, " ")
    	i, j := len(s)-1, len(s)-1
	var res string
	letter_digit := []*unicode.RangeTable{unicode.Letter, unicode.Digit}
	for i >= 0 {
		if !unicode.IsOneOf(letter_digit, rune(s[i])) {
			i--
			continue
		}

		j = i

		for j >= 0 && unicode.IsOneOf(letter_digit, rune(s[j])) {
			j--
		}

		if res != "" {
			res += " "
		}

		res += s[j+1 : i+1]
		i = j
	}

	return res
}