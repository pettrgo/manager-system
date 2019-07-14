package com.sicau.managersystem.POJO.DO;

import java.util.Date;

/**
 * Created By Chq ${Date}
 */

public class Device {

    private String id;
    private String name;
    private String brand;
    private double price;
    private Date createTime;
    private Date updateTime;


    public Device(String id, String name, String brand, double price, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Device() {
    }


}
