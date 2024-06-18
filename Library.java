import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Student> students;
    private ArrayList<Book> books;
    private int studentIDCounter;
    private int bookIDCounter;

    public Library() {
        students = new ArrayList<>();
        books = new ArrayList<>();
        studentIDCounter = 1;
        bookIDCounter = 1;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        students.add(new Student(studentIDCounter++, name, address, phoneNumber));
        System.out.println("Student added successfully!");
    }

    public void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID to update: ");
        int studentID = sc.nextInt();
        sc.nextLine();  // Consume newline
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                System.out.print("Enter new name: ");
                student.setName(sc.nextLine());
                System.out.print("Enter new address: ");
                student.setAddress(sc.nextLine());
                System.out.print("Enter new phone number: ");
                student.setPhoneNumber(sc.nextLine());
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void removeStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID to remove: ");
        int studentID = sc.nextInt();
        students.removeIf(student -> student.getStudentID() == studentID);
        System.out.println("Student removed successfully!");
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter publisher: ");
        String publisher = sc.nextLine();
        books.add(new Book(bookIDCounter++, title, author, publisher));
        System.out.println("Book added successfully!");
    }

    public void updateBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book ID to update: ");
        int bookID = sc.nextInt();
        sc.nextLine();  // Consume newline
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                System.out.print("Enter new title: ");
                book.setTitle(sc.nextLine());
                System.out.print("Enter new author: ");
                book.setAuthor(sc.nextLine());
                System.out.print("Enter new publisher: ");
                book.setPublisher(sc.nextLine());
                System.out.println("Book updated successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void removeBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book ID to remove: ");
        int bookID = sc.nextInt();
        books.removeIf(book -> book.getBookID() == bookID);
        System.out.println("Book removed successfully!");
    }

    public void issueBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book ID to issue: ");
        int bookID = sc.nextInt();
        System.out.print("Enter student ID to issue to: ");
        int studentID = sc.nextInt();
        for (Book book : books) {
            if (book.getBookID() == bookID && book.isAvailable()) {
                for (Student student : students) {
                    if (student.getStudentID() == studentID) {
                        student.setIssuedBookID(bookID);
                        book.setAvailable(false);
                        System.out.println("Book issued successfully!");
                        student.displayStudent();
                        return;
                    }
                }
                System.out.println("Student not found!");
                return;
            }
        }
        System.out.println("Book not available or not found!");
    }

    public void returnBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book ID to return: ");
        int bookID = sc.nextInt();
        for (Book book : books) {
            if (book.getBookID() == bookID && !book.isAvailable()) {
                for (Student student : students) {
                    if (student.getIssuedBookID() == bookID) {
                        student.setIssuedBookID(-1);
                        book.setAvailable(true);
                        System.out.println("Book returned successfully!");
                        return;
                    }
                }
            }
        }
        System.out.println("Book not issued or not found!");
    }

    public void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID to search: ");
        int studentID = sc.nextInt();
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                student.displayStudent();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void searchBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book ID to search: ");
        int bookID = sc.nextInt();
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                book.displayBook();
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
