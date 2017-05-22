/********************** 版权声明 *************************
 * 文件名: CommonUtil.java
 * 包名: com.hleast.utils
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/15
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.utils;

import com.hleast.bean.park.PersonInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class CommonUtil {
    private static Random n = new Random();
    public static final String path = "name";
    private static List<PersonInfo> persons = null;
    public static long getNum(int i) {
        long t = 1;
        for (int j = 0; j < i; j++) {
            t = (t+n.nextInt(10))*10;
        }
        return t;
    }

    public static String getIDNum(){
        String str1_6[]={"330382","330382","330382","330382","330382"};

//年龄需要满18周岁
        String  str7_9[]={"189","178","168","158"};

        String str10=String.valueOf((int)(Math.random()*9+1));
        System.err.println("str10:"+str10);
        String str10_12=String.valueOf((int)(Math.random()*12+1));
        if(Integer.parseInt(str10_12)<10){
            str10_12="0"+str10_12;
        }
        System.err.println("str10_12:"+str10_12);
        String str12_14=String.valueOf((int)(Math.random()*27+1));
        if(Integer.parseInt(str12_14)<10){
            str12_14="0"+str12_14;
        }
        System.err.println("str12_14:"+str12_14);
        String str14_17=String.valueOf((int)(Math.random()*999+1));
        if(Integer.parseInt(str14_17)<10){
            str14_17="00"+str14_17;
        }

        if(Integer.parseInt(str14_17)<100&&Integer.parseInt(str14_17)>=10){
            str14_17="0"+str14_17;
        }
        System.err.println("str14_17:"+str14_17);
        int m=(int) (Math.random()*17+1);
        int n=(int) (Math.random()*4);
        String tempStr=str1_6[1]+str7_9[n]+str10+str10_12+str12_14+str14_17;

        //7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2 2
        int tempInt=Integer.parseInt(String.valueOf(tempStr.charAt(0)))*7+
                Integer.parseInt(String.valueOf(tempStr.charAt(1)))*9+
                Integer.parseInt(String.valueOf(tempStr.charAt(2)))*10+
                Integer.parseInt(String.valueOf(tempStr.charAt(3)))*5+
                Integer.parseInt(String.valueOf(tempStr.charAt(4)))*8+
                Integer.parseInt(String.valueOf(tempStr.charAt(5)))*4+
                Integer.parseInt(String.valueOf(tempStr.charAt(6)))*2+
                Integer.parseInt(String.valueOf(tempStr.charAt(7)))+
                Integer.parseInt(String.valueOf(tempStr.charAt(8)))*6+
                Integer.parseInt(String.valueOf(tempStr.charAt(9)))*3+
                Integer.parseInt(String.valueOf(tempStr.charAt(10)))*7+
                Integer.parseInt(String.valueOf(tempStr.charAt(11)))*9+
                Integer.parseInt(String.valueOf(tempStr.charAt(12)))*10+
                Integer.parseInt(String.valueOf(tempStr.charAt(13)))*5+
                Integer.parseInt(String.valueOf(tempStr.charAt(14)))*8+
                Integer.parseInt(String.valueOf(tempStr.charAt(15)))*4+
                Integer.parseInt(String.valueOf(tempStr.charAt(16)))*2;
//        System.err.println("tempInt:"+tempInt);
        String MapArray[]={"1","0","X","9","8","7","6","5","4","3","2"};
        String  parityBit=MapArray[tempInt%11];
//        System.err.println("校验位："+parityBit);
        String ResultIDCard=tempStr+parityBit;
//        System.out.println("模拟身份证号："+ResultIDCard);
        return ResultIDCard;
    }
    public static PersonInfo getName() throws IOException {
        if (persons == null){
            InputStream is = CommonUtil.class.getClassLoader().getResourceAsStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            persons = new ArrayList<>();

            int index = 1;
            String name = null;
            String type = null;
            String desc = null;
            String s = br.readLine();
            while (s != null){
                PersonInfo info = new PersonInfo();
                if (s != "/n" && s != "/t" && !"".equals(s)){
                    String[] ss = s.split("\\s+");
                    info.setEnglishName(ss[0]);
                    info.setName(ss[1]);
//                System.out.println(info.getEnglishName()+" "+info.getName());
                }
                persons.add(info);
                s = br.readLine();
            }
        }
        return persons.get(n.nextInt(persons.size()));
    }

    public static String getDate() throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long time = System.currentTimeMillis();
        time = time - n.nextInt(7)*24*60*60*1000-n.nextInt(24)*60*60*1000-
                n.nextInt(60)*60*1000-n.nextInt(60)*1000;
        Date d = new Date(time);
        String s  = sdf.format(d);
        return s;
    }

    public static String getDateNum() throws IOException {
        long time = System.currentTimeMillis();
        time = time - n.nextInt(7)*24*60*60*1000-n.nextInt(24)*60*60*1000-
                n.nextInt(60)*60*1000-n.nextInt(60)*1000;
        return time+"";
    }

    public static String getDateNum(Long time,int sign) throws IOException {
        if (sign == 0){
            time = time + n.nextInt(7)*24*60*60*1000+n.nextInt(24)*60*60*1000-
                    n.nextInt(60)*60*1000+n.nextInt(60)*1000;
        }else {
            time = time - n.nextInt(7) * 24 * 60 * 60 * 1000 - n.nextInt(24) * 60 * 60 * 1000 -
                    n.nextInt(60) * 60 * 1000 - n.nextInt(60) * 1000;
        }
        return time+"";
    }

    public static void main(String[] args) throws Exception{
//        getIDNum();
//        System.out.println(getName().getEnglishName());
//        System.out.println(getName().getName());
        System.out.println(getDate());
    }
}
