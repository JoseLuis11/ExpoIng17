package com.example.emiliano.traskilada.connectors;

import com.example.emiliano.traskilada.models.Appointment;
import com.example.emiliano.traskilada.models.Review;
import com.example.emiliano.traskilada.models.User;
import com.example.emiliano.traskilada.models.WorkPlace;
import com.example.emiliano.traskilada.networking.services.ServiceFactory;

/**
 * @author J. Pichardo
 */

public class ConnectorFactory {

    public static final ConnectorFactory INSTANCE = new ConnectorFactory();

    private final ServiceFactory serviceFactory;

    private ConnectorFactory() {
        serviceFactory = new ServiceFactory();
    }

    public BaseConnector<Appointment> getAppointmentConnector() {
        return new BaseConnector<>(serviceFactory.getAppointmentService());
    }

    public BaseConnector<Review> getReviewConnector() {
        return new BaseConnector<>(serviceFactory.getReviewService());
    }

    public BaseConnector<User> getUserConnector() {
        return new BaseConnector<>(serviceFactory.getUserService());
    }

    public BaseConnector<WorkPlace> getWorkPlaceConnector() {
        return new BaseConnector<>(serviceFactory.getWorkPlaceService());
    }

    public AccountConnector getAccountConnector() {
        return new AccountConnector(serviceFactory.getAccountService());
    }
}
