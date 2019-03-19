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
    	return front.data;
    }
    public int Wait(int toa, int seatTime)
    {
    	//Need to implement loop, just setting groundwork
    	int waitTime;
    	waitTime=seatTime-toa;
    	return waitTime;
    }
    //full of issues, just putting basic idea in place
    public boolean seated=false;
    //if(int currentTime>=seatTime) {seated=true;}
}
