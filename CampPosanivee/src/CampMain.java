import java.io.*;
import java.util.*;


public class CampMain{

    //Displays Help Screen with prompts to input
    public static void listHelp() throws FileNotFoundException{
        Scanner helpScan = new Scanner(new FileReader("camp.txt"));
        while (helpScan.hasNextLine()) {
            System.out.println(helpScan.nextLine());
        }
    }

    private static void enroll(BST t, Scanner s) //G2G
    {
        t.insert(new Camper(s));
        System.out.println("New camper added.");
    }

    private static void withdraw(BST t, Camper key) //G2G
    {
        t.delete(key);
        System.out.println("Camper withdrawn.");
    }

    private static void display(Camper key) //G2G
    {
        System.out.println( "  Name: "+key.name+"\n"+"  Age: "+key.age+"\n"+"  Gender: "+key.gender );
    }
    private static void genCount(BST t) //FIX THIS
    {
        int bCount=0;
        int gCount=0;
        t.reset(BST.INORDER);
        while(t.hasNext()) {
            if ( (((Camper)(t.getNext())).getSex())=='M' )
                bCount++;
            else if ( (((Camper)(t.getNext())).getSex())=='F' )
                gCount++;
        }
        System.out.println("Camper count:\n  Boys:  "+bCount+"\n  Girls: "+gCount);
    }

    public static Camper campLookup(BST t, Scanner s) //G2G
    {

        String search = s.next();
        Camper key = new Camper(0,'A',search);

        Camper answer = (Camper)
                t.lookup(key);

        if(answer==null)
        {
            System.out.println(search+" not found");
            return null;
        }
        else
            return answer;
    }

    private static void average(BST t)
    {
        t.reset(BST.INORDER);

        double totalAge=0;
        double count=0;
        while(t.hasNext())
        {
            totalAge += (double)( (Camper)t.getNext() ).getAge();
            count++;
        }

        if (count>0)
        {
            double avg = (double)(totalAge / count);
            System.out.println("The average age is: "+avg);
        }
        else
            System.out.println("Error: No campers");
    }



    public static void main(String[] args) throws FileNotFoundException {
        Scanner fin = new Scanner(new FileReader("Campers.txt"));
        boolean running=true;
        String command = " ";
        String camper = " ";
        int count, bCount,gCount;
        count=bCount=gCount= 0;
        BST camp = new BST();
        System.out.println("Hello! Welcome to Camp Posanivee!");
        //may create a function to run this portion of the program , this may help with static/non-static interference
        while (running) {
            command = fin.next();
            Camper nodeKey = new Camper();
            System.out.println("Command: " + command);
            switch (command){
                case "H" :
                System.out.println("Help");
                listHelp();
                break;
                case "E" :
                    System.out.println("Enroll");
                enroll(camp, fin);
                break;
                case "W" :
                    System.out.println("Withdraw");
                nodeKey = campLookup(camp, fin);
                withdraw(camp, nodeKey);
                break;
                case "D" :
                    System.out.println("Camper Info: " + camper);
                    nodeKey = campLookup(camp, fin);
                    display(nodeKey);
                    break;
                case "A" :
                    System.out.println("Average age of campers");
                    average(camp);
                    break;
                case "L" :
                    System.out.println("List");
                    BST.traversal(camp, BST.INORDER);
                    break;
                case "S":
                    genCount(camp);
                    break;
                case "P":
                    BST.traversal(camp, BST.PREORDER);
                    break;
                case "Q":
                    running=false;
            }
        }
        System.out.println("Command: End Program\n\nProgram Terminated");
    }
}
