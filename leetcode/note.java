// string sort
public String sort(String str){
	char[] content = str.toCharArray();   // toCharArray()
	Arrays.sort(content);				// Java.Util.Arrays.sort()
	content.toString();				// toString();
}

// unique 出现一次
// permutation 出现次数相同
// ASCII  char[256]

// String concatenation operates in O(n2), most of time should use StringBuilder();
String compress(String str) {
	int size = countCompression(str);
	if (size >= str.length()) {
		return str;
	}

}

int countCompression(String str) {
	if (str == null || str.isEmpty()) return 0;
	// what is the difference bewteen isEmpty and length
	Char last = str.charAt(0);
	int size = 0;
	int count = 1;
	for (int i = 1; i < str.length; i++) {
		if(str.charAt(i) == last) {
			count++;
		} else {
			last = str.charAt(i);
			size += 1 + String.valueOf(count).length();
		}
	}
	size += 1 + String.valueOf(count).length();
	return size;
}

//LinkedList partition
LinkedList partition(LinkedListNode node, int x) {
	LinkedListNode firstStart, firstEnd, secondStart, secondEnd;
	firstStart.next = firstEnd;
	secondStart.next = secondEnd;

	while(node != null) {
		LinkedListNode next = node.next;
		if(node.data < x) {			
		}
	}
} 
//4. median of two sorted arrays, cut half of one array each time.
//5. longest palindromic substring
//10. regular expression matching

/**
KMP algorithm: the kmp algorithm is a string-searching algorithm that searches for occurences of a "word" W within a main "text string" S by employing the observation that a mismatch occurs, 
the word itself embodies sufficient information to determine where the next match could begin, thus bypassing re-examination of previously matched characters.
*/
/**
manacher algorithm

*/

	
