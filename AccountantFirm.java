package emp.implementation;

import emp.implementation.Company;
import emp.implementation.MainClass;


public class AccountantFirm implements Company
{
	int i;
	public void assignSalaries(int[] salaries)
	{
		System.out.print("Incomes of accountants credited: ");
		for(i=0; i<MainClass.accountantsCount; i++)
		{
			System.out.print(salaries[i]+" ");
		}
		System.out.println();
	}
    
	@Override
	public void averageSalary() 
	{
		for(i=0; i< MainClass.accountantsCount; i++)
		{
			MainClass.asum += MainClass.accountantsSalary[i];
			MainClass.average = (MainClass.asum)/(double)(MainClass.accountantsSalary.length);
			
		}
		System.out.println("Average salary of accountants is "+ MainClass.average);
	}

	@Override
	public void maxSalary() 
	{
		MainClass.max = MainClass.accountantsSalary[0];
		for(i=1;i < MainClass.accountantsCount; i++)
		{
			if(MainClass.accountantsSalary[i] > MainClass.max)
		    {
				MainClass.max = MainClass.accountantsSalary[i];
			}
			
		}
		System.out.println("Maximum salary amongst accountants is " +MainClass.max);
		
		
	}

	@Override
	public void minSalary() 
	{
		MainClass.min = MainClass.accountantsSalary[0];
		for(i=1; i < MainClass.accountantsCount; i++)
		{
			if(MainClass.accountantsSalary[i] < MainClass.min)
			{
				MainClass.min =MainClass. accountantsSalary[i];

			}
			
		}
	    System.out.println("Minimum salary amongst accountants is " +MainClass.min);
	}
}