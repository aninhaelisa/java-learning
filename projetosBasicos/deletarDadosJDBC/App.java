package projetosBasicos.deletarDadosJDBC;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import projetosBasicos.deletarDadosJDBC.db.DbIntegrityException;
import projetosBasicos.recuperarDadosJDBC.db.DB;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
                "DELETE FROM department " 
                + "WHERE "
                + "Id = ?" );
            
            st.setInt(1, 2);
            
            int linhasAfetadas = st.executeUpdate();
            System.out.println("PRONTO! LINHAS AFETADAS: " + linhasAfetadas);
        }catch(SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }finally{
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
