import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class RobotToOrigin
{
	public static int compute_number_score(int number) {
		       int ans= 0;
		       ans= getDigitWiseScore(number) + countConsecutiveThrees(number) + get(number);
		        return ans;
		    }

		    public static int getDigitWiseScore(int num) {
		        int score = 0;
		        if (num % 5 == 0) score += 6;
		        while (num > 0) {
		            int d = num % 10;
		            if (d == 5) score += 2;
		            if (d % 2 != 0) score += 1;
		            num = num / 10;
		        }
		        return score;
		    }
		    public static int countConsecutiveThrees(int num) {
		        int score = 0;
		        int currentOnes = 0;
		        while (num > 0) {
		            int d = num % 10;
		            num = num / 10;
		            if (d != 3 && currentOnes > 1) {
		                score += 4;
		                score += (currentOnes - 2) * 4;
		                currentOnes = 0;
		            }
		            if (d != 3 && currentOnes == 1) {
		                currentOnes = 0;
		            }
		            if (d == 3) {
		                currentOnes++;
		            }
		        }
		        if (currentOnes > 1) {
		            score += 4;
		            score += (currentOnes - 2) * 4;
		        }
		        return score;
		    }

		    public static int get(int num) {
		        int x = 0, count = 1;
		        List < Integer > store = new ArrayList < > ();
		        String s = Integer.toString(num);
		        while (x < s.length() - 1) {
		            if (s.charAt(x+1) == s.charAt(x )+1 ) {
		                count++;
		                x++;
		            } else {
		                x++;
		                store.add(count);
		                count = 1;
		            }
		        }
		        store.add(count);
		        int score = 0;
		        for (Integer i: store) {
		            score += i * i;
		        }
		        return score;
		    }

	
	public static void main(String[] args)
	{
		int number = 456;
		int ans = compute_number_score(number);
		System.out.println(ans);
	}
}