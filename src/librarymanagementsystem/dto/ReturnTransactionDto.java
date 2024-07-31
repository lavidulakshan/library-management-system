/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.dto;

/**
 *
 * @author lavidulakshan
 */
public class ReturnTransactionDto {
    
     private int transId;
    private String rdate;
    private double fineAmount;

    public ReturnTransactionDto() {
    }

    public ReturnTransactionDto(int transId, String rdate, double fineAmount) {
        this.transId = transId;
        this.rdate = rdate;
        this.fineAmount = fineAmount;
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
        return "ReturnTransactionDto{" + "transId=" + transId + ", rdate=" + rdate + ", fineAmount=" + fineAmount + '}';
    }
    
    
    
}
