package com.pattern;

public class AlphabetsPatternFromAToZ {


	public static void main(String[] args) 
	{

		
		int i,j, n=11;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0&&j>0&&j<n-1 || i==(n-1)/2 || j==0&&i>0 || j==n-1&&i>0 )
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("   ");
			
			for(j=0;j<n;j++)
			{
				if(i==0&&j<n-2 || j==0|| i==n-1&&j<n-2 || i==(n-1)/2&&j<n-2 || 
						j==n-1&&i>0&&i<(n-1)/2 || j==n-1&&i>(n-1)/2&&i<n-1)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
           System.out.print("   ");
			
			for(j=0;j<n;j++)
			{
				if(i==0&&j>0 || i==n-1&&j>0 || j==0&&i>0&&i<n-1)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
           System.out.print("   ");
			
			for(j=0;j<n;j++)
			{
				if(j==0 || i==0&&j<n-2 || i==n-1&&j<n-2 || j==n-1&&i>0&&i<n-1)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
           System.out.print("   ");
			
			for(j=0;j<n;j++)
			{
				if(i==0&&j>0 || i==n-1&&j>0 || i==(n-1)/2 || j==0&&i>0&&i<n-1)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
           System.out.print("   ");
			
			for(j=0;j<n;j++)
			{
				if(i==0|| i==(n-1)/2 || j==0)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
           System.out.print("   ");
			
			for(j=0;j<n;j++)
			{
				if(i==0&&j>0&&j<n-2 || j==0&&i>0&&i<n-2 ||i==n-2&&j>1 || i==n-5&&j>2 
						|| j==n-1&&i>=n-4 || j==n-1&&i>0&&i<2)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
           System.out.print("   ");
			
			for(j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || i==(n-1)/2)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
           System.out.print("   ");
			
			for(j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==(n-1)/2)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
           System.out.print("   ");
			
			for(j=0;j<n;j++)
			{
				if(i==0 || j==n-1&&i<n-1 || i==n-1&&j>1&&j<n-2 || j==0&&i<n-1&&i>(n-1)/2+2) //j==0&&i<n-1&&i>=n-3
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
           System.out.print("   ");
			
			for(j=0;j<n;j++)
			{
				if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("   ");
				
			for(j=0;j<n;j++)
			{
				if(j==0 || i==n-1)
					    System.out.print("*");
				else
					System.out.print(" ");
			}
				
				
			 System.out.print("   ");
					
			 for(j=0;j<n;j++)
			 {
				if(j==0 || j==n-1 || i==j&&i<=(n-1)/2 || i+j==n-1&&j>=(n-1)/2) 
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("   ");
				
			 for(j=0;j<n;j++)
			 {
				if(j==0 || i==j || j==n-1)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("   ");
				
			 for(j=0;j<n;j++)
			 {
				if(i==0&&j>0&&j<n-1 || i==n-1&&j>0&&j<n-1 || j==0&&i>0&&i<n-1 || j==n-1&&i>0&&i<n-1) 
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("   ");
				
			 for(j=0;j<n;j++)
			 {
				if(j==0&&j<n-1 || i==0&&j<n-2 || i==(n-1)/2&&j<n-2 || j==n-1&&i>0&&i<(n-1)/2) 
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("   ");
				
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
			 
			 
			 System.out.print("   ");
				
			 for(j=0;j<n;j++)
			 {
				if(j==0 || i==0&&j<n-2 || i==(n-1)/2&&j<n-2 || j==n-1&&i>0&&i<(n-1)/2 || j==n-1&&i>(n-1)/2) 
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("   ");
				
			 for(j=0;j<n;j++)
			 {
				if(i==0&&j>0&&j<n-1 || i==(n-1)/2&&j>0&&j<n-1 || i==n-1&&j>0&&j<n-1 || j==0&&i>0&&i<(n-1)/2 || 
						j==n-1&&i>(n-1)/2&&i<n-1 || j==n-1&&i>0&&i<(n-1)/2-2 || j==0&&i<n-1&&i>(n-1)/2+3) 
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			
			 System.out.print("   ");
				
			 for(j=0;j<n;j++)
			 {
				if(i==0 || j==(n-1)/2)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("   ");
				
			 for(j=0;j<n;j++)
			 {
				if(j==0&&i<n-1 || j==n-1&&i<n-1 || i==n-1&&j>1&&j<n-2)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("   ");
				
			 for(j=0;j<n*2;j++)
			 {
				if(i==j || i+j==n*2-1)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("   ");
				
			 for(j=0;j<n;j++)
			 {
				if(j==0 || j==n-1 ||i==j&&i>=(n-1)/2 || i+j==n-1&&j<=(n-1)/2)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("   ");
				
			 for(j=0;j<n;j++)
			 {
				if(i==j || i+j==n-1)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("   ");
				
			 for(j=0;j<n;j++)
			 {
				if(i==j&&i<(n-1)/2 || i+j==n-1)
						 System.out.print("*");
				else
					 System.out.print(" ");
			}
			 
			 
			 System.out.print("   ");
				
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
