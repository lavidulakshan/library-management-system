
package librarymanagementsystem.dao;

import librarymanagementsystem.dao.custom.BookDaoImpl;
import librarymanagementsystem.dao.custom.CategoryDaoImpl;
import librarymanagementsystem.dao.custom.MemberDaoImpl;
import librarymanagementsystem.dao.custom.TransactionDaoImpl;
import librarymanagementsystem.dao.custom.UserDaoImpl;

public class DaoFactory {
    
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case USER:
                return new UserDaoImpl();
                  case CATEGORY:
                return new CategoryDaoImpl();
                
                 case BOOK:
                return new BookDaoImpl();
                 case MEMBER:
                return new MemberDaoImpl();
                
                 case TRANSACTION:
                return new TransactionDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes {
        USER, CATEGORY, BOOK, MEMBER ,TRANSACTION
    }
    
}
