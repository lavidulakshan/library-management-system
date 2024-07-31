/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.dao.custom;

import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
import java.util.ArrayList;
import librarymanagementsystem.dao.CrudUtil;
import librarymanagementsystem.entity.BookEntity;
import librarymanagementsystem.entity.UserEntity;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author lavidulakshan
 */
public class BookDaoImpl implements BookDao {

    int categoryId;

    private boolean isCategoryIdExists(int categoryId) {
        try {
            ResultSet rs = CrudUtil.executeQuery("SELECT category_id FROM category WHERE category_id = ?", categoryId);

            // Check if the result set contains any rows
            return rs.next(); // If there's a row, the categoryId exists

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String save(BookEntity entity) throws Exception {

        if (entity.getCategoryId() == null || entity.getCategoryId().isEmpty()) {
        return "Fail: Invalid category_id";
    }

    try {
        categoryId = Integer.parseInt(entity.getCategoryId());
    } catch (NumberFormatException e) {
        e.printStackTrace();
        return "Fail: Invalid category_id format";
    }

    if (!isCategoryIdExists(categoryId)) {
        return "Fail: Invalid category_id";
    }

    boolean isSaved = CrudUtil.executeUpdate(
            "INSERT INTO book (title, author, category_id, quantity) VALUES(?, ?, ?, ?)",
            entity.getTitle(), entity.getAuthor(), categoryId, entity.getQuantity());
    return isSaved ? "Success" : "Fail";

    }

    @Override
    public String update(BookEntity t) throws Exception {
        try {
            if (!isCategoryIdExists(Integer.parseInt(t.getCategoryId()))) {
                return "Category ID does not exist.";
            }

            // Log the update query details
            System.out.println("Updating book: " + t);

            boolean isUpdated = CrudUtil.executeUpdate("UPDATE book SET author = ?, category_id = ?, quantity = ? WHERE title = ?",
                    t.getAuthor(),
                    t.getCategoryId(),
                    t.getQuantity(),
                    t.getTitle());

            if (isUpdated) {
                return "Book updated successfully.";
            } else {
                return "Book update failed.";
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public String delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BookEntity get(String id) throws Exception {
//        System.out.println("bookId :" +id);

        BookEntity bookEntity = null;
        try {
            ResultSet rs = CrudUtil.executeQuery("SELECT * FROM book WHERE book_id=?", id);

            if (rs.next()) {
                bookEntity = new BookEntity(
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("category_id"),
                        rs.getString("quantity")
                );
            }
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception or handle it appropriately
        }
        return bookEntity;
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
        ArrayList<BookEntity> bookEntitys = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM book");
        while (rst.next()) {
            BookEntity bookEntity = new BookEntity(rst.getString("book_id"), rst.getString("title"), rst.getString("author"),rst.getString("category_id") ,rst.getString("quantity"));
            bookEntitys.add(bookEntity);
            System.out.println(bookEntitys);
        }

        return bookEntitys;
    }

    @Override
    public String getCustomer(BookEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
