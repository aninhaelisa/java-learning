package projetosBasicos.atualizarDadosJDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import projetosBasicos.recuperarDadosJDBC.db.DB;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
                "UPDATE seller "
                + "SET BaseSalary = BaseSalary + ? "
                + "WHERE "
                + "(DepartmentId = ?)" );
            st.setDouble(1, 200.00);
            st.setInt(2, 2);
            
            int linhasAfetadas = st.executeUpdate();
            System.out.println("PRONTO! LINHAS AFETADAS: " + linhasAfetadas);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
