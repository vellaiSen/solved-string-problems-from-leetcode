package stringmethods;

public class LengthOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "i am vellai";
		int n = str.length();
		System.out.println(lengthOfLastWord(str));

	}

	static int lengthOfLastWord(String s) {
		String str=s.trim();
		int count = 0;

		for (int i = str.length() - 1; i >= 0; i--)

		{

			if (str.charAt(i) != ' ') {
				count++;
			} else {
				break;
			}

		}

		return count;

	}

}
