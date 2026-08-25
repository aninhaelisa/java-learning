package projetosBasicos.demoDaoJDBC.model.dao;

import projetosBasicos.demoDaoJDBC.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
