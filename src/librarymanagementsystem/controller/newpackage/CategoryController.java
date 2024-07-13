package librarymanagementsystem.controller.newpackage;

import java.util.List;
import librarymanagementsystem.dto.CategoryDto;
import librarymanagementsystem.entity.CategoryEntity;
import librarymanagementsystem.service.ServiceFactory;
import librarymanagementsystem.service.custom.CategoryService;

public class CategoryController {

    private CategoryService categoryService = (CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);

    public String Save(CategoryDto categoryDto) throws Exception {

        return categoryService.save(categoryDto);

    }
    
    public List<CategoryEntity> getDropDownData()throws Exception{
        return categoryService.getCategoryData();
    }

}
