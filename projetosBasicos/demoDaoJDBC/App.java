package projetosBasicos.demoDaoJDBC;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import projetosBasicos.demoDaoJDBC.model.dao.DaoFactory;
import projetosBasicos.demoDaoJDBC.model.dao.DepartmentDao;
import projetosBasicos.demoDaoJDBC.model.dao.SellerDao;
import projetosBasicos.demoDaoJDBC.model.dao.impl.DepartmentDaoJDBC;
import projetosBasicos.demoDaoJDBC.model.entities.Department;
import projetosBasicos.demoDaoJDBC.model.entities.Seller;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * System.out.println("SELLERDAO TESTES! " + "--------".repeat(10));
         * SellerDao sellerDao = DaoFactory.createSellerDao();
         * System.out.println("--".repeat(10) + "TESTE 1 SELLER FINDBYID: " +
         * "--".repeat(10));
         * Seller seller = sellerDao.findById(3);
         * System.out.println(seller);
         * System.out.println();
         * System.out.println("--".repeat(10) + "TESTE 2 SELLER FINDBYDEPARTMENT: " +
         * "--".repeat(10));
         * Department department = new Department(2, null);
         * List<Seller> list = sellerDao.findByDepartment(department);
         * for (Seller obj : list) {
         * System.out.println(obj);
         * }
         * System.out.println();
         * System.out.println("--".repeat(10) + "TESTE 3 SELLER FINDBYALL: " +
         * "--".repeat(10));
         * list = sellerDao.findAll();
         * for (Seller obj : list) {
         * System.out.println(obj);
         * }
         * System.out.println();
         * System.out.println("--".repeat(10) + "TESTE 4 SELLER sellerInsert: " +
         * "--".repeat(10));
         * Seller newSeller = new Seller(null, "Grag", "grag@email.com", new Date(),
         * 4000.00, department);
         * sellerDao.insert(newSeller);
         * System.out.println("INSERIDO! New Id: " + newSeller.getId());
         * System.out.println();
         * System.out.println("--".repeat(10) + "TESTE 5 SELLER upadate: " +
         * "--".repeat(10));
         * seller = sellerDao.findById(1);
         * seller.setName("Marta Waine");
         * sellerDao.update(seller);
         * System.out.println("Update Completo! ");
         * System.out.println();
         * System.out.println("--".repeat(10) + "TESTE 6 SELLER DELETE: " +
         * "--".repeat(10));
         * System.out.print("ID DELETE: ");
         * int id = sc.nextInt();
         * sellerDao.deleteById(id);
         * System.out.println("DELETADO COM SUCESSO! " + id);
         */

        System.out.println();
        System.out.println("DEPARTMENTDAO TESTES! " + "--------".repeat(10));
        Department depInsert = new Department(null, "teste1");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println();
        System.out.println("DEPARTMENTDAO TESTES! " + "--------".repeat(10));

        System.out.println();
        System.out.println(
                "--".repeat(10) +
                " TESTE 1 - DEPARTMENT INSERT " +
                "--".repeat(10));


        departmentDao.insert(depInsert);

        System.out.println(
                "INSERIDO EM DEPARTMENT! " +
                "ID: " + depInsert.getId() +
                " NAME: " + depInsert.getName());
        System.out.println();
        System.out.println(
                "--".repeat(10) +
                " TESTE 2 - DEPARTMENT UPDATE " +
                "--".repeat(10));

        Department depUpdate = departmentDao.findById(depInsert.getId());

        if (depUpdate != null) {

            depUpdate.setName("testeUpdate");

            departmentDao.update(depUpdate);

            System.out.println("UPDATE COMPLETO!");
            System.out.println(depUpdate);

        } else {

            System.out.println("Department não encontrado!");

        }

        System.out.println();
        System.out.println(
                "--".repeat(10) +
                " TESTE 3 - DEPARTMENT FIND BY ID " +
                "--".repeat(10));

        System.out.print("Digite o ID do Department: ");
        int id = sc.nextInt();

        Department depFind = departmentDao.findById(id);

        if (depFind != null) {

            System.out.println("DEPARTMENT ENCONTRADO!");
            System.out.println(depFind);

        } else {

            System.out.println("Department não encontrado!");

        }

        System.out.println();
        System.out.println(
                "--".repeat(10) +
                " TESTE 4 - DEPARTMENT FIND ALL " +
                "--".repeat(10));

        List<Department> list = departmentDao.findAll();

        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println();
        System.out.println(
                "--".repeat(10) +
                " TESTE 5 - DEPARTMENT DELETE " +
                "--".repeat(10));

        System.out.print("Digite o ID para deletar: ");
        id = sc.nextInt();

        departmentDao.deleteById(id);

        System.out.println(
                "DEPARTMENT DELETADO COM SUCESSO! ID: " + id);


        sc.close();
    }
}
