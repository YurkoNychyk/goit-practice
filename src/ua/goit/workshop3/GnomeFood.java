package ua.goit.workshop3;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by home on 23.05.2016.
 */
public class GnomeFood {
    public static void main(String[] args) {
        int[] array1 = new int[]{ 5, 7, 6, 9, 4 };
        int[] array2 = new int[]{ 8, 5, 6, 2, 3};
        int[] result = find(array1,array2);
        for (int i=0; i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
    public static int[] find(int[] gnames, int[] portions) {
        TreeMap<Integer,Integer> gnomesMap = new TreeMap();
        TreeMap<Integer,Integer> portionsMap = new TreeMap();
        int[]result = new int[portions.length];
        for (int i=0; i<portions.length;i++){
            gnomesMap.put(gnames[i],i);
            portionsMap.put(portions[i],i);
        }
        int tallestGnomeIndex;
        int greatestPortionIndex;
        int index = 0;
        while (index< result.length){
            tallestGnomeIndex = gnomesMap.pollFirstEntry().getValue().intValue();
            greatestPortionIndex = portionsMap.pollFirstEntry().getValue().intValue();
            result[tallestGnomeIndex] = greatestPortionIndex;
         index++;
        }


        return result;
    }

}
