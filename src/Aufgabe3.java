import java.util.Arrays;

public class Aufgabe3 {
    public static int[] suma(int[] num1, int[] num2){
        int n = num1.length;
        int[] result = new int[n + 1];//res poate avea un elem in plus
        int aux = 0; //aux pt transport
        for (int i = n - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + aux;
            result[i + 1] = sum % 10; // uc a sumei
            aux = sum / 10; // transportul
        }
        result[0] = aux; // transportul final daca e cazul

        // indepartez 0 de la inceput
        if (result[0] == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        }
        return result;
    }

    public static int[] diferenta(int[] num1, int[] num2) {
        int n = num1.length;
        int[] result = new int[n];

        int aux2 = 0; // imprumut
        for (int i = n - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - aux2;
            if (diff < 0) {
                diff += 10; // imprumut
                aux2 = 1;
            } else {
                aux2 = 0;
            }
            result[i] = diff;
        }

        return result;
    }

    public static int[] inmultire(int[] num, int cif) {
        int n = num.length;
        int[] result = new int[n + 1]; // rezultatul poate avea un ele in plus

        int aux3 = 0; // transport
        for (int i = n - 1; i >= 0; i--) {
            int product = num[i] * cif + aux3;
            result[i + 1] = product % 10; //uc a produsului
            aux3 = product / 10; // transportul
        }
        result[0] = aux3; // transportul final daca e cazul

        // indepartez 0 de la început
        if (result[0] == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        }
        return result;
    }

    public static int[] impartire(int[] num, int cif) {
        int n = num.length;
        int[] result = new int[n];
        int aux4 = 0; // transport

        for (int i = 0; i < n; i++) {
            int current = aux4 * 10 + num[i];
            result[i] = current / cif; // imparțire
            aux4 = current % cif; // ramasita
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] sum = suma(num1, num2);
        System.out.println("Suma: " + Arrays.toString(sum));

        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};

        int[] diff = diferenta(num3, num4);
        System.out.println("Diferența: " + Arrays.toString(diff));

        int[] num5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int digitForMultiplication = 2;

        int[] product = inmultire(num5, digitForMultiplication);
        System.out.println("Produsul: " + Arrays.toString(product));

        int[] num6 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int digitForDivision = 2;

        int[] quotient = impartire(num6, digitForDivision);
        System.out.println("Imparțirea: " + Arrays.toString(quotient));
    }
}

