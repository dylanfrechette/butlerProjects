import java.io.*;
import java.util.*;

public class CampMain {

	public static void main(String[] args) throws FileNotFoundException
	{	
		Scanner fin=new Scanner (new FileReader("camp.txt"));
	while (fin.hasNextLine()){
		System.out.println(fin.nextLine());
	}
	}

}
