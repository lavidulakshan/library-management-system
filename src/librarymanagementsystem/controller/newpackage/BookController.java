/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.controller.newpackage;

import java.util.ArrayList;
import librarymanagementsystem.dto.UserDto;
import librarymanagementsystem.dto.bookDto;
import librarymanagementsystem.service.ServiceFactory;
import librarymanagementsystem.service.custom.BookService;
import librarymanagementsystem.service.custom.UserServise;

/**
 *
 * @author lavidulakshan
 */
public class BookController {

    private final BookService BookService = (BookService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK);

    public String save(bookDto bookDto) throws Exception {

        return BookService.save(bookDto);

    }
    
    public ArrayList<bookDto> getAll()throws Exception{
    
//    return null;
    return BookService.getAll();
    }
    
    
          public String updateBook(bookDto bDto) throws Exception {
                    return BookService.update(bDto);
          }

}
