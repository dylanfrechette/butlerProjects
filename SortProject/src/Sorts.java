import java.io.*;
import java.util.*;

public class Sorts extends SortMethods
{
    /*private static Integer[] copyArray(Integer[] array)
    {
        Integer [] copy=new Integer [array.length];
        copy=array;
        return copy;
    }*/
    public static void printArray(Integer[] a){
      if(a.length<=100){
          for(int i =0;i<a.length;i++) {System.out.println(a[i]);}
      }
    }
    public static void main(String[] args)
    {
        int enteredNum=0;
        int bStart, bStop, bTime, iStart, iStop, iTime, sStart, sStop, sTime, qStart, qStop, qTime, mStart, mStop,
                mTime;
        bStart=bStop=bTime=iStart=iStop=iTime=sStart=sStop=sTime=qStart=qStop=qTime=mStart=mStop=mTime =0;
        System.out.println("How many items would you wish to sort?");
        Scanner cin=new Scanner(System.in);
        enteredNum=cin.nextInt();
        Integer [] storedValues= new Integer [enteredNum];
        for (int i=0;i<enteredNum;i++)
        {
            int arrayNum=(int) (1 + (enteredNum * Math.random()));
            storedValues[i]=arrayNum;
        }
        Integer[] copy = new Integer[storedValues.length];
        for(int i=0; i<storedValues.length;i++){ copy[i] = storedValues[i];}
        printArray(storedValues);
        //bubble sort
        bStart=(int)System.currentTimeMillis();
        //System.out.println("Start " +bStart);
        bubble(storedValues);
        bStop=(int)System.currentTimeMillis();
        //System.out.println("Stop: " + bStop);
        printArray(storedValues);
        bTime=bStop-bStart;
        System.out.println("Bubble sort took " + bTime + " ms");
        for(int i=0; i<storedValues.length;i++){ storedValues[i] = copy[i];}
        //insertion sort
        iStart=(int)System.currentTimeMillis();
        //System.out.println("Start " +iStart);
        insertion(storedValues);
        iStop=(int)System.currentTimeMillis();
        //System.out.println("Stop " +iStop);
        printArray(storedValues);
        iTime=iStop-iStart;
        System.out.println("Insertion sort took " + iTime + " ms");
        for(int i=0; i<storedValues.length;i++){ storedValues[i] = copy[i];}
        //selection sort
        sStart=(int)System.currentTimeMillis();
       // System.out.println("Start " +sStart);
        selection(storedValues);
        sStop=(int)System.currentTimeMillis();
        //System.out.println("Stop " +sStop);
        printArray(storedValues);
        sTime=sStop-sStart;
        System.out.println("Selection sort took " + sTime + " ms");
        for(int i=0; i<storedValues.length;i++){ storedValues[i] = copy[i];}
        //quick sort
        qStart=(int)System.currentTimeMillis();
        //System.out.println("Start " +qStart);
        quick(storedValues);
        qStop=(int)System.currentTimeMillis();
        //System.out.println("Stop " +qStop);
        printArray(storedValues);
        qTime=qStop-qStart;
        System.out.println("Quick sort took " + qTime + " ms");
        for(int i=0; i<storedValues.length;i++){ storedValues[i] = copy[i];}
        //merge sort
        mStart=(int)System.currentTimeMillis();
       // System.out.println("Start " +mStart);
        merge(storedValues);
        mStop=(int)System.currentTimeMillis();
        //System.out.println("Start " +mStop);
        printArray(storedValues);
        mTime=mStop-mStart;
        System.out.println("Merge sort took " + mTime + " ms");
        for(int i=0; i<storedValues.length;i++){ storedValues[i] = copy[i];}
    }
}