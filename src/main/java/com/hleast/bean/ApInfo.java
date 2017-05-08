/********************** 版权声明 *************************
 * 文件名: ApInfo.java
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

public class ApInfo {
    private String mac; //AP的mac地址
    private float x;  //AP的横坐标
    private float y;  //AP的纵坐标

    public ApInfo() {
    }

    public ApInfo(String mac, float x, float y) {
        this.mac = mac;
        this.x = x;
        this.y = y;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ApInfo{" +
                "mac='" + mac + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
