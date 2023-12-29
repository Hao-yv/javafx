package src.com.JavaFx.Controller;

import com.mysql.jdbc.JDBC4CallableStatement;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import src.com.DAO.POLO.login;
import src.com.DAO.Utils.JDBCUtilsByDruid;
import src.com.DAO.dao.loginDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Regest {
    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
     public void notarize() throws SQLException {

         loginDao loginDao = new loginDao();
         String sql = "insert into users( username, password )  values (?, ?)";
         PreparedStatement prepared = JDBCUtilsByDruid.getConn().prepareStatement(sql);

         int update = loginDao.update(sql, username.getText(),password.getText());

     }
}
