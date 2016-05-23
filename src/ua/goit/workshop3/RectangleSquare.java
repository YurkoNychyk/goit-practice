package ua.goit.workshop3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by home on 12.05.2016.
 */
public class RectangleSquare {
    public static void main(String[] args) {
        int[] x = new int[]{0, 10, 20, 20, 30, };
        int[] h = new int[]{10, 20, 30, 10, 20, };
        int[] w = new int[]{60, 40, 10, 20, 10, };
        System.out.println(measure(x,h,w));
    }
    public static int measure(int[] x, int[] h, int[] w) {
        int totalArea = 0;

        int[] xRight = new int[x.length];

        int xMin = 0;
        int xMax = 0;
        int yMin = 0;
        int yMax = 0;

        for (int i =0; i<x.length;i++){
            xMin = Math.min(x[i],xMin);
            yMin = 10;
            yMax = Math.max(yMax,h[i]);
            xRight[i] = x[i] + w[i];
            xMax =Math.max(xRight[i],xMax);
        }

        float[][] point = new float[xMax * yMax/100][2];
        int i=0;
        while (i<point.length){
             for (int abscissa=xMin; abscissa<xMax;abscissa+=10){
                 for (int ordinate=yMin;ordinate<=yMax;ordinate+=10){
                     point[i][1]= ordinate - 0.5f;
                     point[i][0] = abscissa + 0.5f;
                     System.out.println("i:" + i + " x:" + point[i][0] + " y:" + point[i][1]);

                     i++;
                 }
             }
        }

        int[] area = new int[point.length];

       for (int p = 0; p<point.length;p++){
           for (int index = 0; index<x.length; index++){
               if (belongsToSquare(point[p][0], point[p][1],x[index],xRight[index],h[index])){
                   area[p] = 1;
               }
               else if (area[p] != 1) {
                   area[p] = 0;
               }
           }
           if (area[p] == 1) {
               totalArea++;
           }
       }


        return totalArea*100;
    }
    private static boolean belongsToSquare (float pointX,float pointY, int squareLeft,int squareRight, int squaretop){
        boolean result = pointX < squareRight && pointX > squareLeft && pointY < squaretop;
        return result;
    }

}
