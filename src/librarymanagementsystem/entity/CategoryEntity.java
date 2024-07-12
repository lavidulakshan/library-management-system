
package librarymanagementsystem.entity;


public class CategoryEntity {
    
    private String categoryId;
    private String name;
    private String description;

    public CategoryEntity() {
    }

    public CategoryEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    

    public CategoryEntity(String categoryId, String name, String description) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
    }
    

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" + "categoryId=" + categoryId + ", name=" + name + ", description=" + description + '}';
    }
    
    
}
