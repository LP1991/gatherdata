package com.hleast.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @类名: DateUtil
 * @职责说明:
 * @创建者: Primo
 * @创建时间: 2017/4/14
 */
public class DateUtil {
    private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//小写的mm表示的是分钟
    public static Date string2date(String date) throws ParseException {
        return sdf.parse(date);
    }

    public static String date2string(Date date){
        return sdf.format(date);
    }

    public static Timestamp string2timestamp(String date) throws ParseException {
        return Timestamp.valueOf(date);
    }

    public static String date2string(Timestamp date){
        return date.toString();
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(date2string(new Date()));
        String s = date2string(new Date());
        System.out.println(string2date(s));
    }
}
