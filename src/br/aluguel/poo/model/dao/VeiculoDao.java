package br.aluguel.poo.model.dao;

import br.aluguel.poo.model.entidades.Veiculo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VeiculoDao {

    Veiculo v = new Veiculo();

    ConexaoBD conecta = new ConexaoBD();

    public void addVeiculo(Veiculo v) throws SQLException {
        conecta.conectar();
        try {
            PreparedStatement stmt = conecta.conn.prepareStatement("INSERT INTO veiculo (MARCA, ANO, PLACA, TIPO, KILOMETRAGEM, MODELO, TANQUE, DISPONIBILIDADE) VALUES (?,?,?,?,?,?,?,?)");
           
            stmt.setString(1, v.getMarca());
            stmt.setString(2, v.getAno());
            stmt.setString(3, v.getPlaca());
            stmt.setString(4, v.getTipo());
            stmt.setFloat(5, v.getKilometragem());
            stmt.setString(6, v.getModelo());
            stmt.setString(7, v.getTanque());
            stmt.setString(8, v.getDisponibilidade());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Veiculo inserido com sucesso");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na inserção do veiculo");
        }
        conecta.desconectar();
    }

    public void excluir(Veiculo v) throws SQLException {
        conecta.conectar();
        try {
            PreparedStatement stmt = conecta.conn.prepareStatement("DELETE FROM veiculo WHERE id = ?");
            stmt.setString(1, v.getIdVeiculo());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Veículo excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o Veículo \n ERRO: " + ex);
        }
        conecta.desconectar();
    }

    public void alterar(Veiculo v) throws SQLException {
        try {
            conecta.conectar();
            PreparedStatement stmt = conecta.conn.prepareStatement("UPDATE veiculo SET ID = ?, MARCA = ?, ANO = ?, PLACA = ?, TIPO = ?, "
                    + "KILOMETRAGEM = ?, MODELO = ?, TANQUE = ?, DISPONIBILIDADE = ? WHERE id = " + v.getIdVeiculo());

            stmt.setString(1, v.getIdVeiculo());
            stmt.setString(2, v.getMarca());
            stmt.setString(3, v.getAno());
            stmt.setString(4, v.getPlaca());
            stmt.setString(5, v.getTipo());
            stmt.setFloat(6, v.getKilometragem());
            stmt.setString(7, v.getModelo());
            stmt.setString(8, v.getTanque());
            stmt.setString(9, v.getDisponibilidade());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Veículo alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o veículo.");
        }
    }

    public Veiculo pesquisaMarca(Veiculo v) throws SQLException {
        conecta.conectar();

        try {
            PreparedStatement stmt = conecta.conn.prepareStatement("SELECT * FROM veiculo WHERE MARCA ='" + v.getMarca() + "'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                v.setIdVeiculo(rs.getString("ID"));
                v.setMarca(rs.getString("MARCA"));
                v.setAno(rs.getString("ANO"));
                v.setPlaca(rs.getString("PLACA"));
                v.setTipo(rs.getString("TIPO"));
                v.setKilometragem(rs.getFloat("KILOMETRAGEM"));
                v.setTanque(rs.getString("TANQUE"));
                v.setDisponibilidade(rs.getString("DISPONIBILIDADE"));
                stmt.execute();
                JOptionPane.showMessageDialog(null, "Busca realizada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca de dados");

        }
        conecta.desconectar();
        return v;
    }

    public List<Veiculo> listar() throws SQLException {
        conecta.conectar();
        PreparedStatement stmt;
        ResultSet rs;

        List<Veiculo> veiculos = new ArrayList<>();

        try {
            stmt = conecta.conn.prepareStatement("SELECT ID, MARCA, MODELO, ANO, DISPONIBILIDADE FROM veiculo");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Veiculo v = new Veiculo();
                v.setIdVeiculo(rs.getString("ID"));
                v.setMarca(rs.getString("MARCA"));
                v.setModelo(rs.getString("MODELO"));
                v.setAno(rs.getString("ANO"));
                 v.setDisponibilidade(rs.getString("DISPONIBILIDADE"));
                veiculos.add(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return veiculos;
    }

 
}
