import java.io.*;
import java.util.*;
import java.math.*;
public class Wumpus extends Rooms{
    public Wumpus(Scanner roomFile) {
        super(roomFile);
        /*Jellyfish are spiders
         * Rock Bottom is pit
         * Mr Krabs and Formula is wumpus
         * special weapon is arrows
         * locations are rooms
         */
    }

    static void dangerous(Rooms x, int krabs, int jelly1, int jelly2, int rockbot1, int rockbot2){
        System.out.println(" ");
        if (x.isAdj(krabs))
            System.out.println("Room " + krabs + " reeks of Krabs and his money");
        if (x.isAdj(jelly1))
            System.out.println("There's a faint buzzing coming from Location " + jelly1);
        if (x.isAdj(jelly2))
            System.out.println("There's a faint buzzing coming from Location " + jelly2);
        if (x.isAdj(rockbot1))
            System.out.println("You hear the distant sound of tongue raspberries from Location " + rockbot1);
        if (x.isAdj(rockbot2))
            System.out.println("You hear the distant sound of tongue raspberries from Location " + rockbot2);
    }
//placeholder variables used for the purpose of shortening code a little, universal purpose throughout for each one
    static int move(Rooms[] a,int x, int y){
        if (y == a[x - 1].getAdj1())
            return y;
        else if (y == a[x - 1].getAdj2())
            return y;
        else if (y == a[x - 1].getAdj3())
            return y;
        else {System.out.println("You can only get to different areas in Bikini Bottom through the connecting tunnels\n"); return x;}
    }

    static boolean shoot(int wump, int target){
        if(target==wump){
            System.out.println("Ravioli! Ravioli! You got the formuoli!");
            System.out.println("The Chum Bucket has become the most popular restaurant in Bikini Bottom");
            System.out.println("Victory Screech!!! *uluulululululululululululu*");
            return false;
        }
        else System.out.println("You hit nothing."); return true;
    }

    static boolean isRepeating(int[] a, int x){
        for(int i = 0; i<a.length; i++){
            if(x==a[i])
                return true;
        }
        return false;
    }
    //array used to contain hazard rooms
    static int [] hazardRooms=new int[5];

    static int wumpusRoom() {
        int wumpusRoom = (int) (2 + (8 * Math.random()));
        hazardRooms[0]=wumpusRoom;
        return wumpusRoom;
    }
//while loops run checks through array to ensure no repeat rooms
    static int spiderRoom() {
        int spiders = (int) (2 + (8 * Math.random()));
        while(isRepeating(hazardRooms, spiders))
        {spiders = (int) (2 + (8 * Math.random()));}
        hazardRooms[1]=spiders;
        return spiders;
    }

    static int spiderRoomTwo() {
        int secondSpiders = (int) (2 + (8 * Math.random()));
        while(isRepeating(hazardRooms, secondSpiders))
        {secondSpiders = (int) (2 + (8 * Math.random()));}
        hazardRooms[2]=secondSpiders;
        return secondSpiders;
    }

    static int darkPit() {
        int pit = (int) (2 + (8 * Math.random()));
        while(isRepeating(hazardRooms, pit))
        {pit = (int) (2 + (8 * Math.random()));}
        hazardRooms[3]=pit;
        return pit;
    }

    static int darkPitTwo() {
        int secondPit = (int) (2 + (8 * Math.random()));
        while(isRepeating(hazardRooms, secondPit))
        {secondPit = (int) (2 + (8 * Math.random()));}
        hazardRooms[4]=secondPit;
        return secondPit;
    }
    //unique text for each type of death, runs check for if room is safe
    static boolean isSafe(int [] hazardRooms, Rooms currentRoom){
        //for(int i=0;i<hazardRooms.length;i++)
        if(currentRoom.getNum()==hazardRooms[0])
        {System.out.println("Eugene heard you fumbling around beneath him and stepped on you like the vermin you are.");
            return false;
        }
        else if(currentRoom.getNum()==hazardRooms[1]||currentRoom.getNum()==hazardRooms[2])
        {System.out.println("You walked into a room full of jellyfish and got electrecuted.. underwater.. imagine that");
            return false;
        }
        else if(currentRoom.getNum()==hazardRooms[3]||currentRoom.getNum()==hazardRooms[4])
        {System.out.println("You *pfft* fell *pfft* into *pfft* Rock *pfft* Bottom, *pfft* next *pfft* bus *pfft* leaves *pfft* never *pfft*");
            return false;
        }

        else return true;

    }
    //  return(x.getNum()!=a&&x.getNum()!=b&&x.getNum()!=c&&x.getNum()!=d&&x.getNum()!=e);


    public static void main(String[] args) throws IOException{

        Scanner cin = new Scanner(System.in);
        Scanner roomFile;
        roomFile = new Scanner(new FileReader("wumpusText.txt"));
        int numRoom = roomFile.nextInt();

        Rooms[] roomDetails;
        roomDetails = new Rooms[numRoom];

        for (int i = 0; i < roomDetails.length; i++) {

            roomDetails[i] = new Rooms(roomFile);
        }
        int room = 1;
        int arrows=3;
        int nextRoom;
        int wumpusRoom=wumpusRoom();
        int spiderRoom=spiderRoom();
        int spiderRoomTwo=spiderRoomTwo();
        int darkPit=darkPit();
        int darkPitTwo = darkPitTwo();
        String user;
        boolean isPlaying=true;
        System.out.println("Mr. Krabs has led Bikini Bottom's restaurant scene for too long.");
        System.out.println("You, Sheldon Plankton, must locate and defeat Krabs and claim the formula!\n");
        System.out.print("An Alaskan Bull Worm has conveniently dug tunnels to various locations ");
        System.out.println("beneath Bikini Bottom; Use these to locate Krabs.");
        System.out.println("You have created a special weapon that will finally allow you to " +
                "DESTROY Krabs and take the Krabby Patty Formula,\nbut it only has enough energy for 3 uses.");
        while(isPlaying) {
            System.out.println("You have " + arrows + " charges left.");
            System.out.println("You are in location " + roomDetails[room - 1].getNum() + ".\n");
            System.out.println(roomDetails[room - 1].getText());
            System.out.println("There are tunnels leading to locations " + roomDetails[room - 1].getAdj1() + ", " + roomDetails[room - 1].getAdj2() + ", and " + roomDetails[room - 1].getAdj3());
            dangerous(roomDetails[room - 1], wumpusRoom, spiderRoom, spiderRoomTwo, darkPit, darkPitTwo);
            System.out.println("You can (m)ove or (s)hoot\nWhat would you like to do?");
            user = cin.next();
            if (user.equalsIgnoreCase("m")) {
                System.out.println("Which location would you like to move to?");
                nextRoom = cin.nextInt();
                room = move(roomDetails,room, nextRoom);
                isPlaying=isSafe(hazardRooms, roomDetails[room-1]);
            }
            else if(user.equalsIgnoreCase("s")){
                if(arrows>0) {
                    arrows--;
                    System.out.println("Which location would you like to shoot into?");
                    System.out.println(roomDetails[room - 1].getAdj1() + " " + roomDetails[room - 1].getAdj2() + " " + roomDetails[room - 1].getAdj3());
                    nextRoom = cin.nextInt();
                    if (!(roomDetails[room - 1].isAdj(nextRoom)))
                        System.out.println("You can only shoot into locations that you are next to... obviously");
                    else
                        isPlaying = shoot(wumpusRoom, nextRoom);
                }
                else System.out.println("The weapon's out of energy!!");
            }
        }
    }
}
