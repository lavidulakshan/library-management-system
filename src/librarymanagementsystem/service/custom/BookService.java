/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagementsystem.service.custom;

import java.util.ArrayList;
import librarymanagementsystem.dto.UserDto;
import librarymanagementsystem.dto.bookDto;
import librarymanagementsystem.service.SuperService;

/**
 *
 * @author lavidulakshan
 */
public interface BookService extends SuperService{
     public String save(bookDto dto) throws Exception;

    public String update(bookDto dto) throws Exception;

    public String delete(String code) throws Exception;

    public bookDto get(String code) throws Exception;

    public ArrayList<bookDto> getAll() throws Exception;
    
    public String getCustomer(bookDto bookDto)throws Exception;
    
    
    
}
