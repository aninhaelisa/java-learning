package projetosBasicos.demoDaoJDBC;

import projetosBasicos.demoDaoJDBC.model.entities.Department;

public class App {
    public static void main(String[] args) {
        Department departmentOBJ = new Department(1, "Books");
        System.out.println(departmentOBJ);
    }
}
