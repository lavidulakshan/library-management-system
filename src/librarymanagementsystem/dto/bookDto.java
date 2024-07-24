package librarymanagementsystem.dto;

import java.util.List;

public class bookDto {

    private String title;
    private String author;
    private String Category;
    private String Date;
    private String quantity;

//    private List<bookDto> bookDtos;

    public bookDto() {

    }

//    public bookDto(String title, String author, String Category, String Date, List<bookDto> bookDtos) {
//        this.title = title;
//        this.author = author;
//        this.Category = Category;
//        this.Date = Date;
//        this.bookDtos = bookDtos;
//    }

    public bookDto(String title, String author, String Category, String Date, String quantity) {
        this.title = title;
        this.author = author;
        this.Category = Category;
        this.Date = Date;
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
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

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "bookDto{" + "title=" + title + ", author=" + author + ", Category=" + Category + ", Date=" + Date + ", quantity=" + quantity + '}';
    }


}
