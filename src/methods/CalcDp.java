package methods;

public class CalcDp {
    public double  calcDp(int[] array) {
        int[] seqDif = new int[array.length - 1];

        for (int i = 1;  i < array.length; i++){
            seqDif[i - 1] = array[i] - array[i - 1];
        }

        int[] seqPow = new int[seqDif.length];

        for (int i = 0; i < seqDif.length; i++) {
            seqPow[i] = (int) Math.pow(seqDif[i], 2);
        }

        double soma = 0;
        for (Integer n: seqPow) {
            soma += n.intValue();
        }

        double div = (soma / seqPow.length);
        double raiz = Math.sqrt(div);

        return raiz;
    }
}