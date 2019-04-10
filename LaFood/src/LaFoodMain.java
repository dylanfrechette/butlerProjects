//One Dylan, Two Dylan, Red Dylan, Blue Dylan
//3-22-19
//LaFood Restaurant Simulator brought to you by yours truly :)
import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class LaFoodMain extends Customer
{

    public LaFoodMain(int time, int size, String who, int seat)
    {
        super(time, size, who, seat);
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        //placeholder for reading in the A or T or Q from the file and enabling the program to know what to do next
	char nextCommand=' ';
	DecimalFormat df = new DecimalFormat("#.00");
        Scanner cin= new Scanner(System.in);
        String fileName;
        System.out.println("Please enter your file name: ");
        fileName=cin.nextLine();
        Scanner fin= new Scanner(new FileReader(fileName));
	//create our queue
        PartyQueue Party = new PartyQueue();
	//variables for averaging data
        double totMins=0;
        Customer didNotSit;
        int headCount=0;
        int seatTime;
        double avg=0;
	//start of program
        while(!(Party.isFull()))
        {
            nextCommand=fin.next().charAt(0);
            if(nextCommand=='A')
            {
                //mans is the new customer that is arriving
		Customer mans = new Customer(fin);
                Party.enqueue(mans);
                System.out.println("Please wait at the bar, " + mans.toString());
            }
            if(nextCommand=='T')
            {
                seatTime=fin.nextInt();
		//sitting is the first customer from the queue aka the first in line to be seated
                Customer sitting = (Customer)Party.dequeue();
                System.out.println("Table ready for "+sitting.toString()+ " (time= "+seatTime+ " minutes)");
		//updates the total wait time for each customer as they sit
                totMins+=sitting.getSize()*(seatTime-sitting.getToa());
		//update the total number of people who have sat and waited
                headCount += sitting.getSize();
            }
            if(nextCommand=='Q'){
                System.out.println("Simulation terminated");
		//dequeue and display each customer still in the queue until it's empty after the program ends
                while(!(Party.isEmpty())) {
                    didNotSit = (Customer) Party.dequeue();
                    System.out.println("These parties were not seated: " + didNotSit.getName());
                }
                break;
            }

        }
        avg=totMins/headCount;
	//formatting average to two decimal places
	//String formatted = new df.format(avg);
        System.out.println("The average wait time was: "+avg+" minutes");
    }
}