import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Library library = new Library();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter 1 to add a book, 2 to display all books, 3 to search for a book, 4 to exit: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1){
                    library.addBook();
                }
                else if (choice==2){
                    library.displayBooks();
                }
                else if (choice==3){
                    library.searchBook();
                }
                else if (choice==4){
                    System.out.println("Good Bye !");
                }
                else{
                    System.out.println("Invalid choice, please try again.");
                }

            }
        }
    }
}