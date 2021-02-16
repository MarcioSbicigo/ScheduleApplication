package DATABASE;

import CLASSES.Usuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioBD {

    Connection conexao;

    public ResultSet autenticacaoUsuario(Usuario usuario){
        conexao = new ConexaoBD().conectarBD();

        try{
            String sql = "select * from login where user_name = ? and password = ?";

            PreparedStatement pstm = conexao.prepareStatement(sql);

            //esta linha altera a primeira interrogração do select com o nome do usuário
            pstm.setString(1, usuario.getUserName());
            //esta linha altera a segunda interrogração do select com a senha
            pstm.setString(2, usuario.getPassword());

            ResultSet rs = pstm.executeQuery(); //Retorna um Result Set com o usuário autenticado obtido.

            return rs;

        }catch (SQLException error){
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + error.getMessage());
            return null;
        }
    }
}
