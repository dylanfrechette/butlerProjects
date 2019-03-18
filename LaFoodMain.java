import java.io.*;
import java.util.*;
import java.math.*;

public class LaFoodMain extends Customer
{

	public LaFoodMain(int time, int size, String who)
	{
		super(time, size, who);
	}

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner cin= new Scanner(System.in);
		String fileName;
		System.out.println("Please enter your file name: ");
		
		fileName=cin.nextLine();
		Scanner fin= new Scanner(new FileReader(fileName));
	}

}
