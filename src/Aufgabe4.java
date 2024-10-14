public class Aufgabe4 {
    public static int billigste_T(int[] tastatur){
        int min= tastatur[0];
        for(int kost:tastatur){
            if(min>kost)
                min=kost;
        }
        return min;
    }

    public static int teuerste_G(int[] tastaturen, int[] USBs) {
        int max = tastaturen[0];

        for (int kost : tastaturen) {
            if (kost > max) {
                max = kost;
            }
        }

        for (int kost : USBs) {
            if (kost > max) {
                max = kost;
            }
        }

        return max;
    }

    public static int markus_buget(int[] USBs, int budget) {
        int affordable = -1;

        for (int kost : USBs) {
            if (kost <= budget && kost > affordable) {
                affordable = kost;
            }
        }

        return affordable;
    }

    public static int tastatur_usb_max(int budget, int[] tastaturen, int[] USBs) {
        int maximum = -1;

        for (int tastaturKost : tastaturen) {
            for (int usbKost : USBs) {
                int total = tastaturKost + usbKost;
                if (total <= budget && total > maximum) {
                    maximum = total;
                }
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        int[] tastaturen = {40, 35, 70, 15, 45};
        int[] USBs = {20, 15, 40, 15};
        int budget = 60;

        int cheapestKeyboard = billigste_T(tastaturen);
        System.out.println("Cea mai ieftina tastatura: " + cheapestKeyboard);

        int mostExpensiveItem = teuerste_G(tastaturen, USBs);
        System.out.println("Cel mai scump obiect: " + mostExpensiveItem);

        int mostExpensiveUSB = markus_buget(USBs, budget);
        System.out.println("Cel mai scump USB pe care Markus il poate cumpara: " + mostExpensiveUSB);

        int maxSpent = tastatur_usb_max(budget, tastaturen, USBs);
        System.out.println("Suma maxima cheltuita de Markus: " + maxSpent);
    }





}
