import java.util.Arrays;

public class MinMaxSorter
{
	public static void main(String[] args)
	{
		if(args.length !=5)
		{
			System.out.println("Please provide exactly five values");
			return;
		}
		
		int[] numbers = new int[5];
		
		try{
			for(int i=0;i<5;i++)
			{
				numbers[i]=Integer.parseInt(args[i]);
			}
		}catch (NumberFormatException e){
			System.out.println("Invali input.");
		}
		
		java.util.Arrays.sort(numbers);
		
		System.out.println("Sorted strings");
		for(int num:numbers)
		{
			System.out.println(num);
		}
		
		System.out.println("Maximum value: " + numbers[0]);
		System.out.println("Minimum value: " + numbers[4]);
	}
}