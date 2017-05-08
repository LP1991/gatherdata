/********************** 版权声明 *************************
 * 文件名: LocationData.java
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

public class LocationData {
    private float x; //终端的横坐标
    private float y; //终端的纵坐标
    private  int z; //终端所在的map的ID

    public LocationData(float x, float y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public LocationData() {
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "LocationData{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
