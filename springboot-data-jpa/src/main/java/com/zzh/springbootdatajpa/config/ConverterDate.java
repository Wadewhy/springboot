package com.zzh.springbootdatajpa.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 钟子豪
 * @Date 2019/12/25
 * @description
 No such property: code for class: Script1
 * @Return
 */
public class ConverterDate implements Converter<String, Date> {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Override
    public Date convert(String s) {
        if (StringUtils.isEmpty(s)) {
            return null;
        }
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
