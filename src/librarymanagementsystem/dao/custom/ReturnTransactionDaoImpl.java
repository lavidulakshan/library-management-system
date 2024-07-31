/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.dao.custom;

import java.util.ArrayList;
import librarymanagementsystem.dao.CrudUtil;
import librarymanagementsystem.entity.ReturnTransactionEntity;

/**
 *
 * @author lavidulakshan
 */
public class ReturnTransactionDaoImpl implements ReturnTransactionDao{

    @Override
    public String save(ReturnTransactionEntity entity) throws Exception {
       boolean isSaved = CrudUtil.executeUpdate("INSERT INTO ReturnTransaction(transaction_id,return_date,fine_amount)VALUES(?,?,?)",
                entity.getTransId(), entity.getRdate(), entity.getFineAmount());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(ReturnTransactionEntity t) throws Exception {
 return null;
    }

    @Override
    public String delete(String id) throws Exception {
 return null;
    }

    @Override
    public ReturnTransactionEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ReturnTransactionEntity> getAll() throws Exception {
 return null;
    }

    @Override
    public String getCustomer(ReturnTransactionEntity t) throws Exception {
 return null;
    }
    
}
