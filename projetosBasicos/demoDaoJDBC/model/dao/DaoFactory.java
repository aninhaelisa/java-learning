package projetosBasicos.demoDaoJDBC.model.dao;

import projetosBasicos.demoDaoJDBC.model.dao.impl.DepartmentDaoJDBC;
import projetosBasicos.demoDaoJDBC.model.dao.impl.SellerDaoJDBC;
import projetosBasicos.demoDaoJDBC.db.DB;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
