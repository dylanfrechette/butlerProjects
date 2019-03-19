import java.io.*;
import java.util.*;
import java.math.*;

public class LaFoodMain extends Customer
{

	public LaFoodMain(int time, int size, String who, int seat)
	{
		super(time, size, who, seat);
	}

	public static void main(String[] args) throws FileNotFoundException
	{
		String nextCommand=" ";
		Scanner cin= new Scanner(System.in);
		String fileName;
		System.out.println("Please enter your file name: ");
		
		fileName=cin.nextLine();
		Scanner fin= new Scanner(new FileReader(fileName));
//		while(fin.hasNext())
//		{
//			System.out.println(fin.nextLine());
//		}
		 
		PartyQueue Party = new PartyQueue();
		
		//nextCommand=fin.next();
		while(!(nextCommand.equalsIgnoreCase("q")))
		{
			nextCommand=fin.next();
			System.out.println(nextCommand);
			
			if(nextCommand.equalsIgnoreCase("a")) 
			{
				Party.enqueue(fin);
				toa=fin.nextInt();
				partySize=fin.nextInt();
				partyName=fin.next();
			}
			if(nextCommand.equalsIgnoreCase("t"))
			{
				Party.dequeue();
				seatTime=fin.nextInt();
			}
		}
		//System.out.println(Party.getFront());
	}
}
