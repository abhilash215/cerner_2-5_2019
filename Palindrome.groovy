println "Please enter some text to see whether or not it is a palindrome: "
String s = System.console().readLine()
int length = s.length()
int charCount = length
String reverse = ""
while (charCount > 0) {
	char c = s.charAt(charCount-1)
	charCount--
	reverse = reverse + c
}
if (reverse == s) {
	println "This is a palindrome."
}
else {
	println "This isn't a palindrome."
}
