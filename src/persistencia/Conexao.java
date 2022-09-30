
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    public static Connection getConexao(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306"
                    + "/ProjetoIntegrador","root","123qwe@");
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    Connection getConnection(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
