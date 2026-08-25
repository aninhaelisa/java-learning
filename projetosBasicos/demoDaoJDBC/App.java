package projetosBasicos.demoDaoJDBC;

import java.util.Date;

import projetosBasicos.demoDaoJDBC.model.dao.DaoFactory;
import projetosBasicos.demoDaoJDBC.model.dao.SellerDao;
import projetosBasicos.demoDaoJDBC.model.entities.Department;
import projetosBasicos.demoDaoJDBC.model.entities.Seller;

public class App {
    public static void main(String[] args) {
        Department departmentOBJ = new Department(1, "Books");
        Seller sellerOBJ = new Seller(21, "Ana", "ana2026@email.com", new Date(), 3000.55, departmentOBJ );
        SellerDao sellerDao = DaoFactory.createSellerDao();
        
        System.out.println(sellerOBJ);
    }
}
