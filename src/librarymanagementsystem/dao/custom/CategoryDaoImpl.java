/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.dao.custom;

import java.util.ArrayList;
import librarymanagementsystem.dao.CrudUtil;
import librarymanagementsystem.entity.CategoryEntity;

/**
 *
 * @author lavidulakshan
 */
public class CategoryDaoImpl implements CategoryDao {

    @Override
    public String save(CategoryEntity enity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO category (name,description) VALUES(?,?)",
                enity.getName(), enity.getDescription());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(CategoryEntity entity) throws Exception {
        return null;
    }

    @Override
    public String delete(String id) throws Exception {
        return null;
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
        return null;
    }

    @Override
    public String getCustomer(CategoryEntity t) throws Exception {
        return null;
    }

}
