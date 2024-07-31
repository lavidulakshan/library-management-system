/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.controller.newpackage;

import librarymanagementsystem.dto.TranSactionDto;
import librarymanagementsystem.dto.UserDto;
import librarymanagementsystem.service.ServiceFactory;
import librarymanagementsystem.service.custom.TranSactionService;
import librarymanagementsystem.service.custom.UserServise;

/**
 *
 * @author lavidulakshan
 */
public class TranSactionController {

    private final TranSactionService tranSactionService = (TranSactionService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.TRANSACTION);

    public String save(TranSactionDto tranSactionDto) throws Exception {
//        System.out.println(tranSactionDto.getBookId());
//        System.out.println(tranSactionDto.getMemberId());

        return tranSactionService.save(tranSactionDto);
        

    }

}
