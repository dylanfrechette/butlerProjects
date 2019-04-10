import java.io.*;
import java.util.*;



public class CampMain {

	//Displays Help Screen with prompts to input
	public static Scanner Help() throws FileNotFoundException
{
	Scanner fin=new Scanner (new FileReader("camp.txt"));
	while (fin.hasNextLine()){
		System.out.println(fin.nextLine());
	}
	return fin;
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

			else if (cin == 'W')

			else if (cin == 'D')

			else if (cin == 'A')

			else if (cin == 'L')

			else if (cin == 'S')

			else if (cin == 'P')

			else if (cin != 'Q')
			{
				System.out.println("That isn't a valid input, please try again: ");
				cin(System.in);
			}

			Help();
			cin(System.in);
			}
	}

}
