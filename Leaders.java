/*
Printing all the Leaders in an Array
Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side.

And the rightmost element is always a leader. For example int the array {16, 19, 4, 3, 8, 3}, leaders are 19, 8 and 3?
*/
import java.util.*;
public class Leaders {
	void solution(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{ int flag =0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}*/
		
		int arr[] = new int[]{16, 19, 4, 3, 8, 3};
		Leaders l =new Leaders();
		l.solution(arr);
		

	}

}
