/*
 Given an array arr[] of integers, find out the difference between any two elements such that larger element appears after the smaller number in arr[].

Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2).
 If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9)

Time Complexity: O(n^2)
Auxiliary Space: O(1)
*/
public class Max_difference {
	void solution(int arr[])
	{
		int diff=0;
			for(int i=0;i<arr.length;i++)
			{ 
				for(int j=i;j<arr.length;j++)
				{
					if(arr[j]>arr[i])
					{
						int d= arr[j]-arr[i];
						if(d>diff)
						{
							diff=d;
						}
					}
				}
				
					
				
			}
			System.out.println(diff);
	}

	public static void main(String[] args) {
		int arr[] = new int[]{7, 9, 5, 6, 3, 2};
		int arr1[] = new int[]{2, 3, 10, 6, 4, 8, 1};
		Max_difference l =new Max_difference();
		l.solution(arr);
		l.solution(arr1);

	}

}
