/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.dao.custom;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import librarymanagementsystem.dao.CrudUtil;
import librarymanagementsystem.dto.CategoryDto;
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
        ResultSet rs = CrudUtil.executeQuery("select category_id,name,description from Category");
        ArrayList<CategoryEntity> list = new ArrayList<>();
        while (rs.next()) {
            CategoryEntity categoryEntity = new CategoryEntity();
            categoryEntity.setDescription(rs.getString("description"));
            categoryEntity.setCategoryId(rs.getInt("category_id"));
            categoryEntity.setName(rs.getString("name"));

            list.add(categoryEntity);

        }

        return list;
    }

   

   

    @Override
    public String getCustomer(CategoryEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

}
