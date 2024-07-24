/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagementsystem.service.custom;

import java.util.ArrayList;
import librarymanagementsystem.dto.MemberDto;
import librarymanagementsystem.dto.UserDto;
import librarymanagementsystem.service.SuperService;

/**
 *
 * @author lavidulakshan
 */
public interface MemberService extends SuperService{
    
        
    public String save(MemberDto memberDto) throws Exception;

    public String update(MemberDto memberDto) throws Exception;

    public String delete(MemberDto memberDto) throws Exception;

    public UserDto get(MemberDto memberDto) throws Exception;

    public ArrayList<MemberDto> getAll() throws Exception;
    
}
