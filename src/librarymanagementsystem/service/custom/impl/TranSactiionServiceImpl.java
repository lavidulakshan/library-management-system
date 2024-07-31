/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.service.custom.impl;

import java.util.ArrayList;

import java.sql.Connection;
import librarymanagementsystem.dao.DaoFactory;
import librarymanagementsystem.dao.custom.BookDao;
import librarymanagementsystem.dao.custom.TranSactionDao;
import librarymanagementsystem.dao.custom.UserDao;
import librarymanagementsystem.db.DBConnection;
import librarymanagementsystem.dto.TranSactionDto;
import librarymanagementsystem.dto.UserDto;
import librarymanagementsystem.dto.bookDto;
import librarymanagementsystem.entity.BookEntity;
import librarymanagementsystem.entity.TranSactionEntity;
import librarymanagementsystem.service.custom.TranSactionService;

/**
 *
 * @author lavidulakshan
 */
public class TranSactiionServiceImpl implements TranSactionService {

    private TranSactionDao tranSactionDao = (TranSactionDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.TRANSACTION);
    private BookDao BookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String save(TranSactionDto dto) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();

    try {
        connection.setAutoCommit(false);

        // Save transaction
        TranSactionEntity tranSactionEntity = getTransactionEntity(dto);
        String transactionResult = tranSactionDao.save(tranSactionEntity);
        if (!"Success".equals(transactionResult)) {
            connection.rollback();
            return "Fail: Transaction could not be saved";
        }

        // Update book quantity
        BookEntity bookEntity = BookDao.get(dto.getBookId());
        if (bookEntity == null) {
            connection.rollback();
            return "Fail: Book not found";
        }

        // Log the current book details
//        System.out.println(bookEntity.getCategoryId());
        System.out.println("Book retrieved: " + bookEntity);

       
        int currentQuantity;
        try {
            currentQuantity = Integer.parseInt(bookEntity.getQuantity());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            connection.rollback();
            return "Fail: Invalid book quantity format";
        }

        int updatedQuantity = currentQuantity - 1;
        if (updatedQuantity < 0) {
            connection.rollback();
            return "Fail: Insufficient book quantity";
        }

        // Convert updated quantity back to String
        bookEntity.setQuantity(Integer.toString(updatedQuantity));

        // Log the updated book details
        System.out.println("Updated book details: " + bookEntity);

        String bookUpdateResult = BookDao.update(bookEntity);
        if (!"Book updated successfully.".equals(bookUpdateResult)) {
            connection.rollback();
            return "Fail: Book quantity could not be updated";
        }

        connection.commit();
        return "Success";

    } catch (Exception e) {
        e.printStackTrace();
        connection.rollback();
        return "Fail: An error occurred";
    } finally {
        connection.setAutoCommit(true);
    }

    }

    @Override
    public String update(TranSactionDto dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserDto get(String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<UserDto> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getCustomer(TranSactionDto userDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private TranSactionEntity getTransactionEntity(TranSactionDto dto) {
        TranSactionEntity tranSactionEntity = new TranSactionEntity(dto.getBookId(), dto.getMemberId(), dto.getToday(), dto.getDueDate());

        System.out.println(dto.getBookId());

        System.out.println(dto.getMemberId());

        return tranSactionEntity;
    }

}
