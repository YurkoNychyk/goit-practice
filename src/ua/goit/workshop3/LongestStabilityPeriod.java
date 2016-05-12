package ua.goit.workshop3;

/**
 * Created by home on 12.05.2016.
 */
public class LongestStabilityPeriod {
    public static void main(String[] args) {
        int[] array = new int[]{ 902, 902, 901, 902, 902, 903, 902, 902, 901, 902, 901, 901, 902, 903, };
        System.out.println("max streak: " + count(array));
    }
    public static int count(int[] gdp) {
        int counter = 1;
        int maxCounter = counter;
        int diff = 0;

        for (int start = 0; start <gdp.length-1; start++){

            System.out.print(gdp[start] + ",");
            int streakMax;
            int streakMin;

            if (gdp[start] > gdp[start+1] ) {
                streakMin = gdp[start+1];
                streakMax = gdp[start];
            }
            else
            {
                streakMin = gdp[start];
                streakMax = gdp[start+1];
            }

            for (int i=start+1; i < gdp.length; i++){

                if (gdp[i]<streakMin){
                    streakMin = gdp[i];
                }
                if (gdp[i]>streakMax){
                    streakMax = gdp[i];
                }

                if ( (streakMax-gdp[i] < 2) && (gdp[i] - streakMin < 2)) {
                    System.out.print(gdp[i] + ",");
                    counter++;
                }
                else {
                    break;
                }

            }
            System.out.print( "| " + counter);
            System.out.println();
            if (counter  > maxCounter){
                maxCounter = counter;

            }
            counter = 1;

        }
        return maxCounter;
    }
}
