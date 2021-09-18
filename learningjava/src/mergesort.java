import java.util.Scanner;

import static java.util.Arrays.sort;

public class mergesort {

    static void sorting(int[] arr, int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            sorting(arr,low,mid);
            sorting(arr, mid+1, high);
            merge(arr, low,mid,high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int s1 = mid - low +1;
        int s2 = high-mid;
        int left[] = new int[s1];
        int right[] = new int[s2];
        for(int i=0; i<s1;i++){
            left[i] = arr[low+i];
        }
      for(int j=0;j<s2;j++){
          right[j]=arr[mid+1+j];
      }
      int i=0, j=0 , k=low;

      while(i<s1 && j<s2){
           if(left[i] <= right[j]){
             arr[k] = left[i];
               i++;
           }
           else {
              arr[k] = right[j];
               j++;
           }
           k++;
      }
        while(i<s1){
            arr[k] =left[i];
            i++;
            k++;
        }
        while(j<s2){
            arr[k] =right[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {
        int arr[] = {3, 2, 3, 5, 11, 3};
        int low = 0;
        int high = arr.length - 1;
        System.out.println("Array before Sorting");
        for (int n = 0; n < arr.length; n++) {
            System.out.println(arr[n]);
        }

        sorting(arr, low, high);
        System.out.println("Array after Sorting");
        for (int n = 0; n < arr.length; n++) {
            System.out.println(arr[n]);
        }

    }
}
