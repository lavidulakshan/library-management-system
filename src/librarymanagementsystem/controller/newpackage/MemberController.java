/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.controller.newpackage;

import java.util.ArrayList;
import librarymanagementsystem.dto.CategoryDto;
import librarymanagementsystem.dto.MemberDto;
import librarymanagementsystem.dto.UserDto;
import librarymanagementsystem.service.ServiceFactory;
import librarymanagementsystem.service.custom.MemberService;

public class MemberController {

    private final MemberService memberService = (MemberService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);

    public String Save(MemberDto memberDto) throws Exception {

        return memberService.save(memberDto);

    }
    
    public ArrayList<MemberDto> getAll()throws Exception{
    
    
    return memberService.getAll();
    }
    
    public String delete(String id) throws Exception{
        
        return memberService.delete(id);
    
    }

}
