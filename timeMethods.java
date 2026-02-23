// Code is stored as 13template.java
import java.text.*;



public class timeMethods{
    public static int N = 6;
    public static void Main(String []args){

        DecimalFormat twoD = new DecimalFormat("0.00");
        DecimalFormat fourD = new DecimalFormat("0.0000");
        DecimalFormat fiveD = new DecimalFormat("0.00000");

        long start, finish;
        double runTime = 0, runTime2 = 0, time;
        double totalTime = 0.0;
        int n = N;
        int repetition, repetitions = 30;
        Hashtable<Integer,String>array=new Hashtable<Integer,String>();
        int [] array=new int[32654];

        runTime = 0;
        for(repetition = 0; repetition < repetitions; repetition++) {
            start = System.currentTimeMillis();

            // call the procedures to time here:
            int index=linearsearch(array,n);
            if (index!=-1){
                System.out.println("key found at element : "+index);
            }
            binarysearch (array,n);
            // Figure out how to alter this guideline here,

            finish = System.currentTimeMillis();

            time = (double)(finish - start);
            runTime += time;
            runTime2 += (time*time); }

        double aveRuntime = runTime/repetitions;
        double stdDeviation = Math.sqrt(runTime2 - repetitions*aveRuntime*aveRuntime)/(repetitions-1);

        System.out.printf("\n\n\fStatistics\n");
        System.out.println("________________________________________________");
        System.out.println("Total time   =           " + runTime/1000 + "s.");
        System.out.println("Total time\u00b2  =           " + runTime2);
        System.out.println("Average time =           " + fiveD.format(aveRuntime/1000)
                + "s. " + '\u00B1' + " " + fourD.format(stdDeviation) + "ms.");
        System.out.println("Standard deviation =     " + fourD.format(stdDeviation));
        System.out.println("n            =           " + n);
        System.out.println("Average time / run =     " + fiveD.format(aveRuntime/n*1000)
                + '\u00B5' + "s. ");

        System.out.println("Repetitions  =             " + repetitions);
        System.out.println("________________________________________________");
        System.out.println();
        System.out.println(); }	}

static void oneofyourMethods(int n, int linearsearch,
                             int binarysearch ) {

                             }
 public static int linearsearch(int n,int []array){
    for(int i=1;i<array.length;i++){
        if(array[i]==n){

            return i;
        }
    }
    return-1;
 }
 private static int binarysearch(int n,int[]array){
    int low=0;
    int high= array.length-1;
     int middle=(high+low)/2;

    while(low<=high){
        if(array[middle]>low){
            int low_middle=middle+low/2;
        }
        else if(array[middle]<high){
            int high_middle=middle+1;
            int middle=middle+1;

        }
    }
    return -1;
 }
// The declarations and body of your method / s
// The final statement of this code.} }