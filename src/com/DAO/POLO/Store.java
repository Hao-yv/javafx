package src.com.DAO.POLO;

import java.util.Date;

public class Store {

    private Integer id;
    private String commodityName;   //货物名
    private Integer price;           //价格
    private Date birDate;           //生产日期
    private Date expDate;           //过期日期
    private Integer ecpDate;        //保质期

    public Store() {
    }

    public Store(Integer id, String commodityName, Integer price, Date birDate, Date expDate, Integer ecpDate) {
        this.id = id;
        this.commodityName = commodityName;
        this.price = price;
        this.birDate = birDate;
        this.expDate = expDate;
        this.ecpDate = ecpDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getBirDate() {
        return birDate;
    }

    public void setBirDate(Date birDate) {
        this.birDate = birDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Integer getEcpDate() {
        return ecpDate;
    }

    public void setEcpDate(Integer ecpDate) {
        this.ecpDate = ecpDate;
    }
}
