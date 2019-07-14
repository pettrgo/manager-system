package com.sicau.managersystem.POJO.DO;

import java.util.Date;

/**
 * Created By Chq ${Date}
 */
@Data
public class User {



    private String id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 电话号码
     */
    private String phone;
    /**
     * 居住地址
     */
    private String adress;
    /**
     * 是否锁定
     */
    private int locked;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 最后登入时间
     */
    private Date lastTime;
    /**
     * 是否删除状态码
     */
    private int delected;

    public User(String id, String userName, String realName, String email, String phone, String adress, int locked, Date createTime, Date updateTime, Date lastTime, int delected) {
        this.id = id;
        this.userName = userName;
        this.realName = realName;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.locked = locked;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.lastTime = lastTime;
        this.delected = delected;
    }
    public User(){

    }
}
