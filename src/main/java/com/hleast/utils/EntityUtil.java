/********************** 版权声明 *************************
 * 文件名: EntityUtil.java
 * 包名: com.hleast.utils
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/5
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.utils;

import java.io.*;
import java.util.*;

public class EntityUtil {
    public static final String path = "note.txt";
    public static void main(String[] args) throws IOException {
        InputStream is = EntityUtil.class.getClassLoader().getResourceAsStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        List<Property> propertyList = new ArrayList<>();
        int index = 1;
        String name = null;
        String type = null;
        String desc = null;
        String s = br.readLine();
        while (s != null){
//            System.out.println(s);
            if (s != "/n" && s != "/t" && !"".equals(s)){
                switch (index){
                    case 1:
                        name = s;
                        index++;
                        break;
                    case 2:
                        type =s;
                        index++;
                        break;
                    case 3:
                        desc = s;
                        propertyList.add(new Property(name,type,desc));
                        index = 1;
                        break;
                }
            }
            s = br.readLine();
        }
        for(Property p : propertyList){
            System.out.println(p);
        }
    }
}

class Property{
    private String name;
    private String type;
    private String desc;

    public Property(String name, String type, String desc) {
        this.name = name;
        this.type = type;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "private " +type +" "+ name+"; //"+ desc;
    }
}