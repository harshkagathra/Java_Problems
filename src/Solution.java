

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	public static List<String> findKMinusOneDistinct(String str, int k) {
		Set<String> output = new HashSet<>();
		int res = 0; 
		ArrayList<String> test1 = new ArrayList<String>();
		int n = str.length(); 

		// To store count of characters from 'a' to 'z' 
		int cnt[] = new int[26]; 

		// Consider all substrings beginning with 
		// str[i] 
		for (int i = 0; i < n; i++) 
		{ 
			int dist_count = 0; 
			// Initializing count array with 0 
			Arrays.fill(cnt, 0); 
			
			// Consider all substrings between str[i..j] 
			String temp="";
			for (int j=i; j<n; j++) 
			{ 
				Character test =str.charAt(j);
				
				// If this is a new character for this 
				// substring, increment dist_count. 
				if (cnt[str.charAt(j) - 'a'] == 0) { 
					dist_count++; 
					temp=temp+test+"";
				}
				// Increment count of current character 
				cnt[str.charAt(j) - 'a']++; 

				// If distinct character count becomes k, 
				// then increment result. 
				if (dist_count == k) { 
					res++;
					output.add(temp);
				}
			} 
		} 
		test1.addAll(output);
		return test1;         
	}
	
	public static void main(String[] args) {
		String input = "abcd";
		String input1 = "awaglknagawunagwkwagl";
		System.out.println(findKMinusOneDistinct(input1,4));
	}
}