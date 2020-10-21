package lab1;

import java.util.Arrays;

public class Copy {
public static void main(String[] args) {
	int arr[]= {3,4,5};
	int temp[]=copyOfArray(arr);
	arr[2]=999;
	for(int t:temp)
	{
		System.out.println(t);
	}
	
}
	private static int[] copyOfArray(int[] arr)
	{
		return Arrays.copyOf(arr, arr.length);
	}
}
