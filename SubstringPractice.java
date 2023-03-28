package stringmethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubstringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findlongestSubstring("abcabcab"));
	}

	// write a loop to compare each char to next one
	// if next char is same as previous one ignore previosly selected substring

	private static int findlongestSubstring(String s) {
		int i = 0;
		int j = 0;

		int result = 0;
		if (s.isEmpty()) {
			return 0;
		} else if (s.length() == 1) {
			return 1;
		}
		
		List<Character> list = new ArrayList<Character>();

		while (j < s.length()) {

			if (!list.contains(s.charAt(j))) {

				list.add(s.charAt(j));
				j++;
				result = Math.max(result, list.size());
				

			} else {
				list.remove(Character.valueOf(s.charAt(i)));
				i++;
				

			}
			
		}

		return result;
	}

}
