import java.util.Scanner;

public class IT26101826Lab8Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        int i = 0;

        while (i < 8) {

            System.out.print("Enter Student ID for Student "
                    + (i + 1) + ": ");

            int id = input.nextInt();

            if (id > 0) {
                studentsArray[i] = id;
                i++;
            } else {
                System.out.println(
                    "Error: Please Enter ONLY Positive Numbers"
                );
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (i = 0; i < 8; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }
    }
}