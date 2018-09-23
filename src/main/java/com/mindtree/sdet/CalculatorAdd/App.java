package com.mindtree.sdet.CalculatorAdd;

import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App 
{
	int a,b,c;
	public void add()
	{
        System.out.println("Enter value of a and b");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Add result="+c);
	}
    public static void main( String[] args )
    {
        App a=new App();
        a.add();
    }
}
