/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.controller.newpackage;

import librarymanagementsystem.dto.CategoryDto;
import librarymanagementsystem.dto.MemberDto;
import librarymanagementsystem.service.ServiceFactory;
import librarymanagementsystem.service.custom.MemberService;

public class MemberController {

    private final MemberService memberService = (MemberService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);

    public String Save(MemberDto memberDto) throws Exception {

        return memberService.save(memberDto);

    }

}
