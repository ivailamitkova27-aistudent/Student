
import java.util.Scanner;

class Student {
    String name;
    int facNumber;
    double grade;
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vuvedete broi studenti:");
        int n = input.nextInt();
        input.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.println("Vuvedete ime:");
            students[i].name = input.nextLine();

            System.out.println("Vuvedete fakulteten nomer:");
            students[i].facNumber = input.nextInt();

            System.out.println("Vuvedete ocenka:");
            students[i].grade = input.nextDouble();
            input.nextLine();
        }

        System.out.println("Studenti izdarzhali izpita:");

        for (int i = 0; i < n; i++) {
            if (students[i].grade >= 3) {
                System.out.println(students[i].name);
                System.out.println(students[i].facNumber);
                System.out.println(students[i].grade);
            }
        }

        input.close();
    }
}
