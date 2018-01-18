package cs2013.edu;

//print out a number from 1-n using recursion
//base case number = N
//induction step: increment number, call fcn

public class Recursion_1_to_n 
{
	public static void main(String[] args)
	{
		new Recursion_1_to_n().print(1);
	}
	
	public static final int N = 10;
	
	void print(int number)
	{
		//base case
		if(number == N)
		{
			return;
		}
		else
		{
			//induction step
			System.out.println(number);
			print(number + 1);
		}
	}
}
