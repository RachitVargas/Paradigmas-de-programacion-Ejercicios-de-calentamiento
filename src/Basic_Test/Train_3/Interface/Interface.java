package Basic_Test.Train_3.Interface;

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

    public void print_average(float avarege) {
        output.println("This is the averege: " + avarege);
    }

    public void print_median(float median) {
        output.println("This is the median: " + median);
    }

    public void print_mode(int mode) {
        output.println("This is the mode: " + mode);
    }
}
