import java.io.*;
import java.util.*;


public class CampMain {

	//Displays Help Screen with prompts to input
	public static Scanner Help() throws FileNotFoundException
{
	Scanner fin=new Scanner (new FileReader("camp.txt"));
	while (fin.hasNextLine())
	{
		System.out.println(fin.nextLine());
	}
	return fin;
}
	public static String [] Enroll()
	{
		String [] camper= new String [] {"name", "age", "sex"};
		insert(camper);
		return camper;
	}
	public static int avgAge()
	{
		ing avgAge = 0;
		for (int i=0; i < numCampers; i++)
		{
		avgAge = avgAge + camperAge[i];
		}
		return avgAge;
	}
	public static void main(String[] args) throws FileNotFoundException
	{	
	Help();
	System.out.println("Please enter what you would like to do: ");
	Scanner cin=new Scanner(System.in);
		while(cin != 'Q')
		{
			if (cin == 'H') Help();

			else if (cin == 'E')
				System.out.println("Enroll a new camper: ");
				Enroll();

			else if (cin == 'W')
				System.out.println("Withdraw a camper: ");

			else if (cin == 'D')
				System.out.println("Age and Gender of selected camper: ");

			else if (cin == 'A')
				System.out.println("Average age of campers: "+ avgAge());
			else if (cin == 'L')
				System.out.println("Alphabetical list of campers: ");
			else if (cin == 'S')
				System.out.println("Number of boys: "+boys+" Number of girls: "+girls);
			else if (cin == 'P')
				System.out.println("List of campers in preorder: ");
			else if (cin != 'Q')
			{
				System.out.println("That isn't a valid input, please try again: ");
				cin(System.in);
			}

			Help();
			cin(System.in);
		}
	System.out.println("Finished editing Camp Roster");	
	}
}
