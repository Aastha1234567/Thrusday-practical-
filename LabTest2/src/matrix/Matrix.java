package matrix;

import java.util.Arrays;

public class Matrix
{
	public static void main(String[] args) {
		int arr1[][] = {{10,20,30}, {40,50,60},{60,70,80}};
		
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int arr2[][] = {{1,2,3}, {4,5,6},{7,8,9}};
		
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int arr3[][] = {{11,22,33}, {44,55,66},{67,78,89}};
		
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}
