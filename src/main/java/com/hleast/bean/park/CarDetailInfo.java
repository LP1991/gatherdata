/********************** 版权声明 *************************
 * 文件名: CarDetailInfo.java
 * 包名: com.hleast.bean.park
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/15
 * 文件版本：V1.0
 *
 *******************************************************/
package com.hleast.bean.park;

public class CarDetailInfo {
    private String plateNo; //车牌号码 车牌号码, allow null:否
    private Integer ownerId; //车主 ID, allow null:否
    private String driver; //驾驶员姓名 驾驶员姓名, allow null:否
    private String driverPhone; //驾驶员电话 驾驶员电话, allow null:是
    private String indexCode; //车辆系统唯一标识 车辆系统唯一标识 车辆系统唯一标识 车辆系统唯一标识, allow null:否
    private Integer cardNo; //卡号, allow null:是
    private Integer color; //车辆颜色类型码 车辆颜色类型码 车辆颜色类型码, allow null:是
    private String colorName; //车辆颜色名称 车辆颜色名称 车辆颜色名称, allow null:是
    private Integer carType; //车辆类型码 车辆类型码, allow null:否
    private String carTypeName; //车辆类型名称 车辆类型名称 车辆类型名称, allow null:是
    private Integer plateColor; //车牌颜色类型码 车牌颜色类型码 车牌颜色类型码, allow null:否
    private String plateColorName; //车牌颜色名称 车牌颜色名称 车牌颜色名称, allow null:是
    private Integer plateType; //车牌类型码 车牌类型码, allow null:否
    private String plateTypeName; //车牌类型名称 车牌类型名称 车牌类型名称, allow null:是
    private String plateStart; //车牌发照日期， 车牌发照日期， 车牌发照日期， 车牌发照日期， LongLong 型数字 （毫秒 值）, allow null:是
    private String carBrand; //车辆品牌 车辆品牌, allow null:是
    private Integer num; //车辆核定载客数 车辆核定载客数 车辆核定载客数, allow null:是
    private String createTime; //创建时间 创建时间 ，LongLong 型数字（毫秒 型数字（毫秒 型数字（毫秒 型数字（毫秒 值）, allow null:是
    private String updateTime; //修改时间 修改时间 ，LongLong 型数字（毫秒 型数字（毫秒 型数字（毫秒 型数字（毫秒 值）, allow null:是

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getIndexCode() {
        return indexCode;
    }

    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }

    public Integer getCardNo() {
        return cardNo;
    }

    public void setCardNo(Integer cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public Integer getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(Integer plateColor) {
        this.plateColor = plateColor;
    }

    public String getPlateColorName() {
        return plateColorName;
    }

    public void setPlateColorName(String plateColorName) {
        this.plateColorName = plateColorName;
    }

    public Integer getPlateType() {
        return plateType;
    }

    public void setPlateType(Integer plateType) {
        this.plateType = plateType;
    }

    public String getPlateTypeName() {
        return plateTypeName;
    }

    public void setPlateTypeName(String plateTypeName) {
        this.plateTypeName = plateTypeName;
    }

    public String getPlateStart() {
        return plateStart;
    }

    public void setPlateStart(String plateStart) {
        this.plateStart = plateStart;
    }


    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
