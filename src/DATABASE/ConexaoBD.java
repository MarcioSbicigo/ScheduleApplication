package DATABASE;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    public Connection conectarBD(){
        Connection conexao = null;

        try{
            String url = "jdbc:mysql://localhost:3306/agendamentos?characterEncoding=utf8";

            conexao = DriverManager.getConnection(url, "root", "");

        }catch (SQLException error){
            JOptionPane.showMessageDialog(null, "ConexaoDAO: " + error.getMessage());
        }

        return conexao;
    }
}
