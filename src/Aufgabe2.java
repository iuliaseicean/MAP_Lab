public class Aufgabe2 {
    public static int nrmax(int[] numbers){
        int maxim = numbers[0];
        for (int number:numbers){
            if (number>maxim)
                maxim=number;
        }
        return maxim;
    }

    public static int nrmin(int[] numbers){
        int minim=numbers[0];
        for (int number:numbers) {
            if (number < minim)
                minim = number;
        }
        return minim;
    }

    public static int maxsum(int[] numbers){
        int m=nrmax(numbers);
        int sum=0;
        for (int number:numbers){
            sum+=number;
        }
        return sum-m;
    }

    public static int minsum(int[] numbers){
        int n=nrmin(numbers);
        int sum=0;
        for (int number:numbers){
            sum+=number;
        }
        return sum-n;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 8, 3, 10, 17};

        int max = nrmax(numbers);
        System.out.println("Numarul maxim: " + max);

        int min = nrmin(numbers);
        System.out.println("Numarul minim: " + min);

        int maxSum = maxsum(numbers);
        System.out.println("Suma maxima din n - 1 numere: " + maxSum);

        int minSum = minsum(numbers);
        System.out.println("Suma minima din n - 1 numere: " + minSum);
    }

}
