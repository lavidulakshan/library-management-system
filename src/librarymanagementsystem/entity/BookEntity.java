/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.entity;

public class BookEntity {

    private String bookid;
    private String title;
    private String author;
    private String Category;
    public String CategoryId;
    private String quantity;

    public BookEntity(String title, String author, String categoryId, String quantity) {
       
        this.title = title;
        this.author = author;
        this.CategoryId = categoryId;
        this.quantity = quantity;
        
    }
 
    
    public BookEntity() {
    }

    public BookEntity(String bookid, String title, String author, String CategoryId, String quantity) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.CategoryId = CategoryId;
        this.quantity = quantity;
    }

    

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    

//    public BookEntity(String title, String author, String quantity) {
//        this.title = title;
//        this.author = author;
//        this.quantity = quantity;
//    }

   

//    public int getCategoryId() {
//        return CategoryId;
//    }
//
//    public void setCategoryId(int CategoryId) {
//        this.CategoryId = CategoryId;
//    }
    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
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

    @Override
    public String toString() {
        return "BookEntity{" + "bookid=" + bookid + ", title=" + title + ", author=" + author + ", Category=" + Category + ", CategoryId=" + CategoryId + ", quantity=" + quantity + '}';
    }
    
    
    
    

}
