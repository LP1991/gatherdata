/********************** 版权声明 *************************
 * 文件名: ObstacleInfo.java
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
import java.util.List;

public class ObstacleInfo {
    private String obstacleID; //障碍物的ID
    private int attenuation; //障碍物衰减值
    private float thickness;   //障碍物厚度值
    private int shape;  //障碍物形状
    private float width;  //障碍物宽
    private float height;  //障碍物高
    private List<Point> points;  //障碍物位置信息列表

    public ObstacleInfo(String obstacleID, int attenuation, float thickness, int shape, float width, float height) {
        this.obstacleID = obstacleID;
        this.attenuation = attenuation;
        this.thickness = thickness;
        this.shape = shape;
        this.width = width;
        this.height = height;
    }

    public ObstacleInfo() {
    }

    public String getObstacleID() {
        return obstacleID;
    }

    public void setObstacleID(String obstacleID) {
        this.obstacleID = obstacleID;
    }

    public int getAttenuation() {
        return attenuation;
    }

    public void setAttenuation(int attenuation) {
        this.attenuation = attenuation;
    }

    public float getThickness() {
        return thickness;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    public int getShape() {
        return shape;
    }

    public void setShape(int shape) {
        this.shape = shape;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "ObstacleInfo{" +
                "obstacleID='" + obstacleID + '\'' +
                ", attenuation=" + attenuation +
                ", thickness=" + thickness +
                ", shape=" + shape +
                ", width=" + width +
                ", height=" + height +
                ", points=" + points +
                '}';
    }
}
