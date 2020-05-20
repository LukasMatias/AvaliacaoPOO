package br.aluguel.poo.model.dao;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {

    public Statement st; 
    public ResultSet rs; 
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String CAMINHO = "jdbc:mysql://localhost:3306/locadorabd?useTimeZone=true&serverTimezone=UTC";
    private final String USER = "root";
    private final String SENHA = "";
    public Connection conn;

   
    public void conectar() throws SQLException {
        try {
            System.setProperty("jdbc.Drivers", DRIVER);
            conn = DriverManager.getConnection(CAMINHO,USER,SENHA);
           // JOptionPane.showMessageDialog(null, "Conectado ao banco de dados");
        } catch (SQLException ex) {
           // JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados" + ex.getMessage());
        }
    }
    
    public void executaSQL(String sql) {
        try {
            st = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro no executaSQL " + ex.getMessage());
        }
    }
    
    public void desconectar() {
        try {
            conn.close(); // fecha o BD
           // JOptionPane.showMessageDialog(null, "BD desconctado com sucesso! ");
        } catch (SQLException ex) {
           // JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o BD: " + ex.getMessage());
        }

    }

}
