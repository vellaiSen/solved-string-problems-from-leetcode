package stringmethods;

import java.util.Arrays;

public class LongestComPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String strs[] = {"flower","flow","flight"};
	
	StringBuilder result = new StringBuilder();
	
	Arrays.sort(strs);
	
	
	char[] first = strs[0].toCharArray();
	char[] last = strs[strs.length-1].toCharArray();
	for(int i=0;i<first.length;i++)
	{
		
		if(first[i]!=last[i])
		{
			break;
		}
		
		result.append(first[i]);
	}
	
 System.out.println(result);
	
	
	}

}
