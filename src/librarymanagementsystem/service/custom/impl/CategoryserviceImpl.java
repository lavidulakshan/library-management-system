/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.service.custom.impl;

import librarymanagementsystem.dao.DaoFactory;
import librarymanagementsystem.dao.custom.CategoryDao;
import librarymanagementsystem.dao.custom.UserDao;
import librarymanagementsystem.dto.CategoryDto;
import librarymanagementsystem.dto.UserDto;
import librarymanagementsystem.entity.CategoryEntity;
import librarymanagementsystem.entity.UserEntity;
import librarymanagementsystem.service.custom.CategoryService;

/**
 *
 * @author lavidulakshan
 */
public class CategoryserviceImpl implements CategoryService {

    private CategoryDao CategoryDao = (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);

    @Override
    public String save(CategoryDto categoryDto) throws Exception {
        CategoryEntity entity = getCategoryEntity(categoryDto);

        return CategoryDao.save(entity);
    }

    private CategoryEntity getCategoryEntity(CategoryDto dto) {
        CategoryEntity categoryEntity = new CategoryEntity(dto.getName(), dto.getDescription());

        return categoryEntity;
    }

}
