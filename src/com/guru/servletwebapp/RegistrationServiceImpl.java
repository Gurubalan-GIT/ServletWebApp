package com.guru.servletwebapp;
interface RegistrationService{
    public int doRegistration(Bean bean);
}

public class RegistrationServiceImpl implements RegistrationService {
    @Override
    public int doRegistration(Bean bean) {
        DAOImpl daoImpl =new DAOImpl();
        return daoImpl.doRegistration(bean);
    }
}
