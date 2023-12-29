package src.com.JavaFx.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import src.com.DAO.POLO.login;
import src.com.DAO.dao.loginDao;
import src.com.JavaFx.Main;

import java.sql.SQLException;

public class Logincontroller {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginbutton;

    @FXML
    private Label errormsg;

    @FXML
    private void dologin() throws SQLException {
        String text = username.getText();
        String pw = password.getText();
        loginDao loginDao = new loginDao();
        String sql = "select Username,Password ,UserType from users where Username=?";
        login log = loginDao.QuerySing(sql, login.class, pw);

        if (text.equals(log.getUsername()) && pw.equals(log.getPassword())) {
            errormsg.setText("登陆成功");
            Main.mainView("View/Teacherview.fxml");
            errormsg.setText("请输入正确的账号和密码");
            errormsg.setVisible(true);
            return;
        }
    }

    @FXML
    public void regest()
    {
        Main.changeView("View/regest.fxml");
    }


}
