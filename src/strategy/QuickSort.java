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
public class QuickSort extends SortStrategy { 
    
    int ArrayPartition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++;
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        return i+1; 
    } 
    public void QuickSortFunction(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = ArrayPartition(arr, low, high); 
            QuickSortFunction(arr, low, pi-1); 
            QuickSortFunction(arr, pi+1, high); 
        } 
    }  

    @Override
    public void sort(int[] a) {
      QuickSortFunction(a, 0, a.length-1);
    }
}
