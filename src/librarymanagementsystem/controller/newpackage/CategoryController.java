package librarymanagementsystem.controller.newpackage;

import librarymanagementsystem.dto.CategoryDto;
import librarymanagementsystem.service.ServiceFactory;
import librarymanagementsystem.service.custom.CategoryService;

public class CategoryController {

    private CategoryService categoryService = (CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);

    public String Save(CategoryDto categoryDto) throws Exception {

        return categoryService.save(categoryDto);

    }

}
