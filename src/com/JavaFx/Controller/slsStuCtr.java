package src.com.JavaFx.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import src.com.DAO.POLO.Store;
import src.com.DAO.POLO.Students;

public class slsStuCtr {

    @FXML
    private TextField id;
    @FXML
    private TextField commodityName;
    @FXML
    private TextField price;
    @FXML
    private TextField birDate;
    @FXML
    private TextField expDate;
    @FXML
    private TextField ecpDate;

    @FXML
    private void selstu() {

    }

    private static Store store = null;

    @FXML
    private void initialize() {

        if (store != null) {
            id.setText(String.valueOf(store.getId()));
            commodityName.setText(store.getCommodityName());
            price.setText(String.valueOf(store.getPrice()));
            birDate.setText(String.valueOf(store.getBirDate()));
            expDate.setText(String.valueOf(store.getExpDate()));

        } else {
            commodityName.setText("null");
        }
    }

    public static void showstu(Store sto) {
        slsStuCtr.store = sto;

    }

}
