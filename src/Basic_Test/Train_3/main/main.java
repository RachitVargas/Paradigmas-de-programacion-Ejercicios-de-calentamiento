package Basic_Test.Train_3.main;
import Basic_Test.Train_3.Interface.Interface;
import Basic_Test.Train_3.Logic.Logic;

public class main {

    public static void main (String args []){

        Interface anInterface = new Interface();
        Logic logic = new Logic();

        String entrada = anInterface.input_data();
        String[] data = entrada.split(",");

        int numbers [] = logic.convert_to_numbers(data);

        float avarege = logic.calculate_average(numbers);
        anInterface.print_average(avarege);

        float median = logic.calculate_median(numbers);
        anInterface.print_median(median);

        int mode = logic.calculate_mode(numbers);
        anInterface.print_mode(mode);

    }
}
