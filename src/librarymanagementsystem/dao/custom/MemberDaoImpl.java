/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.dao.custom;

import java.sql.ResultSet;
import java.util.ArrayList;
import librarymanagementsystem.dao.CrudUtil;
import librarymanagementsystem.dao.MemberDao;
import librarymanagementsystem.entity.MemberEntity;
import librarymanagementsystem.entity.UserEntity;

/**
 *
 * @author lavidulakshan
 */
public class MemberDaoImpl implements MemberDao {

    @Override
    public String save(MemberEntity entity) throws Exception {

        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO member (name,address,phone,email) VALUES(?,?,?,?)",
                entity.getName(), entity.getAddress(), entity.getPhone(), entity.getAddress());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(MemberEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MemberEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        ArrayList<MemberEntity> memberEntitys = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM member");
        while (rst.next()) {
            MemberEntity memberEntity = new MemberEntity(rst.getString("name"), rst.getString("address"), rst.getString("phone"), rst.getString("email"));
            memberEntitys.add(memberEntity);
        }

        return memberEntitys;

    }

    @Override
    public String getCustomer(MemberEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
