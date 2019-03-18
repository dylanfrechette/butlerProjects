//Current version full of issues bc I suck ass at coding
public class Customer 
{
	int toa;
    int partySize;
    String partyName;
    int seatTime;
    public Customer(int time, int size, String who)
    {
        toa=time;
        partySize=size;
        partyName=who;
    }
    public int Wait(int toa, int seatTime)
    {
    	//Need to implement loop, just setting groundwork
    	int waitTime;
    	waitTime=seatTime-toa;
    	return waitTime;
    }
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
    //full of issues, just putting basic idea in place
    public boolean seated=false;
    if(int currentTime>=seatTime) {seated=true;}
}
