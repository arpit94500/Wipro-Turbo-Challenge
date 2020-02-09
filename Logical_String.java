/*
 Given a string consisting of only 0, 1, A, B, C where
A = AND
B = OR
C = XOR
Calculate the value of the string assuming no order of precedence and evaluation is done from left to right.

Constraints – The length of string will be odd. It will always be a valid string.
Example, 1AA0 will not be given as an input.

Examples:

Input : 1A0B1
Output : 1
1 AND 0 OR 1 = 1

Input : 1C1B1B0A0
Output : 0
 */
import java.util.*;
public class Logical_String {
	int solution(String s)
	{
		int n=0;
		ArrayList al= new ArrayList();//list for numeric object
		ArrayList bl= new ArrayList();// list for operator
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				al.add(s.charAt(i));
			}
			else
			{
				bl.add(s.charAt(i));
			}
			if(i>=2 && i%2==0)
			{
				int t= i-1;
				if((char)bl.get(t)=='A')
				{
					n= n |((int)al.get(t-1) & (int)al.get(t+1));
				}
			}
		}
		
		System.out.println(al);
		System.out.println(bl);
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Logical_String s = new Logical_String();
		int n=s.solution(str);
		System.out.println(n);
		

	}

}
