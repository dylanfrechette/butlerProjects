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
		char nextCommand=' ';
		Scanner cin= new Scanner(System.in);
		String fileName;
		System.out.println("Please enter your file name: ");
		
		fileName=cin.nextLine();
		Scanner fin= new Scanner(new FileReader(fileName));
	/*	while(fin.hasNext())
		{
			System.out.println(fin.nextLine());
		}
	 */
		PartyQueue Party = new PartyQueue();
		double waitTime=0;
		Customer didNotSit;
		int totalParty=0;
		double avgWait=0;
		//Something wrong with math, all variables present, something not finding proper avg. should be near jons example on site
		while(!(Party.isFull()))
		{
			nextCommand=fin.next().charAt(0);
			if(nextCommand=='A') 
			{
				Customer mans = new Customer(fin);
				Party.enqueue(mans);
				System.out.println("Please wait at the bar, " + mans.toString());
				totalParty=totalParty+mans.partySize;
			}
			if(nextCommand=='T')
			{
				seatTime=fin.nextInt();
				Customer ph = (Customer)Party.dequeue();
				seatTime=seatTime;
				System.out.println("Table ready for "+ph.toString()+ " (time= "+seatTime+ " minutes)");
				waitTime=waitTime+ph.partySize*(seatTime-ph.toa);
				
			}
			if(nextCommand=='Q')
			{
				didNotSit=(Customer)Party.getFront();
				System.out.println("Simulation terminated");
				System.out.println("These parties were not seated: "+didNotSit.partyName);
				break;
			}
			
		}
		waitTime=waitTime/totalParty;
		//System.out.println(Party.getFront());
		System.out.println("The average wait time was: "+waitTime+" minutes");
	}
}
