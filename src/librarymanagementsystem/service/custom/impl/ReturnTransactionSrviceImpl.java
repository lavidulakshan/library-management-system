/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.service.custom.impl;

import java.util.ArrayList;
import librarymanagementsystem.dao.DaoFactory;
import librarymanagementsystem.dao.custom.BookDao;
import librarymanagementsystem.dao.custom.ReturnTransactionDao;
import librarymanagementsystem.dao.custom.UserDao;
import librarymanagementsystem.db.DBConnection;
import librarymanagementsystem.dto.ReturnTransactionDto;
import librarymanagementsystem.entity.BookEntity;
import librarymanagementsystem.entity.ReturnTransactionEntity;
import librarymanagementsystem.service.custom.ReturnTransactionService;
import java.sql.Connection;

/**
 *
 * @author lavidulakshan
 */
public class ReturnTransactionSrviceImpl implements ReturnTransactionService {

    private ReturnTransactionDao returnTransactionDao = (ReturnTransactionDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RETURNTRANSACTION);
    
     private BookDao BookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String save(ReturnTransactionDto dto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();

    try {
        connection.setAutoCommit(false);

        // Save return transaction
        System.out.println("Saving return transaction...");
        ReturnTransactionEntity entity = getReturnTransactionEntity(dto);
        String transactionResult = returnTransactionDao.save(entity);
        if (!"Success".equals(transactionResult)) {
            System.out.println("Failed to save return transaction.");
            connection.rollback();
            return "Fail: Return transaction could not be saved";
        }
        System.out.println("Return transaction saved successfully.");

        // Update book quantity
        System.out.println("Retrieving book with ID: " + dto.getTransId());
        BookEntity bookEntity = BookDao.get(String.valueOf(dto.getTransId()));
        if (bookEntity == null) {
            System.out.println("Book not found.");
            connection.rollback();
            return "Fail: Book not found";
        }

        // Log the current book details
        System.out.println("Book retrieved: " + bookEntity);

        int currentQuantity;
        try {
            currentQuantity = Integer.parseInt(bookEntity.getQuantity());
        } catch (NumberFormatException e) {
            System.out.println("Invalid book quantity format.");
            e.printStackTrace();
            connection.rollback();
            return "Fail: Invalid book quantity format";
        }

        int updatedQuantity = currentQuantity + 1;

        // Convert updated quantity back to String
        bookEntity.setQuantity(Integer.toString(updatedQuantity));

        // Log the updated book details
        System.out.println("Updated book details: " + bookEntity);

        String bookUpdateResult = BookDao.update(bookEntity);
        if (!"Book updated successfully.".equals(bookUpdateResult)) {
            System.out.println("Failed to update book quantity.");
            connection.rollback();
            return "Fail: Book quantity could not be updated";
        }

        System.out.println("Book quantity updated successfully.");
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
    public String update(ReturnTransactionDto dto) throws Exception {

        return null;
    }

    @Override
    public String delete(String code) throws Exception {

        return null;
    }

    @Override
    public ReturnTransactionDto get(String code) throws Exception {

        return null;
    }

    @Override
    public ArrayList<ReturnTransactionDto> getAll() throws Exception {

        return null;
    }

    public ReturnTransactionEntity getReturnTransactionEntity(ReturnTransactionDto dto) {

        ReturnTransactionEntity returnTransactionEntity = new ReturnTransactionEntity(dto.getTransId(), dto.getRdate(), dto.getFineAmount());
        return returnTransactionEntity;

    }

}
