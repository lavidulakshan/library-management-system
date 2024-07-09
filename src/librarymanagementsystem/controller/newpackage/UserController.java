package librarymanagementsystem.controller.newpackage;

import librarymanagementsystem.dto.UserDto;
import librarymanagementsystem.service.ServiceFactory;
import librarymanagementsystem.service.custom.UserServise;

public class UserController {

    private final UserServise userServise = (UserServise) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);

    public String save(UserDto userDto) throws Exception {

        return userServise.save(userDto);

    }

}
