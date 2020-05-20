
package br.aluguel.poo.model.services;

import br.aluguel.poo.model.dao.VeiculoDao;
import br.aluguel.poo.model.entidades.Veiculo;
import java.sql.SQLException;
import java.util.List;

public class VeiculoService {
    VeiculoDao dao = new VeiculoDao();
    
     public void incluir(Veiculo v) throws SQLException {
        if (v != null && v.getMarca() != null) {
            dao.addVeiculo(v);
        }
    }

    public List<Veiculo> listar() throws SQLException {
        return dao.listar();
    }
    
      public void excluir(Veiculo v) throws SQLException {
         dao.excluir(v);
    }
      
      public void pesquisar(Veiculo v ) throws SQLException{
          
          dao.pesquisaMarca(v);
      }
      
      public void alterar(Veiculo v ) throws SQLException{
          dao.alterar(v);
      }


}
