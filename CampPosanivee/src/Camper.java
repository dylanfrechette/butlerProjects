import java.io.*;
import java.util.*;

public class Camper  {
    String name;
    int age;
    String sex;

public static Scanner CampBoiz() throws FileNotFoundException{
    Scanner CampyBoys = new Scanner(new FileReader("Campers.txt"));
return CampyBoys;
}

    public Comparable [] Campers(String callsign, int oldness, String gender){
        Comparable [] camper= new Comparable []{callsign, oldness, gender};
        name = callsign;
        age = oldness;
        sex = gender;
        return camper;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
}
