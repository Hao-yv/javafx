package src.com.JavaFx.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import src.com.DAO.POLO.Students;
import src.com.DAO.dao.StudentsDao;
import src.com.JavaFx.Main;

import java.sql.SQLException;

public class AddStuview {

    @FXML
    private TextField name;
    @FXML
    private TextField sex;
    @FXML
    private TextField age;
    @FXML
    private TextField prf;
    @FXML
    private TextField scid;

    @FXML
    public void initialize() {

    }

    @FXML
    public void addstu() throws SQLException {

        StudentsDao studentsDao = new StudentsDao();
        String sql = "insert into students(name,sex,age,major,studentid)" + "values(?,?,?,?,?)";
        int insert = studentsDao.update(sql, name.getText(), sex.getText(),
                age.getText(),prf.getText(), scid.getText());

    }

}
