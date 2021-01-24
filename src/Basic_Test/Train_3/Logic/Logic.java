package Basic_Test.Train_3.Logic;
import Basic_Test.Train_3.QuickSort.QuickSort;
import java.util.HashMap;

public class Logic {

    public int[] convert_to_numbers(String[] data) {

        int aux [] = new int [data.length];

        for (int i = 0; i < data.length; i++){
            aux[i] = Integer.parseInt(data[i]);
        }

        return aux;
    }

    public float calculate_average(int[] numbers) {

        float sum = 0;
        for (int i = 0; i < numbers.length; i++){

            sum += numbers[i];
        }
        float average = sum/ numbers.length;
        return average;
    }

    public float calculate_median(int[] numbers) {

        QuickSort quickSort = new QuickSort();
        int sort_numbers [] = quickSort.Quick_sort(numbers);
        float median = median(sort_numbers);

        return median;
    }


    public float median(int[] sort_numbers) {

        float median = 0;
        int size = sort_numbers.length;

        if(size % 2 == 0){

            float aux = sort_numbers[size/2] + sort_numbers[(size/2)-1];
            median = (aux/2);

        }else{

            int aux = (size-1)/2;
            median = sort_numbers[aux];
        }

        return median;

    }

    public int calculate_mode(int[] numbers) {

        //CODIGO PARA CALCULAR LA MEDIA TOMADO DE: ** Stackoverflow **
        //SE IMPLEMENTO ALGUNOS CAMBIOS EN EL CODIGO

        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        int max  = 1;
        int mode = 0;

        for(int i = 0; i < numbers.length; i++) {

            if (hashMap.get(numbers[i]) != null) {

                int count = hashMap.get(numbers[i]);
                count++;
                hashMap.put(numbers[i], count);

                if(count > max) {
                    max  = count;
                    mode = numbers[i];
                }
            }

            else
                hashMap.put(numbers[i],1);
        }
        return mode;
    }
}

