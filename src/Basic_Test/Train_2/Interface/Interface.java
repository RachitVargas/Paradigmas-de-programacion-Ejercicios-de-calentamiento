package Basic_Test.Train_2.Interface;

import java.io.PrintStream;
import java.util.Scanner;

public class Interface {

    private Scanner input;
    private PrintStream output;

    public Interface(){
        this.input = new Scanner(System.in);
        this.output = new PrintStream(System.out);
    }

    public String input_data() {
        output.println("Please, enter the data separated by commas: ");
        return input.nextLine();
    }

    public void print_dataInverted(int[] data_inverted) {
        for (int i = 0; i < data_inverted.length; i ++){
            output.print(data_inverted[i] + ",");
        }
    }
}
