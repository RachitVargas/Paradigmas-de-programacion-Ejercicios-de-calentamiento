package Basic_Test.Train_4.Logic;

import java.util.ArrayList;

public class Logic {

    public ArrayList count_letter(ArrayList<Integer> arrayList, String message){

        char characters [] = message.toCharArray();

        for (int i = 0; i < characters.length; i++){
            int count = count(message, characters[i]);
            arrayList.add(count);
        }

        return arrayList;
    }

    private int count(String message, char character) {

        int position = 0;
        int count = 0;
        position = message.indexOf(character);

        while(position != -1){
            count++;
            position = message.indexOf(character, position +1);
        }
        return count;
    }
}
