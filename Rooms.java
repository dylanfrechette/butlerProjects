import java.io.*;
import java.util.*;
import java.math.*;

public class Rooms implements Comparable {
    @Override
    public int compareTo(Object o) {

        return 0;
    }

    int roomNum, adj1, adj2, adj3;
    String description;
    boolean isWumpus, isSpider, isDarkPit = false;

    //Scanner roomFile = new Scanner(new FileReader("wumpusText.txt"));
    public Rooms(int num, int ad1, int ad2, int ad3, String text) {
        roomNum = num;
        adj1 = ad1;
        adj2 = ad2;
        adj3 = ad3;
        description = text;
    }

    public Rooms(Scanner roomFile) {

        roomNum = roomFile.nextInt();
        //System.out.println(roomNum);
        adj1 = roomFile.nextInt();
        //System.out.println(adj1);
        adj2 = roomFile.nextInt();
        //System.out.println(adj2);
        adj3 = roomFile.nextInt();
        //System.out.println(adj3);
        String placeholder = roomFile.nextLine();
        description = roomFile.nextLine();
        //System.out.println(description);
    }

    public int getNum() {
        return roomNum;
    }

    public boolean isWumpus(int x){return(x==roomNum); }

    public boolean isAdj(int a){
        if(adj1==a) return true;
        if(adj2==a) return true;
        if(adj3==a) return true;
        return false;
    }

    public int getAdj1() {
        return adj1;
    }

    public int getAdj2() {
        return adj2;
    }

    public int getAdj3() {
        return adj3;
    }

    public String getText() {
        return description;
    }
}