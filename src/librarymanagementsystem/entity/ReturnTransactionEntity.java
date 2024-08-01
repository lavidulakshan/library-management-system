/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.entity;

/**
 *
 * @author lavidulakshan
 */
public class ReturnTransactionEntity {
    
     private int transId;
    private String rdate;
    private double fineAmount;
    
    private int  bookId;

    public ReturnTransactionEntity() {
    }

    public ReturnTransactionEntity(int transId, String rdate, double fineAmount, int bookId) {
        this.transId = transId;
        this.rdate = rdate;
        this.fineAmount = fineAmount;
        this.bookId = bookId;
    }
    

    public ReturnTransactionEntity(int transId, String rdate, double fineAmount) {
        this.transId = transId;
        this.rdate = rdate;
        this.fineAmount = fineAmount;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    @Override
    public String toString() {
        return "ReturnTransactionEntity{" + "transId=" + transId + ", rdate=" + rdate + ", fineAmount=" + fineAmount + ", bookId=" + bookId + '}';
    }

    
    
    
}
