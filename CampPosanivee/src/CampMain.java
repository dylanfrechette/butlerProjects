import java.io.*;
import java.util.*;

//Found big issue, delete, insert, etc. are all nonstatic methods, which can't be called in our main, which is static

public class CampMain //extends BST 
{

    //Displays Help Screen with prompts to input
    public static void listHelp() throws FileNotFoundException{
        Scanner helpScan = new Scanner(new FileReader("camp.txt"));
        while (helpScan.hasNextLine()) {
            System.out.println(helpScan.nextLine());
        }
    }

    public static void enroll(int a, int b) throws FileNotFoundException {
        String name = CampyBoys.next();
        int age = CampyBoys.nextInt();
        String sex = CampyBoys.next();
        if (sex.equalsIgnoreCase("M")) { a++; }
        else {b++;}
        Comparable camper = new Camper(name, age, sex);
        insert(camper);
    }
    public static int avgAge(int counter, Camper x) {
        int avgAge = 0;
        for (int i = 0; i < counter; i++) {
            avgAge += (x.getAge())/i;
        }
        return avgAge;
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Found fin to be redundant bc CampyBoys in constructor class
        //Scanner fin = new Scanner(new FileReader("Campers.txt"));
        boolean running=true;
        String command = " ";
        String camper = " ";
        int count, bCount,gCount;
        count=bCount=gCount= 0;
        BST tree = new BST();
        System.out.println("Hello! Welcome to Camp Posanivee!");
        while (running) {
            command = CampyBoys.next();
            System.out.println("Command: " + command);
            if (command.equalsIgnoreCase("H")) {
                listHelp();
            } else if (command.equalsIgnoreCase("E")) {
                enroll(bCount, gCount);
            } else if (command.equalsIgnoreCase("W")) {camper= CampyBoys.next(); delete(camper);}
            else if(command.equalsIgnoreCase("D")){camper=CampyBoys.next(); lookup(camper);}
            else if (command.equalsIgnoreCase("A")){count = bCount+gCount;
                avgAge(count, xCamper);
            }
            else if(command.equalsIgnoreCase("L")){
                traversal(r, INORDER);
            }
            else if(command.equalsIgnoreCase("S")){System.out.println("Boys: " + bCount +"\n" + "Girls: " + gCount);}
            else if(command.equalsIgnoreCase("P")){traversal(r, PREORDER);}
            else if(command.equalsIgnoreCase("Q")){running=false;}
    }
    }
}