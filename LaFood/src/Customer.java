import java.io.*;
import java.util.*;

public class Customer
{
    int toa;
    int partySize;
    String partyName;
    int seatTime;
    
    //general Constructor
    public Customer(int time, int size, String who, int seat)
    {
        toa=time;
        partySize=size;
        partyName=who;
        seatTime=seat;
    }
    //scanner Constructor
    public Customer(Scanner fin)
    {
        toa=fin.nextInt();
        partySize=fin.nextInt();
        partyName=fin.next();
        partyName=partyName+fin.nextLine();
    }
    //get functions
    public int getToa()
    {
        return toa;
    }
    public int getSize()
    {
        return partySize;
    }
    public String getName()
    {
        return partyName;
    }
    public int getSeat()
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
