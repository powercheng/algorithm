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
manacher algorithm: the longest palindromic substring
use the information that has been calculated, reduce the computation.
*/
	for (int i = 0; i < s.length(); i++) {
            int currArmLen = 0;            
            if (right > i) {
                int symPoint = 2*center - i;
                int symArm = armLens[symPoint];
                int minArmLen = Math.min(symArm, right - i);
                currArmLen = expand(s, i-minArmLen, i+minArmLen);
            } else {
                currArmLen = expand(s, i, i);
            }
            armLens[i] = currArmLen;
            if (i+currArmLen > right) {
                right = i+currArmLen;
                center = i;
            }
            if (currArmLen*2 + 1 > end - start) {
                start = i - currArmLen;
                end = i + currArmLen;
            }
        }
// if we consider to solve this problem by the way of dynamic programming, dp[i][j] represents the substring is palindromic or not
// start from the length is 1, all dp[i][i] is true, then process the length is 2. for loop start from the length is 3 to end.

public static Map<String, String> articleMapOne;
static {
    articleMapOne = new HashMap<>();
    articleMapOne.put("ar01", "Intro to Map");
    articleMapOne.put("ar02", "Some article");
}

//～ bit complement compute
//~(-4) = 3
//~(3) = -4
//-4 + ~(-4) = -1	 all 1 in two bit

//bucket sorting

while(maxVal >= exp) {
	int[] cnt = new int[10];
	for (int i = 0; i < n; i++) {
		int digit = (nums[i]/(int)exp) % 10;
		cnt[digit]++;
	}
	for (int i = 0; i < 10; i++) {
		cnt[i] += cnt[i-1];
	}
	for (int i = 0; i < n; i++) {
		int digti = (nums[i]/(int)app) % 10;
		buf[cnt[digit]-1] = nums[i];
		cnt[digit]--;
	}
}
System.copy
	






