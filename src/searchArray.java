import java.util.Scanner;

public class searchArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Name You Wanna Search For: ");
        String input = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(input)) {
                flag = true;
                System.out.println("Position of the student " + input + " in the list is: " + (i + 1));
            }
        }
        if (!flag) {
            System.out.println("Not found " + input + " in the list.");
        }
    }
}
