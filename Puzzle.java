/*public class Puzzle
{
	public static void main(String[] args)
	{
	    System.out.println("Hello");
	    System.out.println(1 + 4 + "Add");
	    System.out.println("Concatinate" + 1 + 3);
	}
}*/



/*public class Puzzle
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int sum = sumofarrayelement(arr);
		System.out.println("Addition is " + sum);
    }
	    static int sumofarrayelement(int[] a)
		{
			int total=0;
			for(int i=0;i<a.length;i++)
			{
				total=total+a[i];
			}
			return total;
		}
}*/


/*public class Puzzle
{
	public static void main(String[] args)
	{
		int[] arr ={1,2,3,4,5};
		int evenoddfunction = evenodd(arr);
		System.out.println("Even count " + evenoddfunction);
		System.out.println("Odd count " + (arr.length-evenoddfunction));
	}

	static int evenodd(int[] a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 == 0)
			{
				count++;
			}
		}
		return count;
	}
}*/

/*import java.util.*;

public class Puzzle
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] arr ={1,2,3,1,5,1,1,};
		int number = scan.nextInt();
		int countfrequency = frequency(arr,number);
		System.out.println("Output is " + countfrequency);
	}

	static int frequency(int[] a,int num)
	{
		int count=0;
		for (int element:a) 
		{
			if(element == num)
			{
               count++;
			}
		}
		return count;
	}
}*/


