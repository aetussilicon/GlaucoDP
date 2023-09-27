import methods.CalcDp;
import methods.CalcMedia;
import methods.CalcMediana;

import java.util.Scanner;

public class Resultado {

    public static void main(String[] args) {
        String entrada;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a sequência de números: ");
        entrada = scan.nextLine();

        String[] numbers = entrada.split(",");

        int[] seq = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            seq[i] = Integer.parseInt(numbers[i]);
        }

        CalcMedia calcMa = new CalcMedia();
        CalcMediana calcMd = new CalcMediana();
        CalcDp calcDp = new CalcDp();

        int media = calcMa.calcMedia(seq);
        int mediana = calcMd.calcMediana(seq);
        double dp = calcDp.calcDp(seq);

        System.out.println(
                media + "\n" +
                mediana + "\n" +
                dp);
    }
}
