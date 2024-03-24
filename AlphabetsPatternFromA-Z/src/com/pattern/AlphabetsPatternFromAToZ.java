//java program to prints Alphabets from A to Z using star pattern

package com.pattern;
public class AlphabetsPatternFromAToZ {


	public static void main(String[] args) 
	{

		
		int i,j, n=11;
		
		for(i=0;i<n;i++)
		{       

			//code for A 
			for(j=0;j<n;j++)
			{
				if(i==0&&j>0&&j<n-1 || i==(n-1)/2 || j==0&&i>0 || j==n-1&&i>0 )
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("    ");
			
			//code for B
			for(j=0;j<n;j++)
			{
				if(i==0&&j<n-2 || j==0|| i==n-1&&j<n-2 || i==(n-1)/2&&j<n-2 || 
						j==n-1&&i>0&&i<(n-1)/2 || j==n-1&&i>(n-1)/2&&i<n-1)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
                        System.out.print("    ");

			//code for C
			for(j=0;j<n;j++)
			{
				if(i==0&&j>0 || i==n-1&&j>0 || j==0&&i>0&&i<n-1)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
                       System.out.print("    ");

			//code for D
			for(j=0;j<n;j++)
			{
				if(j==0 || i==0&&j<n-2 || i==n-1&&j<n-2 || j==n-1&&i>0&&i<n-1)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
                        System.out.print("    ");

			//code for E
			for(j=0;j<n;j++)
			{
				if(i==0&&j>0 || i==n-1&&j>0 || i==(n-1)/2 || j==0&&i>0&&i<n-1)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
                        System.out.print("    ");

			//code for F
			for(j=0;j<n;j++)
			{
				if(i==0|| i==(n-1)/2 || j==0)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
                        System.out.print("    ");

			//code for G
			for(j=0;j<n;j++)
			{
				if(i==0&&j>0&&j<n-2 || j==0&&i>0&&i<n-2 ||i==n-2&&j>1 || i==n-5&&j>2 
						|| j==n-1&&i>=n-4 || j==n-1&&i>0&&i<2)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
                        System.out.print("    ");

			//code for H
			for(j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || i==(n-1)/2)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
                        System.out.print("    ");

			//code for I
			for(j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==(n-1)/2)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
                       System.out.print("    ");

			////code for J
			for(j=0;j<n;j++)
			{
				if(i==0 || j==n-1&&i<n-1 || i==n-1&&j>1&&j<n-2 || j==0&&i<n-1&&i>(n-1)/2+2) //j==0&&i<n-1&&i>=n-3
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
                        System.out.print("    ");

			//code for K
			for(j=0;j<n;j++)
			{
				if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("    ");

			//code for L
			for(j=0;j<n;j++)
			{
				if(j==0 || i==n-1)
					    System.out.print("*");
				else
					System.out.print(" ");
			}
				
				
			 System.out.print("    ");

			//code for M
			 for(j=0;j<n;j++)
			 {
				if(j==0 || j==n-1 || i==j&&i<=(n-1)/2 || i+j==n-1&&j>=(n-1)/2) 
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("    ");

			//code for N
			 for(j=0;j<n;j++)
			 {
				if(j==0 || i==j || j==n-1)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("    ");

			//code for O
			 for(j=0;j<n;j++)
			 {
				if(i==0&&j>0&&j<n-1 || i==n-1&&j>0&&j<n-1 || j==0&&i>0&&i<n-1 || j==n-1&&i>0&&i<n-1) 
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("    ");

			//code for P
			 for(j=0;j<n;j++)
			 {
				if(j==0&&j<n-1 || i==0&&j<n-2 || i==(n-1)/2&&j<n-2 || j==n-1&&i>0&&i<(n-1)/2) 
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("    ");

			//code for Q
			 for(j=0;j<n;j++)
			 {
				/*if(i==0&&j>0&&j<3*(n-1)/4 || i==3*(n-1)/4&&j>0&&j<3*(n-1)/4 || j==0&&i>0&&i<3*(n-1)/4 
						|| j==3*(n-1)/4&&i>0&&i<3*(n-1)/4 || i==j&&i>(n-1)/2) */
				 
				 if(i==0&&j>0&&j<n-2 || i==n-3&&j>0&&j<n-2 || j==0&&i>0&&i<n-3
							|| j==n-2&&i>0&&i<n-3 || i==j&&i>(n-1)/2)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("    ");

			//code for R
			 for(j=0;j<n;j++)
			 {
				if(j==0 || i==0&&j<n-2 || i==(n-1)/2&&j<n-2 || j==n-1&&i>0&&i<(n-1)/2 || j==n-1&&i>(n-1)/2) 
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("    ");

			//code for S
			 for(j=0;j<n;j++)
			 {
				if(i==0&&j>0&&j<n-1 || i==(n-1)/2&&j>0&&j<n-1 || i==n-1&&j>0&&j<n-1 || j==0&&i>0&&i<(n-1)/2 || 
						j==n-1&&i>(n-1)/2&&i<n-1 || j==n-1&&i>0&&i<(n-1)/2-2 || j==0&&i<n-1&&i>(n-1)/2+3) 
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			
			 System.out.print("    ");

			//code for T
			 for(j=0;j<n;j++)
			 {
				if(i==0 || j==(n-1)/2)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("    ");

			//code for U
			 for(j=0;j<n;j++)
			 {
				if(j==0&&i<n-1 || j==n-1&&i<n-1 || i==n-1&&j>1&&j<n-2)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("    ");

			//code for V
			 for(j=0;j<n*2;j++)
			 {
				if(i==j || i+j==n*2-1)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("    ");

			//code for W
			 for(j=0;j<n;j++)
			 {
				if(j==0 || j==n-1 ||i==j&&i>=(n-1)/2 || i+j==n-1&&j<=(n-1)/2)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("    ");

			//code for X
			 for(j=0;j<n;j++)
			 {
				if(i==j || i+j==n-1)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("    ");

			//code for Y
			 for(j=0;j<n;j++)
			 {
				if(i==j&&i<(n-1)/2 || i+j==n-1)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("    ");

			//code for Z
			 for(j=0;j<n;j++)
			 {
				if(i==0 || i==n-1 || i+j==n-1)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			
			
			System.out.println();
		}

	}

}
