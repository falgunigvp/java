import java.util.Arrays;

public class StringSorter 
{
	public static void main(String[] args)
	{
		if(args.length !=5)
		{
			System.out.println("Please provide exactly five strings");
			return;
		}
		
		String[] strings = new String[5];
		
		for(int i=0;i<5;i++)
		{
			strings[i]=args[i];
		}
		
		Arrays.sort(strings);
		
		System.out.println("Sorted strings");
		for(strings str:strings)
		{
			System.out.println(str);
		}
	}
}