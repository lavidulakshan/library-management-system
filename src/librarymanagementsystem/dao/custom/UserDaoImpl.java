package librarymanagementsystem.dao.custom;

import java.util.ArrayList;
import librarymanagementsystem.dao.custom.UserDao;
import librarymanagementsystem.entity.UserEntity;
import librarymanagementsystem.dao.CrudUtil;

public class UserDaoImpl implements UserDao {

    @Override
    public String save(UserEntity entity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO user VALUES(?,?)",
                entity.getUsername(), entity.getPassword());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(UserEntity t) throws Exception {
        return null;
    }

    @Override
    public String delete(String id) throws Exception {
        return null;
    }

    @Override
    public UserEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<UserEntity> getAll() throws Exception {
        return null;
    }

}
