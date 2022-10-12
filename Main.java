package Arrays;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myInt = getIntegers(5);
        for (int i = 0; i < myInt.length; i++) {
            System.out.println(myInt[i]);
        }
    }
    public static int[] getIntegers(int numbers){
        System.out.println("Enter " + numbers + " values \r");
        int[] values = new int[numbers];

        for(int i = 0; i<values.length; i++){
            values[i] = scan.nextInt();
        }
        return values;
    }
}
