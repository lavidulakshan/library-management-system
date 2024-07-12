
package librarymanagementsystem.service.custom;

import librarymanagementsystem.dto.CategoryDto;
import librarymanagementsystem.service.SuperService;


public interface CategoryService extends SuperService{
    
    public String save(CategoryDto categoryDto)throws Exception;
    
}
