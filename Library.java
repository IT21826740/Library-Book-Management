import java.util.ArrayList;
import java.util.Scanner;

class Library {
    private ArrayList<Book> books;
    private Scanner scanner;

    public Library() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        int ISBN = scanner.nextInt();
        System.out.print("Enter Published Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        books.add(new Book(title, author, ISBN, year));
    }

    public void displayBooks() {
        for (Book book : books) {
            book.displayBook();
            System.out.println();
        }
    }

    public void searchBook() {
        System.out.print("Enter Title to search: ");
        String title = scanner.nextLine();
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                book.displayBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

