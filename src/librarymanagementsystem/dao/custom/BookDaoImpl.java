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

/**
 *
 * @author lavidulakshan
 */
public class BookDaoImpl implements BookDao {

    private boolean isCategoryIdExists(int categoryId) {
        try {
            ResultSet rs = CrudUtil.executeQuery("SELECT COUNT(*) FROM category WHERE category_id = ?", categoryId);
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String save(BookEntity entity) throws Exception {
        int categoryId;
        try {
            categoryId = Integer.parseInt(entity.getCategory()); // Convert String to int
        } catch (NumberFormatException e) {
            return "Fail: Invalid category_id format";
        }

        if (!isCategoryIdExists(categoryId)) {
            return "Fail: Invalid category_id";
        }

        boolean isSaved = CrudUtil.executeUpdate(
                "INSERT INTO book (title, author, published_year, category_id) VALUES(?, ?, ?, ?)",
                entity.getTitle(), entity.getAuthor(), entity.getDate(), categoryId);
        return isSaved ? "Success" : "Fail";

    }

    @Override
    public String update(BookEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BookEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getCustomer(BookEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
