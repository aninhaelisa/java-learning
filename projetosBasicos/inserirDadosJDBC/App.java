package projetosBasicos.inserirDadosJDBC;

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
        SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
                "INSERT INTO seller "
                + "(Name, Email, BirthDate, BaseSalary, DepartmentId)" 
                + "VALUES "
                + "(?,?,?,?,?)",
            Statement.RETURN_GENERATED_KEYS);
            st.setString(1, "Carl Purple");
            st.setString(2, "carl@email.com");
            st.setDate(3, new java.sql.Date(sdf.parse("19/09/2006").getTime()));
            st.setDouble(4, 3000.00);
            st.setInt(5, 4);

            int linhasAfetadas = st.executeUpdate();

            if(linhasAfetadas>0){
                ResultSet rs = st.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("PRONTO! ID: " + id);
                }
            }else{
                System.out.println("Nenhuma linha afetada");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ParseException e){
            e.printStackTrace();
        }finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
