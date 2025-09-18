package PracticeProgram;

import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;
    boolean isBorrowed;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = false;
    }

    void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author +
                ", ISBN: " + ISBN + ", Borrowed: " + isBorrowed;
    }
}

class Member {
    String name;
    int id;

    Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Member Name: " + name + ", ID: " + id;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void addMember(Member m) {
        members.add(m);
    }

    void showBooks() {
        System.out.println("--- Books in Library ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    void showMembers() {
        System.out.println("--- Library Members ---");
        for (Member m : members) {
            System.out.println(m);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding Books
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book b2 = new Book("1984", "George Orwell", "978-0451524935");
        library.addBook(b1);
        library.addBook(b2);

        // Adding Members
        Member m1 = new Member("Alice", 101);
        Member m2 = new Member("Bob", 102);
        library.addMember(m1);
        library.addMember(m2);

        // Show Library Status
        library.showBooks();
        library.showMembers();

        // Borrow and Return Books
        b2.borrow();
        b2.borrow(); // Try again to show restriction
        b2.returnBook();
    }
}