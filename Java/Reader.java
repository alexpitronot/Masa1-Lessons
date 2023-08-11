class Reader {
    private String fullName;
    private int ticketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int ticketNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " took " + count + " book(s)");
    }

    // Перегрузка - override
    // Конструктор 1
    public void takeBook(String... bookTitles) { // Получить переменное кол-во переменных
        System.out.print(fullName + " took book(s): ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if (i != bookTitles.length - 1) { // Решает проблему последней запятой
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    // Конструктор 1
    public void takeBook(Book... books) { // Получить переменное кол-во переменных
        System.out.print(fullName + " took book(s): ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle());
            // System.out.println(books[i].title);
            if (i != books.length - 1) { // Решает проблему последней запятой
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " returned book(s): ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if (i != bookTitles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(fullName + " returned " + count + " book(s).");
    }
}