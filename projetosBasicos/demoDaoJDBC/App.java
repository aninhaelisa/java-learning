package projetosBasicos.demoDaoJDBC;

import java.util.Date;

import projetosBasicos.demoDaoJDBC.model.dao.DaoFactory;
import projetosBasicos.demoDaoJDBC.model.dao.SellerDao;
import projetosBasicos.demoDaoJDBC.model.entities.Department;
import projetosBasicos.demoDaoJDBC.model.entities.Seller;

public class App {
    public static void main(String[] args) {
    
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
    }
}
