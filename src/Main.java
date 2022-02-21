import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int [] array = getIntegers(5);


        System.out.println("This is the sorted array from highest number to lowest: \r");
        int temp =0;
        for (int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;
                }
            }
            System.out.print(" "+array[i]+" ");
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }
}
