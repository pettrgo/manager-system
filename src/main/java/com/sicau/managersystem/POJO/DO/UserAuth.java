package com.sicau.managersystem.POJO.DO;

import java.util.Date;

/**
 * Created By Chq ${Date}
 */
public class UserAuth {

    private String id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 登入认证类型，0：用户密码登入，1：微信登入
     */
    private int identifyType;
    /**
     * 标识（手机号 邮箱 用户名或第三方应用的唯一标识）
     */
    private String identifier;
    /**
     * 登录凭证
     */
    private String credential;
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
}
