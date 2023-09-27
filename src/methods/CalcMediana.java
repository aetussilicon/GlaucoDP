package methods;

import java.util.Arrays;

public class CalcMediana {

    public int calcMediana(int[] array) {

        int mediana;

        Arrays.sort(array);
        if (array.length % 2 == 0) {
            mediana = (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
        } else {
            mediana = array[array.length / 2];
        }

        return mediana;
    }
}
