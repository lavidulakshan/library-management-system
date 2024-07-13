
package librarymanagementsystem.service.custom;

import java.util.List;
import librarymanagementsystem.dto.CategoryDto;
import librarymanagementsystem.entity.CategoryEntity;
import librarymanagementsystem.service.SuperService;


public interface CategoryService extends SuperService{
    
    public String save(CategoryDto categoryDto)throws Exception;
    
    public List<CategoryEntity> getCategoryData()throws Exception;
    
}
