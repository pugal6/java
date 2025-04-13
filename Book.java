import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    private static ArrayList<Book> books = new ArrayList<>();

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }


    public static void addBook(Book book) {
        books.add(book);
    }
    public static void removeBook(Book book) {
        books.remove(book);
    }
    public static ArrayList<Book> bookCollection() {
        return books;
    }

    public static ArrayList<Book> searchByTitle(String name) {
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : books) {
            if(book.getTitle().toLowerCase().contains(name)) {
                result.add(book);
            }
        }
        return result;
    }

}

class ExecuteBook {
    public static void main(String[] args) {
        Book book1 = new Book("Ponniyin Selvan", "Kalki", "sk02-4");
        Book book2 = new Book("The Monk who sold his ferrari","Robin Sharma", "ghgr323");
        Book book3 = new Book("Modern monk","Noone", "dkjf402");

        Book.addBook(book1);
        Book.addBook(book2);
        Book.addBook(book3);
        ArrayList<Book> bookscollection = Book.bookCollection();

        for(Book book : bookscollection) {
            System.out.println("Book name: " + book.getTitle() + "\n" + "ISBN: "+ book.getISBN() + "\n" + "Written By: " + book.getAuthor());
            System.out.println();
        }
        String bookname = "monk";
        ArrayList<Book> foundBooks = Book.searchByTitle(bookname);
        System.out.println("Book containing " + bookname + ":");
        for(Book book : foundBooks) {
            System.out.println("Book name: " + book.getTitle() + "\n" + "ISBN: "+ book.getISBN() + "\n" + "Written By: " + book.getAuthor());
            System.out.println();
        }
    }
}
