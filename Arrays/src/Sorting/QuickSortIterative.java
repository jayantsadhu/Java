package Sorting;


import java.util.Arrays;

public class QuickSortIterative{

     public static void main(String []args){
         
        int arr[] = {7,1,5,2,47,8,3,0,2,8,3,7,48,8};
        
        quickSort(arr);
        
        System.out.println(Arrays.toString(arr));
     }

static void quickSort(int arr[]){
        
        int stack[] = new int[arr.length];
        int top = -1;
        int lo = 0;
        int hi = arr.length-1;
        stack[++top] = lo;
        stack[++top] = hi;
        
        while(top>=0){
            hi = stack[top--];
            lo = stack[top--];
            int p = partition(arr,lo,hi);
            
            if(lo<p-1){
                stack[++top] = lo;
                stack[++top] = p-1;
            }
            if(hi>p+1){
                stack[++top] = p+1;
                stack[++top] = hi;
            }
        }   
    }
    static int partition(int arr[], int lo, int hi){
        int pivot = arr[hi];
        int j = lo;
        for(int i=lo ; i<hi ; i++){
            if(arr[i]>pivot){			// > Decreasing,  < Increasing
                swap(arr,i,j);
                j++;
            }
        }
        swap(arr,j,hi);
        return j;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
