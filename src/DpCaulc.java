import java.util.Arrays;
import java.util.Scanner;

public class DpCaulc {
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

        int somaSeq = 0;
        for (Integer n: seq) {
            somaSeq += n.intValue();
        }

        int media = somaSeq / seq.length;

        int mediana;

        int[] seqDif = new int[seq.length - 1];

        for (int i = 1;  i < seq.length; i++){
            seqDif[i - 1] = seq[i] - seq[i - 1];
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
        String result = String.format("%.2f", raiz);

        Arrays.sort(seq);
        if (seq.length % 2 == 0) {
            mediana = (seq[seq.length / 2] + seq[seq.length / 2 - 1]) / 2;
        } else {
            mediana = seq[seq.length / 2];
        }

        System.out.println("Sequência digitada: " + Arrays.toString(seq) +
                "\n" + "Media: " + media +
                "\n" + "Mediana: " + mediana +
                "\n" + "Resultado: " + raiz);
    }
}