/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagementsystem.service.custom;

import java.util.ArrayList;
import librarymanagementsystem.dto.UserDto;
import librarymanagementsystem.service.SuperService;

/**
 *
 * @author lavidulakshan
 */
public interface UserServise  extends SuperService{
    
    public String save(UserDto dto) throws Exception;

    public String update(UserDto dto) throws Exception;

    public String delete(String code) throws Exception;

    public UserDto get(String code) throws Exception;

    public ArrayList<UserDto> getAll() throws Exception;
    
    
}
