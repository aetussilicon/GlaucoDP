package methods;

public class CalcMedia {

    public int calcMedia (int[] arrays) {
        int somaSeq =0;

        for (Integer n: arrays) {
            somaSeq +=n.intValue();
        }

        int media = somaSeq / arrays.length;

        return media;
    }

}
