/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagementsystem.service.custom;

import java.util.ArrayList;
import librarymanagementsystem.dto.ReturnTransactionDto;
import librarymanagementsystem.dto.bookDto;
import librarymanagementsystem.service.SuperService;

/**
 *
 * @author lavidulakshan
 */
public interface ReturnTransactionService extends SuperService{
    
     public String save(ReturnTransactionDto dto) throws Exception;

    public String update(ReturnTransactionDto dto) throws Exception;

    public String delete(String code) throws Exception;

    public ReturnTransactionDto get(String code) throws Exception;

    public ArrayList<ReturnTransactionDto> getAll() throws Exception;
   
    
}
