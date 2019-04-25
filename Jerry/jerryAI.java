import java.io.*;
import java.util.*;

public class AI
{
public static void AI()
{

    int [] spots=new int [] {1,2,3,4,5,6,7,8,9};
    int selectedSpot=0;
    int [] selectedSpots=new int [9];
    int moveCount=0;
    boolean playing=true;
    boolean emptySpot=true;
    while(playing)
    {
        for(int spaces=9;spaces>0;spaces--)
        {
        if( count==0) selectedSpot=5;
        else{
            selectedSpot=1+(spots.length*rand());
            if(emptySpot==false) selectedSpot=1+(spots.length*rand());
        }
        }
        moveCount++;
    }
}
}