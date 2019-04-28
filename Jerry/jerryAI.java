import java.io.*;
import java.util.*;

public class jerryAI
{
    private static void formSets()
    {
        for(int i=0;i<9;i++)
        {
            playerSet.add(playerMoves[i]);
            AISet.add(selectedSpots[i]);
            winSet.add(winCheck[i]);
        }
    }
public static void AI()
{
    int [] spots=new int [] {1,2,3,4,5,6,7,8,9};
    int selectedSpot=0;
    ArrayList <Integer> selectedSpots=new ArrayList <Integer>();
    ArrayList <Integer> playerMoves=new ArrayList <Integer>();
    int moveCount=0;
    boolean playing=true;
    boolean emptySpot=true;
    int [] winCheck= new int []{{1,2,3},{1,4.8},{1,5,9},{2,4,7},{2,6,9},{3,5,7},{3,6,9},{4,5,6},{7,8,9}};
    //Makes sets to check for subsets as wincons, compares them, true is a win, false is a continue
    Set<Integer> playerSet = new TreeSet<Integer>();
    Set<Integer> AISet = new TreeSet<Integer>();
    Set<Integer> winSet = new TreeSet<Integer>();
    while(playing)
    {
    for(int spaces=9;spaces>0;spaces--)
        {
        if((isTurnFirst()==true) || (isTurnSecond() == true))
            {
            if( moveCount==0) selectedSpot=5;
            else
                {
                selectedSpot=1+(spots.length*rand());
                while(emptySpot==false) selectedSpot=1+(spots.length*rand());
                }
            }
        selectedSpots.add(selectedSpot);
        }
        winCons(playerSet,winSet);
        wincons(AISet,winSet);
        moveCount++;
    }
}
private boolean emptySpot()
{
    for(int i=0;i<=spots.length();i++)
    {
        if(selectedSpot==spots[i]|| playerMoves==spots[i])
        {
            return false;
            break;
        }
         else return true;
    }
}
private boolean winCons(Set<T> setA, Set<T> setB)
{
    return setB.containsAll(setA);
}
private boolean playing()
{
    //remember to check for wincons each runthrough
    if (moveCount<9 && winCons==false) return true;
    else return false;
}
private static boolean isTurnFirst()
{
    if(selectedSpots.length()>=playerMoves.length()) return true;
    else return false;
}
private static boolean isTurnSecond()
{
    if(selectedSpots.length()<playerMoves.length()) return true;
    else return false;
}
}
