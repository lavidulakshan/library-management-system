/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.service.custom.impl;

import java.util.ArrayList;
import librarymanagementsystem.dao.DaoFactory;
import librarymanagementsystem.dao.custom.BookDao;
import librarymanagementsystem.dao.custom.CategoryDao;
import librarymanagementsystem.dto.CategoryDto;
import librarymanagementsystem.dto.UserDto;
import librarymanagementsystem.dto.bookDto;
import librarymanagementsystem.entity.BookEntity;
import librarymanagementsystem.entity.CategoryEntity;
import librarymanagementsystem.entity.UserEntity;
import librarymanagementsystem.service.custom.BookService;

/**
 *
 * @author lavidulakshan
 */
public class BokkServiceImpl implements BookService {

    private BookDao BookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String save(bookDto dto) throws Exception {
        BookEntity bookEntity = getBookEntity(dto);
        return BookDao.save(bookEntity);
    }

    @Override
    public String update(bookDto dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public bookDto get(String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<bookDto> getAll() throws Exception {
        ArrayList<bookDto> bookdtos = new ArrayList<>();
        ArrayList<BookEntity> BookEntitys = BookDao.getAll();
        for (BookEntity BookEntity1 : BookEntitys) {
              bookDto bDto = getBookDto(BookEntity1);
            
            bookdtos.add(bDto);
            
        }
        return bookdtos;
    }

    @Override
    public String getCustomer(bookDto bookDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private BookEntity getBookEntity(bookDto dto) {
        BookEntity bookEntity = new BookEntity(dto.getTitle(), dto.getAuthor(), dto.getCategory(), dto.getDate());

        return bookEntity;
    }
    
      private bookDto getBookDto(BookEntity entity) {
       bookDto bDto = new bookDto(entity.getTitle(), entity.getAuthor(), entity.getCategory(), entity.getDate());
//          System.out.println(entity.getUsername());
//          System.out.println(entity.getPassword());
        return bDto;
    }

}
