import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {6, 4, 5, 3, 2, 1};
        bubbleSortAnArrayToMePlease(array);

    }

    /**
     * Bubble sort is a simple sorting algorithm that works by repeatedly swapping adjacent elements if they are in wrong order.
     * By wrong order, we mean that the element on the left is greater than the element on the right.
     * @param array
     */
    private static void bubbleSortAnArrayToMePlease(int[] array){

        System.out.println("Before the sort: "+Arrays.toString(array));

        for (int i = 0, size = array.length; i < size-1; i++) {
            for(int j=0; j < size-2; j++ ){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("After the sort: " + Arrays.toString(array));

    }

}
