package com.zzh.springbootproperties.pojo;

/**
 * @PACKAGE_NAME: com.zzh.springboothello.pojo
 * @NAME: User
 * @Author: 钟子豪
 * @DATE: 2019/12/20
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 20
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: springboot
 **/
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component//将组件添加到Spring容器
@PropertySource(value = "classpath:application.properties",encoding = "utf-8")
@ConfigurationProperties(prefix = "user")//属性进行映射
public class User {

    private String userName;
    private boolean isAdmin;
    private Date regTime;
    private Long isOnline;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Address address;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", isAdmin=" + isAdmin +
                ", regTime=" + regTime +
                ", isOnline=" + isOnline +
                ", maps=" + maps +
                ", lists=" + lists +
                ", address=" + address +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Long getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Long isOnline) {
        this.isOnline = isOnline;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
