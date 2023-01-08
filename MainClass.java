package emp.implementation;

import java.util.*;

public class MainClass 
{
	static int engineersCount, accountantsCount,max, min;
	static int[] engineersSalary,accountantsSalary;
	static double average, esum = 0, asum = 0;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Engineers ");
		engineersCount = sc.nextInt();
		System.out.print("Enter the number of Accountants ");
		accountantsCount = sc.nextInt();
		
		engineersSalary = new int[engineersCount];
		System.out.println("Enter the salary of Engineers");
		for(int i=0;i < engineersCount; i++)
	    {
			engineersSalary[i] = sc.nextInt();
	    }
		accountantsSalary = new int[accountantsCount];
		System.out.println("Enter the salary of Accountants");
		for(int i=0;i < accountantsCount; i++)
	    {
			accountantsSalary[i] = sc.nextInt();
	    }
		
		Company c = new EngineerFirm();
		c.assignSalaries(engineersSalary);
		c.averageSalary();
		c.maxSalary();
		c.minSalary();
		
		Company c1 = new AccountantFirm();
		c1.assignSalaries(accountantsSalary);
		c1.averageSalary();
		c1.maxSalary();
		c1.minSalary();
	}

}
