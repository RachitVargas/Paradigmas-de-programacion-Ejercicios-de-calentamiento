package Basic_Test.Train_2.main;
import Basic_Test.Train_2.Interface.Interface;
import Basic_Test.Train_2.Logic.Logic;

public class main {

    public static void main (String args[]){

        Logic logic = new Logic();
        Interface anInterface = new Interface();

        String entrada = anInterface.input_data();
        String data [] = entrada.split(",");

        int data_inverted [] = logic.inverted(data);
        anInterface.print_dataInverted(data_inverted);

    }
}
