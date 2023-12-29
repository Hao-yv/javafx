package src.com.JavaFx.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import src.com.DAO.POLO.Store;
import src.com.DAO.POLO.Students;
import src.com.DAO.dao.StudentsDao;

import java.sql.SQLException;

public class UpdataStuview {

    @FXML
    private TextField id;
    @FXML
    private TextField  commodityName;
    @FXML
    private TextField price;
    @FXML
    private TextField birDate;
    @FXML
    private TextField expDate;
    @FXML
    private TextField ecpDate;   ;
    @FXML
    private TextField cls;

    private static Store current;

    public static void setCurrent(Store current) {
        UpdataStuview.current = current;
    }

    @FXML
    private void updatebutton() throws SQLException {
        StudentsDao studentsDao = new StudentsDao();
        String sql="UPDATE students set name=?,sex=?,age=?,major=? where studentid=?";
        int update = studentsDao.update(sql, id.getText(), commodityName.getText(), price.getText(),birDate.getText(),ecpDate.getText());
        System.out.println(update);
    }

    @FXML
    public void initialize() {
        //todo 回显数据
        id.setText(String.valueOf(current.getId()));
        commodityName.setText(current.getCommodityName());
        price.setText(String.valueOf(current.getPrice()));//这样是可以的
        ecpDate.setText(String.valueOf(current.getEcpDate()));
        ecpDate.setText(String.valueOf(current.getExpDate()));

    }


}
