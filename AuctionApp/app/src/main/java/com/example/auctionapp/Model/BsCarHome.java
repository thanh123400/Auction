package com.example.auctionapp.Model;

public class BsCarHome {
    private String id;


    private String nameBs;
    private String province;
    private String typeCar;
    private int countFavourite;
    private String expBs;

    public BsCarHome() {

    }
    //test
    public BsCarHome(String nameBs, String province, String typeCar, int countFavourite) {
        this.nameBs = nameBs;
        this.province = province;
        this.typeCar = typeCar;
        this.countFavourite = countFavourite;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNameBs() {
        return nameBs;
    }

    public void setNameBs(String nameBs) {
        this.nameBs = nameBs;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public int getCountFavourite() {
        return countFavourite;
    }

    public void setCountFavourite(int countFavourite) {
        this.countFavourite = countFavourite;
    }

    public String getExpBs() {
        return expBs;
    }

    public void setExpBs(String expBs) {
        this.expBs = expBs;
    }
}
