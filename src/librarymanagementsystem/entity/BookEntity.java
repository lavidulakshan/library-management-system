/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.entity;

public class BookEntity {

    private String title;
    private String author;
    private String Category;
    private String Date;

    public int CategoryId;

    public BookEntity(String title, String author, String Category, String Date) {
        this.title = title;
        this.author = author;
        this.Category = Category;
        this.Date = Date;
//        this.CategoryId = CategoryId;
    }

    public BookEntity() {
    }

//    public int getCategoryId() {
//        return CategoryId;
//    }
//
//    public void setCategoryId(int CategoryId) {
//        this.CategoryId = CategoryId;
//    }

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
        return "BookEntity{" + "title=" + title + ", author=" + author + ", Category=" + Category + ", Date=" + Date + ", CategoryId=" + CategoryId + '}';
    }

   

}
