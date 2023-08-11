public class LibraryApp {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Moshe Israely", 123456, "Computer Sciences", "01/01/1990", "+972 (50) 646-45-73");
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        reader1.takeBook(3);
        reader1.takeBook("Harry Potter and the Sorcerer's Stone", "To Kill a Mockingbird", "1984","Java"); // Конструктор 1
        reader1.takeBook(book1, book2, book3); // Конструктор 2

        reader1.returnBook("Harry Potter and the Sorcerer's Stone", "To Kill a Mockingbird", "1984");
        reader1.returnBook(3);
    }
}
