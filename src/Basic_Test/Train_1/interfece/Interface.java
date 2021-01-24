package Basic_Test.Train_1.interfece;

import java.io.PrintStream;
import java.util.Scanner;

public class Interface {

    private Scanner input;
    private PrintStream output;

    public Interface (){

        this.input = new Scanner(System.in);
        this.output = new PrintStream(System.out);

    }

    public void print_message(float average) {
        output.println("This is the average: " + average);
    }

    public void print_less() {
        output.println("Values less than or equal to the average are: ");
    }

    public void print_greater() {
        output.println("Values greater to the average are: ");
    }
}
