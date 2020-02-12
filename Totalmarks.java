/*
 Write a program to find out total marks obtained by a student if the student gets 3 marks for the correct answer and -1 for the wrong answer?
 */
import java.util.*;
public class Totalmarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total=0;
		System.out.println("Enter the number of question");
		int n = sc.nextInt();
		System.out.println("Enter 1 for correct answer and 0 for incorrect answer");
		for(int i=1;i<=n;i++)
		{
			System.out.println("Question Number "+i);
			int t=sc.nextInt();
			if(t==0)
			{
				total= total-1;
			}
			else
			{
				if(t==1)
				{
					total = total + 3;
				}
			}
		}
		System.out.println("Total Marks="+ total);

	}

}
