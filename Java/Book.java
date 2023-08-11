class Book {
    public String title;
    private String author;

    public Book(String title, String author) { // Конструктор
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    
    public String toString() {
        return title + " (" + author + ")";
    }
}