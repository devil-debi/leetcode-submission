func reverseWords(s string) string {
    strArray := strings.Fields(s)

	slices.Reverse(strArray)

	return strings.Join(strArray, " ")
}