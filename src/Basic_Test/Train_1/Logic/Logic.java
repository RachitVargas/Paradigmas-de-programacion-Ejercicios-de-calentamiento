package Basic_Test.Train_1.Logic;

import Basic_Test.Train_1.interfece.Interface;

public class Logic {

    Interface anInterface;
    public Logic (){
        this.anInterface = new Interface();
    }

    public float count_all(float count, int[] array) {

        for(int i = 0; i < array.length; i++){
            count += array[i];
        }
        return count;
    }

    public float calculate_average(float count, int array) {

        float average = count / array;

        return average;
    }

    public void contar_valores(int [] array, float average){

        anInterface.print_less();
        for (int i = 0; i < array.length; i++){
            if (array[i] <= average){
                System.out.print(array[i] + ",");
            }
        }

        System.out.print("\n");

        anInterface.print_greater();
        for (int i = 0; i < array.length; i++){
            if (array[i] > average){
                System.out.print(array[i] + ",");
            }
        }
    }

}
