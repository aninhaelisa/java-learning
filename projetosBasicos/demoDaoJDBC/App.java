package projetosBasicos.demoDaoJDBC;

import java.util.Date;
import java.util.List;

import projetosBasicos.demoDaoJDBC.model.dao.DaoFactory;
import projetosBasicos.demoDaoJDBC.model.dao.SellerDao;
import projetosBasicos.demoDaoJDBC.model.entities.Department;
import projetosBasicos.demoDaoJDBC.model.entities.Seller;

public class App {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("--".repeat(10) + "TESTE 1 SELLER FINDBYID: " + "--".repeat(10));
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();
        System.out.println("--".repeat(10) + "TESTE 2 SELLER FINDBYDEPARTMENT: " + "--".repeat(10));
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("--".repeat(10) + "TESTE 3 SELLER FINDBYALL: " + "--".repeat(10));
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("--".repeat(10) + "TESTE 4 SELLER sellerInsert: " + "--".repeat(10));
        Seller newSeller = new Seller(null, "Grag", "grag@email.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("INSERIDO! New Id: " + newSeller.getId());

        System.out.println();
        System.out.println("--".repeat(10) + "TESTE 5 SELLER upadate: " + "--".repeat(10));
        seller = sellerDao.findById(1);
        seller.setName("Marta Waine");
        sellerDao.update(seller);
        System.out.println("Update Completo! ");
    }
}
