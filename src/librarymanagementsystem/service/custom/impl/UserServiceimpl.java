/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.service.custom.impl;

import java.util.ArrayList;
import librarymanagementsystem.dao.DaoFactory;
import librarymanagementsystem.dao.custom.UserDao;
import librarymanagementsystem.dto.UserDto;
import librarymanagementsystem.entity.UserEntity;
import librarymanagementsystem.service.custom.UserServise;

/**
 *
 * @author lavidulakshan
 */
public class UserServiceimpl implements UserServise {

    private UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public String save(UserDto dto) throws Exception {
        UserEntity entity = getItemEntity(dto);
//        System.out.println(entity.getContactNumber());
//         System.out.println(entity.getUsername());
//          System.out.println(entity.getPassword());
        return userDao.save(entity);
    }

    @Override
    public String update(UserDto dto) throws Exception {
        return null;
    }

    @Override
    public String delete(String code) throws Exception {
       return userDao.delete(code);
    }

    @Override
    public UserDto get(String code) throws Exception {
        return null;
    }

    @Override
    public ArrayList<UserDto> getAll() throws Exception {
         ArrayList<UserDto> userDtos = new ArrayList<>();
        ArrayList<UserEntity> userEntitys = userDao.getAll();
        for (UserEntity userEntity : userEntitys) {
             UserDto dto = getItemDto(userEntity);
            userDtos.add(dto);
            
        }
        return userDtos;
       
    }

    private UserEntity getItemEntity(UserDto dto) {
        UserEntity entity = new UserEntity(dto.getUsername(), dto.getPassword(), dto.getContactNumber());
        
        
        return entity;
    }

    @Override
    public String getCustomer(UserDto userDto) throws Exception {
       UserEntity entity = getItemEntity(userDto);
        return userDao.getCustomer(entity); 
        
    }
    
      private UserDto getItemDto(UserEntity entity) {
        UserDto itemDto = new UserDto(entity.getUsername(),
                entity.getPassword(),
                entity.getContactNumber());
//          System.out.println(entity.getUsername());
//          System.out.println(entity.getPassword());
        return itemDto;
    }

}
