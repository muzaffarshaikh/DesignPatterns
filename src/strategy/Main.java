package strategy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Muzaffar
 */
public class Main {

    public static void main(String[] args) {
        SortedArray sa;

        Scanner sc = new Scanner(System.in);
        while(true) {
            
        
        System.out.println("||||    SELECT A SORING STRATEGY    ||||");
        System.out.println("");
        System.out.println("        1. Selection Sort");
        System.out.println("        2. Bubble Sort");
        System.out.println("        3. Quick Sort");
        int choice = sc.nextInt();

        sa = new SortedArray();

        sa.setSortStrategy(choice);

        int[] array = {4,1,1,2,4,6,8,4,5,2};
        sa.sort(array);
        System.out.println(Arrays.toString(array)+"\n");
        }
    }
}
