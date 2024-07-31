/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.dao.custom;

import java.util.ArrayList;
import librarymanagementsystem.dao.CrudUtil;
import librarymanagementsystem.entity.TranSactionEntity;
import java.sql.ResultSet;

/**
 *
 * @author lavidulakshan
 */
public class TransactionDaoImpl implements TranSactionDao {

    private boolean isBookExist(int bookId) {
        try {
            System.out.println("Checking if book exists with ID: " + bookId);
            ResultSet rs = CrudUtil.executeQuery("SELECT * FROM book WHERE book_id = ?", bookId);
            if (rs.next()) {
                System.out.println("Book exists with ID: " + bookId);
                return true;
            } else {
                System.out.println("No book found with ID: " + bookId);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean isMemberExist(int memberId) {
        try {
            ResultSet rs = CrudUtil.executeQuery("SELECT * FROM member WHERE member_id = ?", memberId);
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String save(TranSactionEntity entity) throws Exception {
        int bookId;
        int memberId;

        try {
            bookId = Integer.parseInt(entity.getMemberId());
//            System.out.println(bookId);
        } catch (NumberFormatException e) {
            return "Fail: Invalid book_id format";
        }

        try {
            memberId = Integer.parseInt(entity.getBookId());
            System.out.println(memberId);
        } catch (NumberFormatException e) {
            return "Fail: Invalid member_id format";
        }

        if (!isBookExist(bookId)) {  // Corrected method call
            return "Fail: Invalid book_id";
        }

        if (!isMemberExist(memberId)) {  // This is correct
            return "Fail: Invalid member_id";
        }

        boolean isSaved = CrudUtil.executeUpdate(
                "INSERT INTO BorrowingTransaction (book_id, member_id, borrow_date, due_date) VALUES (?, ?, ?, ?)",
                bookId, memberId, entity.getToday(), entity.getDueDate()
        );
        return isSaved ? "Success" : "Fail";

    }

  

    @Override
    public String delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TranSactionEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TranSactionEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getCustomer(TranSactionEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(TranSactionEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
