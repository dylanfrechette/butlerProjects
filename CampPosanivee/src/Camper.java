import java.io.*;
import java.util.*;

public class Camper implements Comparable
{
    int age;
    char gender;
    String name;
    //default constructor
    public Camper()
    {
        age = 0;
        gender = 'A';
        name = "";
    }
    //default constructor with parameters
    public Camper(int a, char g, String n)
    {
        age = a;
        gender = g;
        name = n;
    }
    //default constructor for a scanner
    public Camper(Scanner s)
    {
        name = s.next();
        age = s.nextInt();
        gender = s.next().charAt(0);
    }

    public int compareTo(Object x)
    {
        if (x instanceof Camper)
        {
            Camper xCamper = (Camper) x;
            return this.name.compareTo(xCamper.name);
        }
        else
        {
            System.out.println("Error not a camper!");
        }
        return 0;
    }

    public int getAge()
    { return age; }

    public char getSex()
    { return gender; }

    public String getName()
    { return name; }

    public String toString()
    {
        return ("Name: "+name+" | Age: "+age+" | Gender: "+gender);
    }
}
