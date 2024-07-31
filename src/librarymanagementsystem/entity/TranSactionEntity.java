/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.entity;

public class TranSactionEntity {

    private String memberId;
   
    private String bookId;
   
    private String today;
    
    private String dueDate;

    public TranSactionEntity() {
    }

    public TranSactionEntity(String memberId, String memberName, String bookId, String bookName, String today) {
        this.memberId = memberId;
       
        this.bookId = bookId;
        
        this.today = today;
    }
//
//    public TranSactionEntity(String memberId, String memberName, String bookId, String bookName, String today, String dueDate) {
//        this.memberId = memberId;
//        
//        this.bookId = bookId;
//       
//        this.today = today;
//        this.dueDate = dueDate;
//    }

    public TranSactionEntity(String memberId, String bookId, String today, String dueDate) {
        this.memberId = memberId;
        
        this.bookId = bookId;
       
        this.today = today;
        this.dueDate = dueDate;
        
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    

    

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

   

   

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    @Override
    public String toString() {
        return "TranSactionEntity{" + "memberId=" + memberId + ", bookId=" + bookId + ", today=" + today + ", dueDate=" + dueDate + '}';
    }

   

    
    

}
