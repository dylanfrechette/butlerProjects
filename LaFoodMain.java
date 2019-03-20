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
		
		//nextCommand=front.data ? i think
		while(!(nextCommand.equalsIgnoreCase("q")))
		{
			if(nextCommand.equalsIgnoreCase("a")) 
			{
				Party.enqueue(front.data);
				//toa=front.data need a way to access the toa int within the object (get?)
				//partySize=front.data; same thing
				//partyName=front.data; same thing
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
