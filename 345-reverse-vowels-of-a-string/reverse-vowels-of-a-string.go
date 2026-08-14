func reverseVowels(s string) string {
  charArray := []byte(s)
	left, right := 0, len(charArray)-1
	for left < right {

		if isVowel(charArray[left]) && isVowel(charArray[right]) {
			temp := charArray[left]
			charArray[left] = charArray[right]
			charArray[right] = temp
			left++
			right--
		}
		if isVowel(charArray[left]) && !isVowel(charArray[right]) {
			right--
		}
		if !isVowel(charArray[left]) && isVowel(charArray[right]) {
			left++
		}
		if !isVowel(charArray[left]) && !isVowel(charArray[right]) {
			left++
			right--
		}

	}
	return string(charArray)  
}
func isVowel(char byte) bool {
	char = byte(unicode.ToLower(rune(char)))
	return char == 'a' || char == 'e' || char == 'i' ||
		char == 'o' || char == 'u'

}