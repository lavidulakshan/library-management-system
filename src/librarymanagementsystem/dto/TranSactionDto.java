package librarymanagementsystem.dto;

public class TranSactionDto {

    private String memberId;

    private String bookId;

    private String today;
    private String dueDate;

    public TranSactionDto() {
    }

    public TranSactionDto(String memberId, String memberName, String bookId, String bookName, String today) {
        this.memberId = memberId;

        this.bookId = bookId;

        this.today = today;
    }

    public TranSactionDto(String memberId, String bookID, String today, String dueDate) {
        this.memberId = memberId;
        this.bookId = bookID;
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
        return "TranSactionDto{" + "memberId=" + memberId + ", bookId=" + bookId + ", today=" + today + ", dueDate=" + dueDate + '}';
    }

}
