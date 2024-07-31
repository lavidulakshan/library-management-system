package librarymanagementsystem.dto;

import java.util.List;

public class bookDto {
    private String bookId;

    private String title;
    private String author;
    private String Category;
    
    private String categoryId;
    
    private String quantity;

//    private List<bookDto> bookDtos;

    public bookDto() {

    }

    public bookDto(String bookId, String title, String author, String Category, String categoryId, String quantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.Category = Category;
        this.categoryId = categoryId;
        this.quantity = quantity;
    }
    
    

    public bookDto(String bookId, String title, String author, String Category, String quantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.Category = Category;
        this.quantity = quantity;
    }
    
    

//    public bookDto(String title, String author, String Category, String Date, List<bookDto> bookDtos) {
//        this.title = title;
//        this.author = author;
//        this.Category = Category;
//        this.Date = Date;
//        this.bookDtos = bookDtos;
//    }

    public bookDto(String title, String author, String Category, String quantity) {
        this.title = title;
        this.author = author;
        this.Category = Category;
        
        this.quantity = quantity;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    
    

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
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

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    @Override
    public String toString() {
        return "bookDto{" + "bookId=" + bookId + ", title=" + title + ", author=" + author + ", Category=" + Category + ", quantity=" + quantity + '}';
    }

    public String getcategoryId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    


}
