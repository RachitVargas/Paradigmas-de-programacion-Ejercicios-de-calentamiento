package Basic_Test.Train_1.main;

import Basic_Test.Train_1.Logic.Logic;
import Basic_Test.Train_1.interfece.Interface;

public class main {

    public static void main(String args[]){

        Logic logic = new Logic ();
        Interface anInterface = new Interface();

        int [] array = {1,9,5,7,3,4,7,3,1,7};
        float count = 0;
        count = logic.count_all(count, array);
        float average = logic.calculate_average(count, array.length);

        anInterface.print_message(average);
        logic.contar_valores(array, average);
    }
}
