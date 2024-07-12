
package librarymanagementsystem.dao;

import librarymanagementsystem.dao.custom.CategoryDaoImpl;
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
            default:
                return null;
        }
    }

    public enum DaoTypes {
        USER, CATEGORY, ORDER, ORDER_DETAIL
    }
    
}
