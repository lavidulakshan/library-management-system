/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.service.custom.impl;

import java.util.ArrayList;
import librarymanagementsystem.dao.DaoFactory;
import librarymanagementsystem.dao.MemberDao;
import librarymanagementsystem.dto.MemberDto;
import librarymanagementsystem.dto.UserDto;
import librarymanagementsystem.entity.MemberEntity;
import librarymanagementsystem.service.custom.MemberService;

/**
 *
 * @author lavidulakshan
 */
public class MemberServiceImpl implements MemberService {

    private MemberDao memberDao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER);

    @Override
    public String save(MemberDto memberDto) throws Exception {

        MemberEntity memberEntity = getMemberEntity(memberDto);

        return memberDao.save(memberEntity);
    }

    @Override
    public String update(MemberDto memberDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(MemberDto memberDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserDto get(MemberDto memberDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public MemberEntity getMemberEntity(MemberDto memberDto) {

        MemberEntity memberEntity = new MemberEntity(memberDto.getName(), memberDto.getAddress(), memberDto.getPhone(), memberDto.getEmail());

        return memberEntity;

    }

}
