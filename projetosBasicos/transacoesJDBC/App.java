package projetosBasicos.transacoesJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import projetosBasicos.recuperarDadosJDBC.db.DB;
import projetosBasicos.recuperarDadosJDBC.db.DbException;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false);
            st = conn.createStatement();
            int linhas1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            int x = 1;
            if (x < 2) {
                throw new SQLException("ERRO FALSO");
            }

            int linhas2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
            conn.commit();

            System.out.println("LINHA 1: " + linhas1);
            System.err.println("LINHA 2: " + linhas2);

        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new DbException("TRANSACAO VOLTOU! CAUSADO POR: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbException("erro ao tentar voltar! erro: " + e.getMessage());

            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
