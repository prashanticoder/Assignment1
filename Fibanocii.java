package lab1;



public class Fibanocii {
public static void main(String[] args) {
	int n1=1;
	int n2=1;
	int n3;
	double avg;
	for(int i=2;i<=20;i++)
	{
		
		n3=n1+n2;
		System.out.print(n1+" ");
		n1=n2;
		n2=n3;
	}
	    avg=(n1+n2)/20;
	    System.out.println("avg="+avg);
	   
	
}
}
