package com.zzh.springbootproperties.pojo;

/**
 * @PACKAGE_NAME: com.zzh.springboothello.pojo
 * @NAME: Address
 * @Author: 钟子豪
 * @DATE: 2019/12/20
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 20
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: springboot
 **/
public class Address {
    private String tel;
    private String name;

    @Override
    public String toString() {
        return "Address{" +
                "tel='" + tel + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
