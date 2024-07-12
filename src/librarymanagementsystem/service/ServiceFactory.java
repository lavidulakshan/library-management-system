package librarymanagementsystem.service;

import librarymanagementsystem.service.custom.impl.CategoryserviceImpl;
import librarymanagementsystem.service.custom.impl.UserServiceimpl;

public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    public ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }

        return serviceFactory;
    }

    public SuperService getService(ServiceType type) {
        switch (type) {
            case USER:
                return new UserServiceimpl();
                   case CATEGORY:
                return new CategoryserviceImpl();

            default:
                return null;
        }
    }

    public enum ServiceType {
        USER, CATEGORY, ORDER
    }

}
