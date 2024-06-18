import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("-------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Add Book");
            System.out.println("5. Update Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Issue Book");
            System.out.println("8. Return Book");
            System.out.println("9. Search Student");
            System.out.println("10. Search Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.addStudent();
                    break;
                case 2:
                    library.updateStudent();
                    break;
                case 3:
                    library.removeStudent();
                    break;
                case 4:
                    library.addBook();
                    break;
                case 5:
                    library.updateBook();
                    break;
                case 6:
                    library.removeBook();
                    break;
                case 7:
                    library.issueBook();
                    break;
                case 8:
                    library.returnBook();
                    break;
                case 9:
                    library.searchStudent();
                    break;
                case 10:
                    library.searchBook();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 0);
    }
}
