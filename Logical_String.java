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
		
		int t=0;
		ArrayList<String> al= new ArrayList<String>();//list for numeric object
		ArrayList<String> bl= new ArrayList<String>();// list for operator
		int n=Integer.parseInt(al.get(t));
		for(int i=0;i<s.length();i++)
		{
			Object r = s.charAt(i);
			if(i%2==0)
			{
				al.add(r.toString());
			}
			else
			{
				bl.add(r.toString());
			}
		    
			if(i>=2 && i%2==0)
			{
				if(bl.get(t).equals("A"))
				{
					n= (n & Integer.parseInt(al.get(t+1)));
					t++;
				}
				else {
				if(bl.get(t).equals("B"))
				{
					n= (n | Integer.parseInt(al.get(t+1)));
					t++;
				}else
				{
				if(bl.get(t).equals("C"))
				{
					n= (n ^ Integer.parseInt(al.get(t+1)));
					t++;
				}
				}
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
