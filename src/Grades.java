import java.util.ArrayList;

public class Grades {

    public static ArrayList<Integer> getFailingGrades(int[] grades) {//metoda care primeste o kista de nr intregi si returneaza un ArrayList cu notele insuficiente
        ArrayList<Integer> failingGrades = new ArrayList<>();//creez o lista care ca contina nr < 40
        for (int grade : grades) {
            if (grade < 40) {
                failingGrades.add(grade);
            }
        }
        return failingGrades;
    }

    public static double calculateAverage(int[] grades) {//primesc o lista de nr intregi si returnez media lor
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // 3. Metodă pentru rotunjirea notelor
    public static int[] roundGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];//array cu aceeasi lungime ca si grades
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade >= 38 && (5 - (grade % 5)) < 3) {
                roundedGrades[i] = grade + (5 - (grade % 5));
            } else {
                roundedGrades[i] = grade;
            }
        }
        return roundedGrades;
    }

    // 4. Metodă pentru obținerea notei maxime rotunjite
    public static int getMaxRoundedGrade(int[] grades) {
        int[] roundedGrades = roundGrades(grades);
        int maxGrade = roundedGrades[0];
        for (int grade : roundedGrades) {
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }
        return maxGrade;
    }

    public static void main(String[] args) {
        int[] grades = {29, 37, 38, 41, 84, 67};

        //afisez notele insuficiente
        ArrayList<Integer> failingGrades = getFailingGrades(grades);
        System.out.println("Nota insuficienta: " + failingGrades);

        //afișez meda notelor
        double average = calculateAverage(grades);
        System.out.printf("Media notelor: %.2f\n", average);

        //afișez notele rotunjite
        int[] roundedGrades = roundGrades(grades);
        System.out.print("Note rotunjite: ");
        for (int grade : roundedGrades) {
            System.out.print(grade + " ");
        }
        System.out.println();

        //afișez cea mai mare nota rotunjita
        int maxRoundedGrade = getMaxRoundedGrade(grades);
        System.out.println("Maxima notă rotunjita: " + maxRoundedGrade);
    }
}
