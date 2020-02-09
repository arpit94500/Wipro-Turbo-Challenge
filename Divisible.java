/*Find the number closest to n and divisible by m
Given two integers n and m. The problem is to find the number closest to n and divisible by m. If there are more than one such number, then output the one having maximum absolute value. If n is completely divisible by m, then output n only. Time complexity of O(1) is required.

Constraints: m != 0

We find value of n/m. Let this value be q. Then we find closest of two possibilities. One is q * m other is (m * (q + 1)) or (m * (q – 1)) depending on whether one of the given two numbers is negative or not.*/
import java.util.*;
public class Divisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 'n'");
		int n = sc.nextInt();
		System.out.println("Enter the number 'm'");
		int m = sc.nextInt();
		if(n%m==0)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println((n/m)*m);
		}
	}

}
