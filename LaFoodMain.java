import java.io.*;
import java.util.*;
import java.math.*;

public class LaRestaurant extends Customer
{
    public LaRestaurant(Scanner fin){
        super(fin);
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        String nextCommand = " ";
        Scanner cin= new Scanner(System.in);
        String fileName;
        System.out.println("Please enter your file name: ");
        fileName=cin.nextLine();
        Scanner fin= new Scanner(new FileReader(fileName));
	PartyQueue Q = new PartyQueue();
        //int lengthoffile=Integer.parseInt(fin.nextLine());
	nextCommand=fin.next();
        /* while (!(nextCommand.equalsIgnoreCase("q"))) {
            if (nextCommand.equalsIgnoreCase("a")){
	    Q.enqueue(new Customer(fin));
	    System.out.println("Please wait to be seated " + Q.getFront());
	    }
	    if(nextCommand.equalsIgnoreCase("t")){Q.dequeue()}
        } */
    }
}
