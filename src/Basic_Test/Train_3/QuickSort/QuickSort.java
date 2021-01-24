package Basic_Test.Train_3.QuickSort;

public class QuickSort {


    public int[] Quick_sort(int[] numbers) {

        int begin = 0;
        int end = numbers.length-1;

        return quickSort(numbers,begin,end);

    }

    private int[] quickSort(int[] numbers, int begin, int end) {

        if (begin < end) {
            int partitionIndex = partition(numbers, begin, end);

            quickSort(numbers, begin, partitionIndex - 1);
            quickSort(numbers, partitionIndex + 1, end);
        }


        return numbers;
    }

    private int partition(int[] numbers, int begin, int end) {
        int pivot = numbers[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (numbers[j] <= pivot) {
                i++;

                int swapTemp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = swapTemp;
            }
        }

        int swapTemp = numbers[i + 1];
        numbers[i + 1] = numbers[end];
        numbers[end] = swapTemp;

        return i + 1;
    }
}