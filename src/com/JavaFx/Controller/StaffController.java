package src.com.JavaFx.Controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import src.com.DAO.POLO.Store;
import src.com.DAO.POLO.Students;
import src.com.DAO.dao.StoreDao;
import src.com.DAO.dao.StudentsDao;
import src.com.JavaFx.Main;

import java.sql.SQLException;
import java.util.List;

import static src.com.DAO.dao.StoreDao.*;

public class StaffController {

    @FXML
    private TableView<Store> tabelview;
    @FXML
    private TableColumn<Store, String> id;
    @FXML
    private TableColumn<Store, String> commodityName;
    @FXML
    private TableColumn<Store, String> price;
    @FXML
    private TableColumn<Store, String> birDate;
    @FXML
    private TableColumn<Store, String> expDate;
    @FXML
    private TableColumn<Store, Integer> ecpDate;

    @FXML
    private TextField getname;

    @FXML
    public void initialize() throws SQLException {
        getdatas();
    }


    private void getdatas() throws SQLException {
        StoreDao storeDao = new StoreDao();
        String sql = "select*from goods";
        List<Store> store = storeDao.queueMulti(sql, Store.class, null);

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        commodityName.setCellValueFactory(new PropertyValueFactory<>("commodityName"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        birDate.setCellValueFactory(new PropertyValueFactory<>("birDate"));
        expDate.setCellValueFactory(new PropertyValueFactory<>("expDate"));
        ecpDate.setCellValueFactory(new PropertyValueFactory<>("ecpDate"));
        tabelview.setItems(FXCollections.observableList(store));

    }

    @FXML
    private void outlogin() {

        Main.mainView("View/Login.fxml");
    }

    @FXML
    private void insertstu() {
        Main.changeView("View/AddStuview.fxml");
    }

    @FXML
    private void deletestu() throws SQLException {

       Store store = tabelview.getSelectionModel().getSelectedItem();
        if (store != null) {
            StudentsDao studentsDao = new StudentsDao();
            String sql = "delete from students where name=?";
            studentsDao.update(sql, store.getCommodityName());
        }

        getdatas();
    }

    @FXML
    private void updatestu() {//修改信息
        Store store = tabelview.getSelectionModel().getSelectedItem();
        if (store != null) {
            UpdataStuview.setCurrent(store);
            Main.changeView("View/UpdataStuview.fxml");
        }
    }

    @FXML
    private void refresh() throws SQLException {
        getdatas();
    }

    @FXML
    private void seletestu() throws SQLException {//准确查找单个学生

        //todo 先关闭
        if (!getname.getText().equals("")) {
            System.out.println(getname.getText());
            StoreDao storeDao = new StoreDao();
            String sql ="select*from goods where name=?";
            Store store = storeDao.QuerySing(sql, Store.class, getname.getText());
            slsStuCtr.showstu(store);
            Main.changeView("View/selete_singe_Stuview.fxml");
        }

    }

}
