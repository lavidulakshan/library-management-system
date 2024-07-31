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
import librarymanagementsystem.entity.UserEntity;
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
    public String delete(String id) throws Exception {

        return memberDao.delete(id);
    }

    @Override
    public UserDto get(MemberDto memberDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
        ArrayList<MemberDto> memberDtos = new ArrayList<>();
        ArrayList<MemberEntity> memberEntitys = memberDao.getAll();
        for (MemberEntity memberEntity : memberEntitys) {
            MemberDto dto = getMemberDto(memberEntity);
            memberDtos.add(dto);

        }
        return memberDtos;

    }

    public MemberEntity getMemberEntity(MemberDto memberDto) {

        MemberEntity memberEntity = new MemberEntity(memberDto.getName(), memberDto.getAddress(), memberDto.getPhone(), memberDto.getEmail());

        return memberEntity;

    }

    private MemberDto getMemberDto(MemberEntity memberEntity) {
//        MemberDto memberDto = new MemberDto(memberEntity.getName(), memberEntity.getAddress(), memberEntity.getPhone(), memberEntity.getPhone());

        MemberDto memberDto = new MemberDto(memberEntity.getName(), memberEntity.getAddress(), memberEntity.getPhone(), memberEntity.getPhone(), memberEntity.getMemberID());

//        System.out.println(memberEntity.getName());
        return memberDto;
    }

}
