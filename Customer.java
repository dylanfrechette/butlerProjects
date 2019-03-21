//Current version full of issues bc I suck ass at coding
import java.io.*;
import java.util.*;

public class Customer
{
	static int toa;
    static int partySize;
    static String partyName;
    static int seatTime;
    public Customer(int time, int size, String who, int seat)
    {
        toa=time;
        partySize=size;
        partyName=who;
        seatTime=seat;
    }
    public Customer(Scanner fin)
    {
		toa=fin.nextInt();
		partySize=fin.nextInt();
		partyName=fin.next();
		partyName=partyName+fin.nextLine();
	}
	public static int getToa() 
    {
    	return toa;
    }
    public static int getSize() 
    {
    	return partySize;
    }
    public static String getName() 
    {
    	return partyName;
    }
    public static int getSeat()
    {
    	return seatTime;
    }
    public String toString()
    {
    	String wait= "";
    	wait =partyName+", party of "+partySize;
    	return wait;
    }
}
