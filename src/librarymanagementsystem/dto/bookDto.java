
package librarymanagementsystem.dto;

public class bookDto {
    
    private String bookId;
    private String title;
    private String author;

    public bookDto() {
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "bookDto{" + "bookId=" + bookId + ", title=" + title + ", author=" + author + '}';
    }
    
    
    
    
    
}
