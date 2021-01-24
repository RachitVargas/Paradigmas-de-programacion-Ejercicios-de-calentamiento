package Basic_Test.Train_4.main;
import Basic_Test.Train_4.Logic.Logic;

import java.util.ArrayList;

public class main {

    public static void main (String args[]){

        Logic logic = new Logic();

        String message = "aaabbozzzyttt";

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = logic.count_letter(arrayList, message);

        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) > 1){
                System.out.print(arrayList.get(i));
            }
            System.out.print(message.charAt(i));
            i = i + (arrayList.get(i)-1);
        }
    }
}
