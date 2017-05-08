/********************** 版权声明 *************************
 * 文件名: CoverageInfo.java
 * 包名: com.hleast.bean
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/4
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.bean;

public class CoverageInfo {
    private int id;   //覆盖区域ID
    private String name;  //覆盖区域名称

    public CoverageInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CoverageInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    <servlet>
//        <servlet-name>Jersey REST Service</servlet-name>
//        <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
//        <init-param>
//            <param-name>com.sun.jersey.config.property.packages</param-name>
//            <param-value>com.hleast.jersey</param-value>
//        </init-param>
//        <load-on-startup>1</load-on-startup>
//    </servlet>
//    <servlet-mapping>
//        <servlet-name>Jersey REST Service</servlet-name>
//        <url-pattern>/rest/*</url-pattern>
//    </servlet-mapping>
}
