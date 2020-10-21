package lab1;
import java.util.Scanner;
public class Student {
public static void main(String[] args) {
	int stud,avg,sum=0;
	int[] grade=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter students");
	stud=sc.nextInt();
	for(int i=1;i<=stud;i++)
	{
		System.out.println("enter grades");
		grade[i]=sc.nextInt();
		if(grade[i]>=1 && grade[i]<=100)
		{
			sum=sum+grade[i];
		}
		else
		{
			System.err.println("invalid grade");
			System.out.println("enter grade");
			grade[i]=sc.nextInt();
		}
	}
	avg=sum/stud;
	System.out.println("avg="+avg);
	
}
}
