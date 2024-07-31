/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.controller.newpackage;

import librarymanagementsystem.dto.ReturnTransactionDto;
import librarymanagementsystem.service.ServiceFactory;
import librarymanagementsystem.service.custom.ReturnTransactionService;
import librarymanagementsystem.service.custom.UserServise;

/**
 *
 * @author lavidulakshan
 */
public class ReturnTransactionController {
        private final ReturnTransactionService returnTransactionService = (ReturnTransactionService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RETURNTRANSACTION);
        
        public String save(ReturnTransactionDto dto)throws Exception{
            
            return  returnTransactionService.save(dto);
        
        
        }

    
    
    
    
}
