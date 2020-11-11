/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Muzaffar
 */
public class SortedArray {

    private SortStrategy ss;
    private int choice;

    public void setSortStrategy(int choice) {
        this.choice = choice;
    }

    public void sort(int[] a) {
        if (choice == 1) {
            ss = new SelectionSort();
        } else if (choice == 2) {
            ss = new BubbleSort();
        } else {
            ss = new QuickSort();
        }
        ss.sort(a);
    }
}
