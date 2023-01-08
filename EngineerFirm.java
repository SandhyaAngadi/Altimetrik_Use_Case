package emp.implementation;

import emp.implementation.Company;

public class EngineerFirm implements Company
{
	int i;
	public void assignSalaries(int[] salaries)
	{
		System.out.print("Incomes of engineers credited: ");
		for(i=0; i<MainClass.engineersCount; i++)
		{
			System.out.print(salaries[i]+" ");
		}
		System.out.println();
	}
    
	@Override
	public void averageSalary() 
	{
		for(i=0; i< MainClass.engineersCount; i++)
		{
			MainClass.esum += MainClass.engineersSalary[i];
			MainClass.average = (MainClass.esum)/(double)(MainClass.engineersSalary.length);
			
		}
		System.out.println("Average salary of engineers is "+ MainClass.average);
	}

	@Override
	public void maxSalary() 
	{
		MainClass.max = MainClass.engineersSalary[0];
		for(i=1;i < MainClass.engineersCount; i++)
		{
			if(MainClass.engineersSalary[i] > MainClass.max)
		    {
				MainClass.max = MainClass.engineersSalary[i];
			}
			
		}
		System.out.println("Maximum salary amongst engineers is " +MainClass.max);
		
		
	}

	@Override
	public void minSalary() 
	{
		MainClass.min = MainClass.engineersSalary[0];
		for(i=1; i < MainClass.engineersCount; i++)
		{
			if(MainClass.engineersSalary[i] < MainClass.min)
			{
				MainClass.min =MainClass.engineersSalary[i];

			}
			
		}
	    System.out.println("Minimum salary amongst engineers is " +MainClass.min);
	    System.out.println();
	}
}