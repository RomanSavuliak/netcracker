import java.util.Scanner;


public class StartView {
    RandomArray randomArray = new RandomArray();
    Sort sort = new Sort();
    Scanner sc = new Scanner(System.in);

    void run() {
        while (true) {
            System.out.println("select 1 to create array");
            System.out.println("select 2 to sort array");

            switch (sc.nextInt()) {
                case 1:
                    randomArrayView();
                    break;
                case 2:
                    sortView();
                    break;
                default:
                    break;
            }
            System.out.println("Main Menu :          1");
            System.out.println("Exit from program:   2");
            if (sc.nextInt() != 1) {
                break;
            }

        }
    }

    public void randomArrayView(){

        int[] arr;
        while (true) {
            System.out.println("select 1 for sorted array");
            System.out.println("select 2 for sorted array with random last element");
            System.out.println("select 3 for reversed sorted array");
            System.out.println("select 4 for random array");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter length of array");
                    arr = randomArray.sortedArray(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter length of array");
                    arr = randomArray.sortedArrayX(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter length of array");
                    arr = randomArray.sortedArrayReversed(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Enter length of array");
                    arr = randomArray.randomArray(sc.nextInt());
                    break;
                default:
                    System.out.println("Default random array");
                    System.out.println("Enter length of array");
                    arr = randomArray.randomArray(sc.nextInt());
                    break;
            }

            for (int i = 0; i < arr.length; i++) {

                System.out.println(arr[i]);
            }
            System.out.println("Continue :    1");
            System.out.println("No:           2");

            if (sc.nextInt() != 1){
                break;
            }
        }
    }

    public void sortView(){
        int[] arr;
        System.out.println("Enter length of array");
        arr = randomArray.randomArray(sc.nextInt());
        while (true) {
            System.out.println("select 1 for Bubble Sort");
            System.out.println("select 2 for Bubble Sort down");
            System.out.println("select 3 for Quick Sort down");
            System.out.println("select 4 for Merge Sort");
            System.out.println("select 5 for Arrays.sort");

            switch (sc.nextInt()) {
                case 1:
                    sort.bubbleSortUp(arr);
                    break;
                case 2:
                    sort.bubbleSortDown(arr);
                    break;
                case 3:
                    sort.quickSort(arr, 0, arr.length - 1);
                    break;
                case 4:
                    sort.mergeSort(arr);
                    break;
                case 5:
                    sort.arraySort(arr);
                    break;
                default:
                    sort.arraySort(arr);
                    break;
            }

            for (int i = 0; i < arr.length; i++) {

                System.out.println(arr[i]);
            }
            System.out.println("Continue :    1");
            System.out.println("No:           2");

            if (sc.nextInt() != 1){
                break;
            }
        }

    }
}



