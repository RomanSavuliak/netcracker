import java.util.Arrays;

/**
 * Created by roman on 06.11.16.
 */
public class Sort {

    public Sort() {
    }

    public void bubbleSortUp(int[] arr){
        int k = 0;
        boolean swapped = true;
        while (swapped){
            swapped = false;
            for (int i = 0; i < arr.length - 1 - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
            k++;
        }
    }

    public void bubbleSortDown(int[] arr){
        int length = arr.length;
        int k = 0;
        boolean swapped = true;
        while (swapped){
            swapped = false;
            for (int i = length-1; i > k; i--) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    swapped = true;
                }
            }
            k++;
        }
    }


    public void mergeSort(int[] arr){
        sort(arr, 0, arr.length - 1);
    }

    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }


    void merge(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void quickSort(int a[] , int p, int r){
        if (p < r){
            int q = partition(a, p, r);
            quickSort(a, p, q - 1);
            quickSort(a, q + 1, r);
        }
    }

    public int partition(int a[], int p, int r){
        int x = a[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (a[j] <= x){
                i = i + 1;
                swap(a, i, j);
            }
        }
        swap(a, r, i+1);
        return i + 1;
    }

    public void swap(int arr[], int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }


    public void arraySort(int[] arr){
        Arrays.sort(arr);
    }



}
