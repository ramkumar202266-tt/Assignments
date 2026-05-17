package week2.day1;

public class LibraryManagement {
public static void main(String[] args) {
    Library lib=new Library();
    String books= lib.addBook("The Metamorphosis");
    lib.issueBook();
    System.out.println(books);
}
}
