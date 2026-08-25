package projetosBasicos.demoDaoJDBC.model.dao;

import projetosBasicos.demoDaoJDBC.model.dao.impl.SellerDaoJDBC;
import projetosBasicos.demoDaoJDBC.db.DB;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
