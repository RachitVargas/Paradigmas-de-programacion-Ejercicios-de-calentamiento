package Basic_Test.Train_2.Logic;

public class Logic {

    public int[] inverted(String[] data) {

        int aux [] = new int[data.length];
        int j = 0;
        for (int i = data.length; i != 0; i--){

            aux[j] = Integer.parseInt(data[i-1]);
            j++;
        }
        return aux;
    }
}
