/*Longest Prefix Suffix
 
Given a string of character, find the length of longest proper prefix which is also a proper suffix.
Example:
S = abab
lps is 2 because, ab.. is prefix and ..ab is also a suffix.

Input:
First line is T number of test cases. 1<=T<=100.
Each test case has one line denoting the string of length less than 100000.

Expected time compexity is O(N).

Output:
Print length of longest proper prefix which is also a proper suffix.

Example:
Input:
2
abab
aaaa

Output:
2
3*/
import java.util.*;
public class Prefix_Suffix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  of String");
		int n =sc.nextInt();
		//String s[] = new String[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the string number "+i);
		String s1= sc.next();
		int len = s1.length();
		int m=0,t=0;
		if(len%2==0)
		{
		m=len/2;
		t = len/2;
		}
		else
		{
			m=len/2;
			t=(len/2)+1;
		}
		String a=s1.substring(0, (t));
		String b=s1.substring((m),len);
		while(m<len)
		{
		if(a.equals(b) )
		{
			
			break;
		}
		else
		{
			m++;
			t--;
			a=s1.substring(0, (t));
			b=s1.substring((m),len);
			
		}
		}
		System.out.println(t);
		}
		
	}

}
