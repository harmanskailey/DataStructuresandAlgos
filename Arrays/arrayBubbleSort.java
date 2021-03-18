package Arrays;

/*Write JAVA program that will input 10 integer values 
and display either in ascending or descending order. 
Note: Arrays.sort() is not allowed.*/

public class arrayBubbleSort {

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;   
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] input = {5,3,7,6,8,1,2,4,9};
        int[] sorted = sortArray(input);

        for(int i = 0;i<sorted.length;i++)
            System.out.print(sorted[i] + " ");
    }
}
